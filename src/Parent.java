import java.io.Serializable;
import java.util.ArrayList;

public class Parent extends User implements Observer, Serializable {

    private ArrayList<Notification> notifications;

    //Constructorul
    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
        notifications = new ArrayList<>();
    }

    //seteaza emailul
    public void setEmail(String email){
        this.email = email;
    }

    //actualizeaza notificarile
    public void update(Notification notification) {
        notifications.add(notification);
    }

    //actualizeaza notificarile
    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    //afiseaza informatiile despre parinte
    public String toString() {
        return super.toString() + "\nNotifications:\n" + notifications;
    }
}
