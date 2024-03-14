import java.io.Serializable;
import java.util.*;

public class Group extends ArrayList<Student> implements Serializable {
    private String id;
    private Assistant assistant;
    private ArrayList<Student> students;


    //constructor
    public Group(String ID, Assistant assistant, ArrayList<Student> students) {
        this.assistant = assistant;
        id = ID;
        this.students = students;
    }

    //constructor
    public Group(String ID, Assistant assistant) {
        this.assistant = assistant;
        id = ID;
        students = new ArrayList<>();
    }

    //adauga un nou student
    public void addStudent(Student student){
        students.add(student);
    }


    //sterge un student
    public void removeStudent(Student student){
        ArrayList<Student> students2 = new ArrayList<>();
        for(Student i : students)
            if(!i.getCNP().equals(student.getCNP()))
                students2.add(i);
        students = students2;
    }

    //returneaza o lista cu toti studenti
    public ArrayList<Student> getStudents(){
        return students;
    }

    //seteaza asistentul grupei
    public void setAssistant(Assistant assistant){
        this.assistant = assistant;
    }

    //returneaza asistentul grupei
    public Assistant getAssistant(){
        return assistant;
    }

    //returneaza id-ul (numele) grupei
    public String getId(){
        return id;
    }

    //afisare
    public String toString(){
        String s = id + ", " + assistant.getFirstName() + " " + assistant.getLastName();
        for (Student i : students) {
            s = s + "\n  " + i.getFirstName() + " " + i.getLastName();
        }
        return s;
    }



}
