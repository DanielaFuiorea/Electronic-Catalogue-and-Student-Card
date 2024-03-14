import javax.xml.catalog.Catalog;
import java.io.Serializable;
import java.util.ArrayList;

public class Department  implements Serializable {
    private String name;
    private ArrayList<Course> courses;

    //constructor
    public Department(String name){
        this.name = name;
        courses = new ArrayList<>();
    }

    //seteaza numele
    public void setName(String name){
        this.name = name;
    }

    //returneaza numele
    public String getName(){
        return name;
    }

    //returneaza initialele
    public String getInitials(){
        String[] words = name.split(" ");
        String initials = "";
        for (int i = 0; i < words.length; i++) {
            if(Character.isUpperCase(words[i].charAt(0)))
                initials = initials + words[i].charAt(0);
        }
        return initials;
    }

    //adauga curs
    public void addCourse(Course course){
        courses.add(course);
    }

    //sterge curs
    public void removeCourse(String courseName){
        ArrayList<Course> courses2 = new ArrayList<>();
        for(Course i : courses)
            if(!courseName.equals(i.getName()))
                courses2.add(i);
        courses = courses2;
    }

    //sterge toate cursurile
    public void removeAllCourses(){
        while (courses.size() != 0)
            courses.remove(0);
    }

    //returneaza o lista cu toate cursurile
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //afisare
    public String toString() {
        String s = name + ":\n  ";
        for (Course i : courses) {
            s = s + i.getName() + "\n  ";
        }
        return s;
    }
}
