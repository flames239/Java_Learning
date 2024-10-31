package Java_Concept.Conditional_Statements;

public class NestedIfElse_Statement {
    public static void main(String[] args) {
        if(true){
            if (true) {
                System.out.println("First");
            }
            else {
                System.out.println("Second");
            }
        }
        else {
            System.out.println("Third");
        }
    }
}
