package Java_Concept.oops;

public class Employee {

    int empID;
    String empName;
    double salary;

    // Default Constructors - no input parameters
    // no need return type
    Employee() {
        System.out.println("Default Constructors");
        empID = 1002;
        empName = "Nandela";
        salary = 254.5;
    }

    // parameterized constructor
    Employee(int id, String name, double sal) {
        empID = id;
        empName = name;
        salary = sal;
    }

    // initilize data
    void setEmpDataint(int EmpID, String name, double sal) {
        empID = EmpID;
        empName = name;
        salary = sal;
        System.out.println(EmpID + " " + name + " " + sal);
    }

    void printEmpData() {
        System.out.println("Employee_ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Employee emp = new Employee();

        /*// approach 1 - define some value to variables
        emp.empID = 12154;
        emp.empName = "Ngo Nguyen Hoang Ha";
        emp.salary = 16.955711;
        emp.printEmpData();
        */

        // approach 2 - define values using another method
       // emp.setEmpDataint(1254214, "The Scourge", 1500.00);

        // approach 3 - using a Constructors
        Employee emp1 = new Employee();
        emp1.printEmpData();

        // approach 4 - using parameterized constructors - initialize values
        Employee emp2 = new Employee(700,"Nam",586.5);
        emp2.printEmpData();
    }
}
