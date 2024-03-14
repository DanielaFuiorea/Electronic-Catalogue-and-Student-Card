import java.io.Serializable;
import java.util.ArrayList;

public class Faculty  implements Serializable {
    private String name;
    private Teacher dean;
    private ArrayList<Department> departments;

    //constructor
    public Faculty(String name, Teacher teacher){
        this.name = name;
        dean = teacher;
        departments = new ArrayList<>();
    }

    public Faculty(String name){
        this.name = name;
    }

    //seteaza numele
    public void setName(String name){
        this.name = name;
    }

    //returneaza numele
    public String getName(){
        return name;
    }

    //seteaza decanul
    public void setDean(Teacher teacher){
        dean = teacher;
    }

    //returneaza decanul
    public Teacher getDean(){
        return dean;
    }

    //adauga specializare
    public void addDepartment(Department department){
        departments.add(department);
    }

    //sterge specializare
    public void removeDepartment(Department department){
        departments.remove(department);
    }

    //sterge toate specializarile
    public void removeAllDepartments(){
        while (departments.size() != 0)
            departments.remove(0);
    }

    //returneaza o lista cu specializarile
    public ArrayList<Department> getDepartment(){
        return departments;
    }

    //returneaza initialele facultatii
    public String getInitials(){
        String[] words = name.split(" ");
        String initials = "";
        for (int i = 0; i < words.length; i++) {
            if(Character.isUpperCase(words[i].charAt(0)))
                initials = initials + words[i].charAt(0);
        }
        return initials;
    }

    public String toString() {
        String s = name + ":\n ";
        for (Department i : departments) {
            s = s + i.getName() + "\n ";
        }
        return s;
    }
}
