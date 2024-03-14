import java.io.Serializable;

public interface Observer extends Serializable {

    void update(Notification notification);

}