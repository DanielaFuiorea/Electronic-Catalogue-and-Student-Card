import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public interface Strategy extends Serializable {
    //alegerea celui mai bun student
    Student getBestStudent(ArrayList<Grade> grades);
}