import java.io.Serializable;
import java.util.*;

public abstract class Course  implements Serializable {
    protected String name;
    protected int credits;
    protected Teacher teacher;
    protected ArrayList<Assistant> assistants;
    protected ArrayList<Grade> grades;
    protected HashMap<String, Group> groups;
    protected Strategy strategy;
    public ArrayList<Grade> backup;
    protected String description;


    //contructor
    public Course(CourseBuilder course) {
        this.name = course.name;
        this.teacher = course.teacher;
        this.assistants = course.assistants;
        this.groups = course.groups;
        this.grades = course.grades;
        this.strategy = course.strategy;
        this.credits = course.credits;
        this.description = course.description;
        this.backup = new ArrayList<>();
    }

    //clasa interna
    public static abstract class CourseBuilder{
        private String name;
        private int credits;
        private Teacher teacher;
        private ArrayList<Assistant> assistants;
        private ArrayList<Grade> grades;
        private HashMap<String, Group> groups;
        private Strategy strategy;
        private String description;
        public CourseBuilder(String name, int credits) {
            this.name = name;
            this.credits = credits;
            this.assistants = new ArrayList<>();
            this.grades = new ArrayList<>();
            this.groups = new HashMap<>();
        }

        public CourseBuilder teacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public CourseBuilder assistant(Assistant assistant) {
            this.assistants.add(assistant);
            return this;
        }

        public CourseBuilder grade(Grade grade){
            this.grades.add(grade);
            return this;
        }

        public CourseBuilder group(Group group) {
            this.groups.put(group.getId(), group);
            return this;
        }

        public CourseBuilder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public CourseBuilder description(String description)
        {
            this.description = description;
            return this;
        }

        public abstract Course build();

    }

    //returneaza grupa unui student dat
    public Group getStudentGroup(Student student){
        Group group = null;
        for (Map.Entry<String, Group> i : groups.entrySet()){
            for (Student j:i.getValue().getStudents()) {
                if(j.getCNP().equals(student.getCNP()))
                    group = i.getValue();
            }
        }
        return group;
    }

    //returneaza o lista cu toate grupele din curs
    public ArrayList<Group> getGroups(){
        ArrayList<Group> groups2 = new ArrayList<>();
        for (Map.Entry<String, Group> i : groups.entrySet()){
            groups2.add(i.getValue());
        }
        return groups2;
    }

    //returneaza grupul cu Id-ul dat
    public Group getGroup(String id){
        Group group = null;
        for (Map.Entry<String, Group> i : groups.entrySet()){
            if(i.getKey().equals(id))
                group = i.getValue();
        }
        return group;
    }

    //sterge un grup cu id-ul dat
    public void removeGroup(String id){

        groups.remove(id);
    }

    //seteaza numele cursului
    public void setName(String name){
        this.name = name;
    }

    //returneaza numele cursului
    public String getName(){
        return name;
    }

    //seteaza numarul de credite
    public void setCredits(int credits){
        this.credits = credits;
    }

    //returneaza numarul de credite
    public int getCredits(){
        return credits;
    }

    //seteaza profesorul titular al cursului
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    //returneaza profesorul titular
    public Teacher getTeacher(){
        return teacher;
    }

    // Seteaza asistentul în grupa cu ID-ul indicat
    // Daca nu exista deja, adauga asistentul si în multimea asistentilor
    public void addAssistant(String ID, Assistant assistant){
        boolean ok = false;
        for (Assistant i : assistants ) {
            if (Objects.equals(i.getCNP(), assistant.getCNP())) {
                ok = true;
                break;
            }
        }

        if(!ok)
            assistants.add(assistant);

        for (Map.Entry<String, Group> i : groups.entrySet()) {
            if(i.getKey().equals(ID))
                i.getValue().setAssistant(assistant);
        }
    }

    //adauga un asistent
    public void addAssistant(Assistant assistant){
        boolean ok = false;
        for (Assistant i : assistants ) {
            if (Objects.equals(i.getCNP(), assistant.getCNP())) {
                ok = true;
                break;
            }
        }

        if(!ok)
            assistants.add(assistant);
    }

    // Adauga studentul în grupa cu ID-ul indicat
    public void addStudent(String ID, Student student){
        for (Map.Entry<String, Group> i : groups.entrySet()) {
            if(i.getKey().equals(ID))
                i.getValue().addStudent(student);
        }
    }

    //schimba grupa studentului dat cu grupa cu id-ul dat
    public void changeStudent(String ID, Student student){
        for (Map.Entry<String, Group> i : groups.entrySet())
            if(i.getValue().getStudents().contains(student))
                i.getValue().removeStudent(student);
        for (Map.Entry<String, Group> i : groups.entrySet()) {
            if(i.getKey().equals(ID))
                i.getValue().addStudent(student);
        }
    }

    //sterge toate grupele din curs
    public void removeAllGroups(){
        groups.clear();
    }

    //sterge studentul dat
    public void removeStudent(Student student){
        for (Map.Entry<String, Group> i : groups.entrySet())
            if(i.getValue().getStudents().contains(student))
                i.getValue().removeStudent(student);
    }

