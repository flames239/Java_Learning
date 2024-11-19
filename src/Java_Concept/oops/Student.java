package Java_Concept.oops;

public class Student {

    // variable
    public String name;
    public int rollnum;
    public char grade;
    public String address;

    // method
    public void displayAllValue() {
        System.out.println("RollNum: " + rollnum);
        System.out.println("Name: " +name);
        System.out.println("Grade: " +grade);
        System.out.println("Address: " +address);
    }

    public void displayRollNum() {
        System.out.println("RollNum Value is: " + rollnum);
    }
/*
    // main method is execution starting point
    public static void main(String[] args) {
        // Create Object
        Student stu = new Student();

        // assigned some value to variable in the run time
        stu.rollnum = 1;
        stu.name = "Name Default";
        stu.grade = 'F';
        stu.address = "Delaware";

        // call method
        stu.displayAllValue();
        stu.displayRollNum();

        Student stu1 = new Student();
        Student stu2 = new Student();

    }
    */
}
