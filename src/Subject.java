import java.io.Serializable;

public interface Subject extends Serializable {
    //abonarea unui observator
    void addObserver(Observer observer);

    //dezabonarea uni observator
    void removeObserver(Observer observer);

    //trimiterea notificarilor
    void notifyObservers(Grade grade);
}