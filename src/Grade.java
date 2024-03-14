import java.io.Serializable;

public class Grade implements Comparable, Cloneable, Serializable {
    private Double partialScore, examScore;
    private Student student;
    private String course;
    private Teacher teacher;
    private Assistant assistant;


    //constructor
    public Grade(String course, Student student) {
        partialScore = 0.0;
        examScore = 0.0;
        this.course = course;
        this.student = student;
    }

    //constructor
    public Grade(String course, Student student,Double partialScore, Double examScore) {
        this.partialScore = partialScore;
        this.examScore = examScore;
        this.course = course;
        this.student = student;
    }

    //seteaza nota de la activitate
    public void setPartialScore(Double score) {
        partialScore = score;
    }

    //returneaza nota de la activitate
    public Double getPartialScore() {
        return partialScore;
    }

    //seteaza nota de la examen
    public void setExamScore(Double score) {
        examScore = score;
    }

    //returneaza nota de la activitate
    public Double getExamScore() {
        return examScore;
    }

    //returneaza nota finala
    public Double getTotal() {
        return partialScore + examScore;
    }

    //returneaza studentul a carui nota este
    public Student getStudent() {
        return student;
    }

    //returneaza cursul la care este
    public String getCourse() {
        return course;
    }

    //seteaza asistentul care a apus nota de la activitate
    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    //returneaza asistentul care a pus nota de la activitate
    public Assistant getAssistant() {
        return assistant;
    }

    //seteaza profesorul care a pus nota de examen
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //returneaza profesorul care a pus nota de la examen
    public Teacher getTeacher() {
        return teacher;
    }

    //afisare
    public String toString() {
        return student.getFirstName() + " " + student.getLastName() + ", " + course + ":\nActivity grade: " + partialScore + ", Exam grade: " + examScore;
    }

    //clonarea notei pentru backup
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        Grade grade;
        grade = (Grade) o;
        if(this.getTotal() < grade.getTotal()) {
            return 1;
        }
        return -1;
    }
}