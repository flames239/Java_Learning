package Java_Concept.Conditional_Statements;

public class IfElse_Statement {
    public static void main(String[] args) {
        // when using bracket, execute multi line
        int marks = 5;
        if(marks > 5) {
            System.out.println("Pass");
        }
        else {
            System.out.println("False");
        }


        // not using bracket, the line of code only execute single line
        if(marks > 6) System.out.println("Pass");
        else System.out.println("Failed");
    }

}
