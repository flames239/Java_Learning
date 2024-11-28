package Java_Concept.statickeyword;

public class StudentMain {
    public static void main(String[] args) {
        // object create not required
        // for calling static variables and methods
        System.out.println(Student.city);
        Student.display1();

        // Objects create required for non-static variables and method
        Student stu = new Student();
        stu.display2();
        stu.grade = 'D';
        System.out.println(stu.grade);
        stu.rollnum = 1235;
        System.out.println(stu.rollnum);
    }
}
