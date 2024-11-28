package Java_Concept.statickeyword;

public class Student {

    int rollnum;
    char grade;
    static String city;

    static void display1() {
        System.out.println("static display method");
    }

    void display2() {
        System.out.println("non static display method");
    }


//    public static void main(String[] args) {
//        // object create not required
//        // for calling static variables and methods
//        System.out.println(city);
//        display1();
//
//        Student stu = new Student();
//        stu.display2();
//        stu.grade = 'C';
//        System.out.println(stu.grade);
//    }
}
