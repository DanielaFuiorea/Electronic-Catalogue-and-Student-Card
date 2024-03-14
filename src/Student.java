import java.io.Serializable;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

public class Student extends User implements Serializable {

    private Parent mother, father;
    private ArrayList<Contract> contracts;
    private Faculty faculty;
    private Department department;
    private String path;

    //constructorul cu facultate si specializare
    public Student(String firstName, String lastName, Faculty faculty, Department department) {
        super(firstName, lastName);
        this.faculty = faculty;
        this.department = department;
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@stud." + department.getInitials().toLowerCase() + "." + faculty.getInitials().toLowerCase() + ".unicod.ro" ;
        contracts = new ArrayList<>();
    }

    //Constructorul
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        contracts = new ArrayList<>();
    }

    //Actualizeaza parola
    public void updateEmail(){
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@stud." + department.getInitials().toLowerCase() + "." + faculty.getInitials().toLowerCase() + ".unicod.ro" ;
    }

    //Seteaza mama studentului
    public void setMother(Parent mother){
        this.mother = mother;
    }

    //returneaza mama
    public Parent getMother(){
        return mother;
    }

    //Seteaza tatal studentului
    public void setFather(Parent father){
        this.father = father;
    }

    //returneaza tatal
    public Parent getFather(){
        return father;
    }



    //returneaza facultatea
    public Faculty getFaculty(){
        return faculty;
    }


    //returneaza specializarea
    public Department getDepartment(){
        return department;
    }

    //Adauga un contract de studiu
    public void addContract(Contract contract){
        contracts.add(contract);
    }

    //Sterge un contract de studiu
    public void removeContract(Contract contract){
        contracts.remove(contract);
    }

    //returneaza o lista cu contractele de studiu
    public ArrayList<Contract> getContracts(){
        return contracts;
    }

    //seteaza calea pozei sale
    public void setPath(String path) {
        this.path = path;
    }

    //returneaza calea pozei
    public String getPath() {
        return path;
    }


    //Afisare studentului
    public String toString() {
        if(faculty != null || department != null)
            return "\n" + super.toString() + "\n Faculty: " + faculty.getName() + "\n Department: " + department.getName() + "\n Mother and father: " + mother.getFirstName() + " " + mother.getLastName() + " si " + father.getFirstName() + " " + father.getLastName();
        return "\n" + super.toString() + "\n Mother and father: " + mother.getFirstName() + " " + mother.getLastName() + " si " + father.getFirstName() + " " + father.getLastName();
    }

    
}
