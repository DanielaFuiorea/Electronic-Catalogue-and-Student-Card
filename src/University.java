import java.io.Serializable;
import java.util.ArrayList;

public class University implements Serializable {
    private String name;
    private Teacher rector;
    private ArrayList<Faculty> faculties;

    private Catalog catalog;

    //constructor
    public University(String name, Teacher teacher, Catalog catalog){
        this.name = name;
        rector = teacher;
        this.catalog = catalog;
        faculties = new ArrayList<>();
    }

    //returneaza catalogul
    public Catalog getCatalog() {
        return catalog;
    }

    //returneaza numele
    public String getName(){
        return name;
    }

    //returneaza rectorul
    public Teacher getRector(){
        return rector;
    }

    //adauga o facultate
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    //sterge o facultate
    public void removeFaculty(Faculty faculty){
        faculties.remove(faculty);
    }

    //returneaza o lista cu facultatile
    public ArrayList<Faculty> getFaculty(){
        return faculties;
    }

    //returneaza o lista cu specializarile
    public ArrayList<Department> getDepartments(){
        ArrayList<Department> departments = new ArrayList<>();
        for(Faculty i : faculties)
            for(Department j : i.getDepartment())
                departments.add(j);
        return departments;

    }

    //afisare
    public String toString() {
        String s = name + ":\n";
        for (Faculty i : faculties) {
            s = s + i.toString() + "\n";
        }
        s = s + catalog.toString();
        return s;
    }

}
