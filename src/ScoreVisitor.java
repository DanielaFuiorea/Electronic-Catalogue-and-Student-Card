import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreVisitor implements Visitor, Serializable {
    private HashMap<Teacher, ArrayList<Triplet<Student, String, Double>>> examScores;
    private HashMap<Assistant, ArrayList<Triplet<Student, String, Double>>> partialScores;

    //constructor
    public ScoreVisitor(){
        examScores = new HashMap<>();
        partialScores = new HashMap<>();
    }
    //constructor
    public ScoreVisitor(HashMap<Teacher, ArrayList<Triplet<Student, String, Double>>> examScores, HashMap<Assistant, ArrayList<Triplet<Student, String, Double>>> partialScores){
        super();
        this.examScores=examScores;
        this.partialScores=partialScores;

    }

    //punerea de note ca asistent
    public void visit(Assistant assistant, Catalog catalog) {
        ArrayList<Triplet<Student, String, Double>> Triplet = partialScores.get(assistant);
        for (Triplet<Student, String, Double> triplet: Triplet) {
            Course course = catalog.getCourse(triplet.getValue1());
            int ok = 0;
            for (Triplet<Student, String, Double> i: Triplet) {
                for (Grade grade : course.getAllStudentGrades()) {
                    if (grade.getStudent() == i.getKey()) {
                        ok = 1;
                        grade.setPartialScore(i.getValue2());
                        grade.setAssistant(assistant);
                        catalog.notifyObservers(new Grade(course.getName(), triplet.getKey(), grade.getPartialScore(), grade.getExamScore()));
                    }
                }
            }
            if(ok == 0) {
                Grade grade = new Grade(course.getName(), triplet.getKey());
                grade.setPartialScore(triplet.getValue2());
                grade.setAssistant(assistant);
                course.addGrade(grade);
                catalog.notifyObservers(new Grade(course.getName(), triplet.getKey(), grade.getPartialScore(), grade.getExamScore()));
            }
        }
    }

    //punerea de note ca ptofesor
    public void visit(Teacher teacher, Catalog catalog) {
        ArrayList<Triplet<Student, String, Double>> Triplet = examScores.get(teacher);

        for (Triplet<Student, String, Double> triplet: Triplet) {
            Course course = catalog.getCourse(triplet.getValue1());
            int ok = 0;
            for (Triplet<Student, String, Double> i: Triplet) {
                for (Grade grade : course.getAllStudentGrades()) {
                    if (grade.getStudent() == i.getKey()) {
                        ok = 1;
                        grade.setExamScore(i.getValue2());
                        grade.setTeacher(teacher);
                        catalog.notifyObservers(new Grade(course.getName(), triplet.getKey(), grade.getPartialScore(), grade.getExamScore()));
                    }
                }
            }
            if(ok == 0) {
                Grade grade = new Grade(course.getName(), triplet.getKey());
                grade.setExamScore(triplet.getValue2());
                grade.setTeacher(teacher);
                course.addGrade(grade);
                catalog.notifyObservers(new Grade(course.getName(), triplet.getKey(), grade.getPartialScore(), grade.getExamScore()));
            }
        }
    }

    static class Triplet<K, V1, V2> implements Serializable {
        private K key;
        private V1 value1;
        private V2 value2;
        public Triplet(K key, V1 value1, V2 value2) {
            this.key = key;
            this.value1 = value1;
            this.value2 = value2;
        }
        public K getKey() {
            return key;
        }
        public V1 getValue1() {
            return value1;
        }
        public V2 getValue2() {
            return value2;
        }
    }

}