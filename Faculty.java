import Student.java

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    List<Student> students = new ArrayList<>();
    String fakultet;

    public Faculty(List<Student> students, String fakultet) {
        this.students = students;
        this.fakultet = fakultet;
    }

    public boolean addStudent(Student s) {
        return students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public double averageGrade(List<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getAverage();
        }
        return sum / students.size();
    }
}