package Java_Concept.string;

public class StringInJava {
    public static void main(String[] args) {
        String str = "Nam Ha";

        String str1 = new String("Nam Ha");

        // inbuilt methods
        //length() - return number of characters in the string given
        int countStr1 = str1.length();
        System.out.println(countStr1);

        int countStr2 = "Ha Thi Ngoc".length();
        System.out.println(countStr2);

        System.out.println("Ha Nguyen Phuong".length());

        //concat - concatenation - join two strings
        String s1 = "Learing Java";
        String s2 = " Is Fun";

        String concat = s1.concat(s2);
        System.out.println(concat);
        System.out.println("s1 + s2: " + s1 + s2);

        String s3 = " Patient";
        System.out.println("using concat: " + s1.concat(s2).concat(s3));


    }
}
