import com.examples.datatypes.Student;

public class Controller {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Aditya", "Computers");
        Student student2 = new Student(1, "Aditya", "Computers");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println("Is Student1 > Student2 ? " + student1.compareTo(student2));
    }
}

