import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class PartialCourse extends Course implements Serializable {

    //constructia
    PartialCourse(Course.CourseBuilder builder) {
        super(builder);
    }

    public static class PartialCourseBuilder extends CourseBuilder {
        public PartialCourseBuilder(String name, int credits) {
            super(name, credits);
        }

        public PartialCourse build() {
            return new PartialCourse(this);
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
                        if (grade.getTotal() >= 5) {
                            students.add(j);
                        }
                    }
                }
            }
        }
        return students;
    }


}
