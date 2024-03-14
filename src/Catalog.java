import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog implements Subject, Serializable {
    private ArrayList<Course> courses;
    private ArrayList<Observer> observers;

    private HashMap<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> examScores;
    private HashMap<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> partialScores;

    private static Catalog catalog_instance = null;

    //returneaza dictionarul cu notele din examen de validat
    public HashMap<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> getExamScores() {
        return examScores;
    }

    //sterge un triplet din lista cu notele din examen de validat
    public void removeExamScore(ScoreVisitor.Triplet<Student, String, Double> examScore){
        for (Map.Entry<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : examScores.entrySet()){
            ArrayList<ScoreVisitor.Triplet<Student, String, Double>> list = new ArrayList<>();
            for(ScoreVisitor.Triplet<Student, String, Double> j : i.getValue())
                if(!j.equals(examScore))
                    list.add(j);
            i.setValue(list);

        }
    }

    //sterge un triplet din lista cu notele de activitate de validat
    public void removePartialScore(ScoreVisitor.Triplet<Student, String, Double> partialScore){
        for (Map.Entry<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : partialScores.entrySet()){
            ArrayList<ScoreVisitor.Triplet<Student, String, Double>> list = new ArrayList<>();
            for(ScoreVisitor.Triplet<Student, String, Double> j : i.getValue())
                if(!j.equals(partialScore))
                    list.add(j);
            i.setValue(list);

        }
    }

    //returneaza dictionarul cu notele de activitate de validat
    public HashMap<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> getPartialScores() {
        return partialScores;
    }

    //constructorul
    private Catalog(){
        observers = new ArrayList<>();
        courses = new ArrayList<>();
        examScores = new HashMap<>();
        partialScores = new HashMap<>();
    }

    //returneaza instanta catalogului
    public static  Catalog getInstance() {
        if(catalog_instance == null) {
            catalog_instance = new Catalog();
        }
        return catalog_instance;
    }

    //afisare
    public String toString() {
        String s = "Catalog:\n";
        for (Course i: courses) {
            s = s + i.toString() + "\n ";
        }
        return s;
    }

    //adauga un curs
    public void addCourse(Course course) {
        courses.add(course);
    }

    //sterge un curs
    public void removeCourse(Course course){
        courses.remove(course);
    }

    //aboneaza un parinte la catalog
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //dezaboneaza un parinte la catalog
    public void removeObserver(Observer observer) {
        ArrayList<Observer> observers1 = new ArrayList<>();
        for(Observer i : observers)
            if(!((Parent)i).getCNP().equals(((Parent)observer).getCNP()))
                observers1.add(i);
        observers = observers1;
    }

    //returneaza toti parinti abonati
    public ArrayList<Observer> getObservers() {
        return observers;
    }

    //returneaza o lista cu notele pe care trebuie sa le valideze un profesor la un curs
    public ArrayList<ScoreVisitor.Triplet<Student, String, Double>> getTeacherTODO(Teacher teacher, String courseName){
        ArrayList<ScoreVisitor.Triplet<Student, String, Double>> list = new ArrayList<>();

        for (Map.Entry<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : examScores.entrySet()){
            if (i.getKey().getCNP().equals(teacher.getCNP())){
                for(ScoreVisitor.Triplet<Student, String, Double> j : i.getValue()){
                    if(j.getValue1().equals(courseName)){
                        list.add(j);
                    }
                }
            }
        }

        return list;
    }

    //sterge notele deja validate din dictionarul cu note din examen
    public void removeTeacherTODO(Teacher teacher, ScoreVisitor.Triplet<Student, String, Double> item){
        for (Map.Entry<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : examScores.entrySet()){
            if (i.getKey().getCNP().equals(teacher.getCNP())){
                i.getValue().remove(item);
            }
        }
    }

    //returneaza o lista cu notele pe care trebuie sa le valideze un asistent la un curs
    public ArrayList<ScoreVisitor.Triplet<Student, String, Double>> getAssistantTODO(Assistant assistant, String courseName){
        ArrayList<ScoreVisitor.Triplet<Student, String, Double>> list = new ArrayList<>();

        for (Map.Entry<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : partialScores.entrySet()){
            if (i.getKey().getCNP().equals(assistant.getCNP())){
                for(ScoreVisitor.Triplet<Student, String, Double> j : i.getValue()){
                    if(j.getValue1().equals(courseName)){
                        list.add(j);
                    }
                }
            }
        }

        return list;
    }

    //sterge notele deja validate din dictionarul cu note din activitate
    public void removeAssistantTODO(Assistant assistant, ScoreVisitor.Triplet<Student, String, Double> item){
        for (Map.Entry<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> i : partialScores.entrySet()){
            if (i.getKey().getCNP().equals(assistant.getCNP())){
                i.getValue().remove(item);
            }
        }
    }

    //seteaza dictionarul cu note de validat pentru activitate
    public void setPartialScores(HashMap<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> partialScores) {
        this.partialScores = partialScores;
    }

    //seteaza dictionarul cu note de validat pentru examen
    public void setExamScores(HashMap<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> examScores) {
        this.examScores = examScores;
    }

    //parintii abonati primesc o notificare cand copilul lor primeste o nota noua
    public void notifyObservers(Grade grade) {
        for (Observer i: observers) {
            if(grade.getStudent().getMother() == i) {
                i.update(new Notification(grade));
            }
            if(grade.getStudent().getFather() == i) {
                i.update(new Notification(grade));
            }
        }
    }

    //returneaza cursul cu numele dat
    public Course getCourse(String name) {
        for (Course course: courses) {
            if(course.name.equals(name)) {
                return course;
            }
        }
        return null;
    }

    //returneaza o lista cu cursurile din catalog
    public ArrayList<Course> getCourses(){
        return courses;
    }

    //returneaza o lista cu toate cursurile unui profesor
    public ArrayList<Course> getTeacherCourses(Teacher teacher){
        ArrayList<Course> courses2 = new ArrayList<>();
        for(Course i : courses)
            if(i.getTeacher().getCNP().equals(teacher.getCNP()))
                courses2.add(i);
        return courses2;
    }

    //returneaza o lista cu toate cursurile unui student
    public ArrayList<Course> getStudentCourses(Student student){
        ArrayList<Course> courses2 = new ArrayList<>();
        for(Course i : courses)
            for(Student j : i.getAllStudents())
            if(j.getCNP().equals(student.getCNP()))
                courses2.add(i);
        return courses2;
    }

    //returneaza o lista cu toate cursurile unui asistent
    public ArrayList<Course> getAssistantCourses(Assistant assistant){
        ArrayList<Course> courses2 = new ArrayList<>();
        for(Course i : courses)
            for(Assistant j : i.getAssistants())
                if(j.getCNP().equals(assistant.getCNP()))
                    courses2.add(i);
        return courses2;
    }

    //returneaza o lista cu toti profesorii
    public ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Course i : courses)
            if (!teachers.contains(i.getTeacher()))
                teachers.add(i.getTeacher());
        return teachers;
    }

    //returneaza o lista cu toti studentii
    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        for (Course i : courses)
            for (Student j : i.getAllStudents())
                if (!students.contains(j))
                    students.add(j);
        return students;
    }

    //returneaza o lista cu toti asistentii
    public ArrayList<Assistant> getAssistants() {
        ArrayList<Assistant> assistants = new ArrayList<>();
        for (Course i : courses)
            for (Assistant j : i.getAssistants())
                if (!assistants.contains(j))
                    assistants.add(j);
        return assistants;
    }

}