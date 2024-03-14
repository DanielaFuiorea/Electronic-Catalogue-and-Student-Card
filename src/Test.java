import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        University uni;
        try
        {
            FileInputStream fis = new FileInputStream("SURSE/infos/catalog.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            uni = (University) ois.readObject();
            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("\nTest 1: Facultati\n");

        int n;
        n = 1;
        for(Faculty i : uni.getFaculty()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 2: Specializari\n");
        n = 1;
        for(Faculty i : uni.getFaculty())
            for(Department j : i.getDepartment()){
            System.out.println(n + ":\n" + j);
            n++;
        }

        System.out.println("\n\n\nTest 3: Profesori\n");
        n = 1;
        for(Teacher i : uni.getCatalog().getTeachers()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 4: Asistenti\n");
        n = 1;
        for(Assistant i : uni.getCatalog().getAssistants()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 5: Studenti\n");
        n = 1;
        for(Student i : uni.getCatalog().getStudents()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 6: Observatori\n");
        n = 1;
        for(Observer i : uni.getCatalog().getObservers()){
            System.out.println(n + ":\n" + i);
            n++;
        }



        System.out.println("\n\n\nTest 7: Observatori dupa eliminare\n");
        System.out.println("Observatorul eliminat:" + uni.getCatalog().getObservers().get(1));
        uni.getCatalog().removeObserver(uni.getCatalog().getObservers().get(1));
        n = 1;
        for(Observer i : uni.getCatalog().getObservers()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 8: Cursuri\n");
        n = 1;
        for(Course i : uni.getCatalog().getCourses()){
            System.out.println(n + ":\n" + i);

            i.makeBackup();
            n++;
        }

        System.out.println("\n\n\nTest 9: Adaugare de note la cursul \"Limbajul CSS\"\n");
        Course course = uni.getCatalog().getCourse("Limbajul CSS");
        Random rand = new Random();

        for(Student i : course.getAllStudents()){
            Grade grade = new Grade(course.getName(), i);
            grade.setExamScore(rand.nextDouble(4));
            grade.setTeacher(course.getTeacher());
            uni.getCatalog().notifyObservers(grade);
            course.addGrade(grade);
            grade = new Grade(course.getName(), i);
            grade.setPartialScore(rand.nextDouble(6));
            grade.setAssistant(course.getStudentGroup(i).getAssistant());
            uni.getCatalog().notifyObservers(grade);
            course.addGrade(grade);
        }

        for(Course i : uni.getCatalog().getCourses())
            if(i.getName().equals(course.getName()))
                i = course;

        System.out.println(uni.getCatalog().getCourse("Limbajul CSS"));

        System.out.println("\nCel mai bun student:" + uni.getCatalog().getCourse("Limbajul CSS").getBestStudent());
        System.out.println("\nStudentii absolventi:" + uni.getCatalog().getCourse("Limbajul CSS").getGraduatedStudents());
        System.out.println("\nStudentii cu nota validata de profesor:" + uni.getCatalog().getCourse("Limbajul CSS").getTeacherValidatedGrades(uni.getCatalog().getCourse("Limbajul CSS").getTeacher()));
        System.out.println("\nStudentii cu nota validata de asistent:" + uni.getCatalog().getCourse("Limbajul CSS").getAsistantValidatedGrades(uni.getCatalog().getCourse("Limbajul CSS").getAssistants().get(0)));
        n = 1;
        for(Observer i : uni.getCatalog().getObservers()){
            System.out.println(n + ":\n" + i);
            n++;
        }

        System.out.println("\n\n\nTest 10: Adaugare de note folosind scoreVisitor\n");

        Catalog catalog = Catalog.getInstance();
        catalog = uni.getCatalog();

        HashMap<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> examScores = catalog.getExamScores();
        HashMap<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> partialScores = catalog.getPartialScores();

        Visitor v = new ScoreVisitor(examScores, partialScores);

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Assistant> assistants = new ArrayList<>();

        for (Map.Entry<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : examScores.entrySet()){
            teachers.add(i.getKey());
        }

        for (Map.Entry<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : partialScores.entrySet()){
            assistants.add(i.getKey());
        }


        for(Teacher i : teachers) {
            v.visit(i, catalog);
        }

        for(Assistant i : assistants)
            v.visit(i, catalog);


        System.out.println("Catalog actualizat:" + catalog);

        n = 1;
        for(Observer i : uni.getCatalog().getObservers()){
            System.out.println(n + ":\n" + i);
            n++;
        }


        System.out.println("\n\n\nTest 11: Backup\n");
        for(Course i : uni.getCatalog().getCourses()){
            i.undo();
        }

        System.out.println(uni.getCatalog());



        System.out.println("\n\n\n(Bonus) Test 12: Grupa\n");


        Group group2 = catalog.getCourse("Limbajul HTML").getGroup("FED");
        System.out.println("Grupa serializabila (fara comparator):" + group2);
        Group_Original_Not_Serializable group1 = new Group_Original_Not_Serializable(group2.getId(), group2.getAssistant());
        for(Student i : group2.getStudents())
            group1.addStudent(i);

        System.out.println("\nGrupa neserializabila (cu comparator):" + group1);


    }
}
