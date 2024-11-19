package Java_Concept.packageoops;
import Java_Concept.oops.Student;

public class StudentAnotherPackageMain {

    // execution starting point
    public static void main(String[] args) {
        Student stu = new Student();
        stu.rollnum = 16;
        stu.grade = 'C';
        stu.name = "Rem";
        stu.address = "Japan";

        stu.displayAllValue();
    }
}
