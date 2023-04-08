import com.examples.datatypes.Student;

import java.util.ArrayList;

public class SortController {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Aditya", "Computers");
        Student student2 = new Student(2, "Isha", "Computers");
        Student student3 = new Student(3, "Advait", "Computers");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student3);
        students.add(student1);
        students.add(student2);

        students.sort(null);

        System.out.println(students);
    }
}
