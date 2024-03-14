import java.io.Serializable;

public class Assistant extends User  implements Serializable {
    //Constructor
    public Assistant(String firstName, String lastName) {
        super(firstName, lastName);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@assistant.unicod.ro" ;
    }

    //actualizeaza emailul
    public void updateEmail(){
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@assistant.unicod.ro" ;
    }

    //poate sa foloseasca score visitor
    public void accept(Visitor visitor, Catalog catalog) {
        visitor.visit(this, catalog);
    }

}