import java.io.Serializable;

public interface Element extends Serializable {
    void accept(Visitor visitor);
}