import java.io.Serializable;
import java.util.*;

public class BestTotalScore implements Strategy, Serializable {

    //alegerea celui mai bun student
    public Student getBestStudent(ArrayList<Grade> grades) {
        Grade student = grades.get(0);
        for (Grade grade: grades) {
            if(grade.getTotal() > student.getTotal()) {
                student = grade;
            }
        }
        return student.getStudent();
    }
}