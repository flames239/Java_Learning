package Java_Concept.string;

public class Example6 {
    public static void main(String[] args) {
        // replace or remove in String
        String amout = "$1,25,000";
        String reprem = amout.replace(",",".");
        System.out.println(reprem);

        String reprem1 = amout.replace(",","").replace("$","");
        System.out.println(reprem1);

    }
}
