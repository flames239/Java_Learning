package Java_Concept.oops;

public class OverLoadMain {
   void main() {
       System.out.println("No Input in main OverLoad Main");
   }

    void main(String str) {
        System.out.println("Overload main with String input parameterized: " + str);
   }

    void main (int x) {
        System.out.println("Overload main with int input parameterized: " + x);

    }

    public static void main(String[] args) {
        OverLoadMain olm = new OverLoadMain();
        olm.main("Nam Ha");
        olm.main(5);
    }
}
