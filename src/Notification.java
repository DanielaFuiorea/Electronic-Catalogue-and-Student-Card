import java.io.Serializable;

public class Notification  implements Serializable {
    private Grade grade;
    //Constructor
    public Notification(Grade grade) {
        this.grade = grade;
    }
    //afisarea
    public String toString() {
        String s = "\n" + grade.getStudent().getLastName() + " " + grade.getStudent().getFirstName() + " la cursul " + grade.getCourse() ;
        if(grade.getPartialScore()!=0 && grade.getExamScore()!=0)
            s = s + " a luat la activitate nota " + String.format("%.2f", grade.getPartialScore()) + " si la examen nota " + String.format("%.2f", grade.getExamScore());
        else if(grade.getPartialScore()!=0)
            s = s + " a luat la activitate nota " + String.format("%.2f", grade.getPartialScore());
        else if(grade.getExamScore()!=0)
            s = s + " a luat la examen nota " + String.format("%.2f", grade.getExamScore());
        return s;
    }
}