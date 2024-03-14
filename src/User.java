import java.io.Serializable;
public abstract class User implements Serializable{
    protected String firstName, lastName, password, email, cnp;

    //Constructorul
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Preluarea prenumelui
    public String getFirstName(){
        return firstName;
    }

    //Returnarea prenumelui
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Preluarea numelui de familie
    public String getLastName(){
        return lastName;
    }

    //Returnarea numelui de familie
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Schimbarea parolei
    public void setPassword(String password){
        this.password = String.valueOf(password.hashCode());
    }

    //Preluarea parolei
    public String getPassword(){
        return password;
    }


    public String getEmail(){
        return email;
    }

    //Seteaza CNP-ul studentului
    public void setCNP(String cnp){
        this.cnp = cnp;
    }

    public String getCNP(){
        return cnp;
    }

    //Afisare
    public String toString() {
        return firstName + " " + lastName + "\n " + email + "\n CNP: " + cnp;
    }

    //Sterge utilizatorul
    public void delete(){
        firstName = null;
        lastName = null;
        password = null;
    }
}
