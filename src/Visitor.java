import java.io.Serializable;

public interface Visitor extends Serializable {
    //visitarea ca asistent
    void visit(Assistant assistant, Catalog catalog);

    //visitarea ca profesor
    void visit(Teacher teacher, Catalog catalog);
}