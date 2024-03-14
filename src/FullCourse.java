import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class FullCourse extends Course implements Serializable {

    //constructia
    FullCourse(Course.CourseBuilder builder) {
        super(builder);
    }

    public static class FullCourseBuilder extends CourseBuilder {
        public FullCourseBuilder(String name, int credits) {
            super(name, credits);
        }

        public FullCourse build() {
            return new FullCourse(this);
        }
    }

    //returneaza o lista cu studentii absolviti
    public ArrayList<Student> getGraduatedStudents(){
        ArrayList<Student> students = new ArrayList<>();
        for (Map.Entry<String, Group> i: groups.entrySet()) {
            for (Student j : i.getValue().getStudents()) {
                for(Grade k : grades) {
                    Grade grade;
                    if (k.getStudent().equals(j)) {
                        grade = k;
                        if (grade.getPartialScore() >= 3 && grade.getExamScore() >= 2) {
                            students.add(j);
                        }
                    }
                }
            }
        }
        return students;
    }
}
