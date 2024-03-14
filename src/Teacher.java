import java.io.Serializable;

public class Teacher extends User implements Serializable {

    private String path;

    //Constructorul
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@teacher.unicod.ro" ;
    }

    //actualizeaza emailul
    public void updateEmail(){
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@teacher.unicod.ro" ;
    }

    //actualizeaza calea pozei
    public void setPath(String path) {
        this.path = path;
    }

    //returneaza calea pozei
    public String getPath() {
        return path;
    }

    //poate sa foloseasca score visitor
    public void accept(Visitor visitor, Catalog catalog) {
        visitor.visit(this, catalog);
    }

}
