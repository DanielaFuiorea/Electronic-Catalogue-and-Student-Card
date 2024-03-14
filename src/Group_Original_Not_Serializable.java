
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Group_Original_Not_Serializable extends ArrayList<Student> implements Comparator<Student> {

        private String id;
        private Assistant assistant;
        private ArrayList<Student> students;

        private Comparator<Student> comp;


        public Group_Original_Not_Serializable(String ID, Assistant assistant, Comparator<Student> comp) {
            this.assistant = assistant;
            id = ID;
            this.comp = comp;
            students = new ArrayList<>();
        }

        public Group_Original_Not_Serializable(String ID, Assistant assistant) {
            this.assistant = assistant;
            id = ID;
            comp = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    if (s1.getLastName().compareTo(s2.getLastName()) == 0)
                        return s1.getFirstName().compareTo(s2.getFirstName());
                    return s1.getLastName().compareTo(s2.getLastName());
                }};
            students = new ArrayList<>();
        }


        public void addStudent(Student student){
            students.add(student);
            if(students.size() > 1)
                Collections.sort(students, comp);
        }

        public void addStudents(ArrayList<Student> students){
            for (Student i: students) {
                this.students.add(i);
                if(students.size() > 1)
                    Collections.sort(students, comp);
            }
        }

        public void removeStudent(Student student){
            students.remove(student);
        }

        public ArrayList<Student> getStudents(){
            return students;
        }

        public void setAssistant(Assistant assistant){
            this.assistant = assistant;
        }

        public Assistant getAssistant(){
            return assistant;
        }

        public String getId(){
            return id;
        }

        public String toString(){
            String s = id + ", " + assistant.getFirstName() + " " + assistant.getLastName();
            for (Student i : students) {
                s = s + "\n  " + i.getFirstName() + " " + i.getLastName();
            }
            return s;
        }

        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getLastName().compareTo(s2.getLastName()) == 0)
                return s1.getFirstName().compareTo(s2.getFirstName());
            return s1.getLastName().compareTo(s2.getLastName());
        }


}