    //sterge asistentul dat
    public void removeAssistant(Assistant assistant){
        ArrayList<Assistant> assistants2 = new ArrayList<>();
        for(Assistant i : assistants)
            if(!i.getCNP().equals(assistant.getCNP()))
                assistants2.add(i);
        assistants = assistants2;
    }

    //sterge toti asistentii din curs
    public void removeAllAssistants(){
       assistants.clear();
    }

    // Adauga grupa
    public void addGroup(Group group){
        groups.put(group.getId(), group);
        boolean ok = false;
        for (Assistant i : assistants ) {
            if (Objects.equals(i.getCNP(), group.getAssistant().getCNP())) {
                ok = true;
                break;
            }
        }

        if(!ok)
            assistants.add(group.getAssistant());
    }

    // Instantiaza o grupa si o adauga
    public void addGroup(String ID, Assistant assistant){

        groups.put(ID, new Group(ID, assistant));

        boolean ok = false;
        for (Assistant i : assistants ) {
            if (Objects.equals(i.getCNP(), assistant.getCNP())) {
                ok = true;
                break;
            }
        }

        if(!ok)
            assistants.add(assistant);
    }

    //returneaza o lista cu toti asistenti
    public ArrayList<Assistant> getAssistants() {
        return assistants;
    }

    // Returneaza nota unui student sau null
    public Grade getGrade(Student student){
        Grade grade = null;
        for(Grade i : grades)
            if(student.getCNP().equals(i.getStudent().getCNP()))
                return i;
        return grade;
    }

    // Adauga o nota
    public void addGrade(Grade grade){
        boolean ok = false;
        for (Grade i : grades ) {
            if (i.getStudent().getCNP().equals(grade.getStudent().getCNP())) {
                if(i.getPartialScore()!=grade.getPartialScore() && grade.getPartialScore()!=0){
                    i.setPartialScore(grade.getPartialScore());
                    i.setAssistant(grade.getAssistant());
                }
                if(i.getExamScore()!=grade.getExamScore() && grade.getExamScore()!=0) {
                    i.setExamScore(grade.getExamScore());
                    i.setTeacher(grade.getTeacher());
                }
                ok = true;
                break;
            }
        }
        if(!ok)
            grades.add(grade);
    }

    // Returneaza o lista cu toti studentii
    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> students = new ArrayList<>();
        for (Map.Entry<String, Group> i : groups.entrySet()) {
            for (Student j : i.getValue().getStudents()) {
                students.add(j);
            }
        }
        return students;
    }


    // Returneaza un dictionar cu situatia studentilor
    public ArrayList<Grade> getAllStudentGrades(){
        return grades;
    }

    //returneaza o lista cu studentii care au avut nota validata de asistentul dat
    public ArrayList<Student> getAsistantValidatedGrades(Assistant assistant){
        ArrayList<Student> valid = new ArrayList<>();
        for (Grade i : grades) {
            if(i.getAssistant()!=null)
            if(i.getAssistant().getCNP().equals(assistant.getCNP()))
                valid.add(i.getStudent());
        }
        return valid;
    }

    //returneaza o lista cu studentii care au avut nota validata de profesor
    public ArrayList<Student> getTeacherValidatedGrades(Teacher teacher){
        ArrayList<Student> valid = new ArrayList<>();
        for (Grade i : grades) {
            if(i.getTeacher()!=null)
                if(i.getTeacher().getCNP().equals(teacher.getCNP()))
                    valid.add(i.getStudent());
        }
        return valid;
    }

    //seteaza descrierea cursului
    public void setDescription(String description){
        this.description = description;
    }

    //returneaza descrierea cursului
    public String getDescription() {
        return description;
    }

    //afisare
    public String toString() {
        String s = "Name: " + name + "\nCredits: " + credits + "\n" + description + "\n" + "\nTeacher: " + teacher.toString() + "\n" + "\nAssistants:\n ";
        for (Assistant i : assistants) {
            s = s + i.toString() + "\n ";
        }
        s = s + "\nGroups: \n ";
        for (Map.Entry<String, Group> i: groups.entrySet()) {
            s = s + i.getValue().toString() + "\n ";
        }
        s = s + "\nGrades: \n ";
        for (Grade i: grades) {
            s = s + i.toString() + "\n ";
        }

        return s;
    }

    //returneaza cel mai bun student in functie de strategia aleasa
    public Student getBestStudent() {
        return strategy.getBestStudent(grades);
    }

    // Metoda ce o sa fie implementata pentru a determina studentii promovati
    public abstract ArrayList<Student> getGraduatedStudents();

    //clasa interna care reprezinta un moment din backup
    private class Snapshot {
        private HashMap<Student, Grade> backup;

        public Snapshot(HashMap<Student, Grade> backup) {
            this.backup = backup;
        }

        public String toString() {
            String s = "";
            for (Grade i: grades) {
                s = s + i.toString() + "\n ";
            }

            return s;
        }

    }

    //se creaza un backup la note
    public void makeBackup() throws CloneNotSupportedException {
        for (Grade i: grades) {
            Grade grade = (Grade) i.clone();
            backup.add(grade);
        }
    }

    //se intoarce la salvare de dinainte
    public void undo() {
        this.grades = backup;
    }


}
