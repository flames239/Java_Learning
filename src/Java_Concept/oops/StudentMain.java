package Java_Concept.oops;

public class StudentMain {

    // main method - execution starting point
    public static void main(String[] args) {
        Student stu = new Student();
        stu.rollnum = 15;
        stu.grade = 'B';
        stu.name = "Dame";
        stu.address = "Ho Chi Minh";

        stu.displayAllValue();
    }
}
