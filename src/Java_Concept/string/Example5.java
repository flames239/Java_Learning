package Java_Concept.string;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        // split() - create multiple String based on delimeter
        // some special char not use (* % ^)
        String str4 = "Nam Ha Hoc Selenium WebDriver";
        String split[] = str4.split(" ");
        System.out.println("Using split: " +split[4]);

        String str5 = "Hoc,Selenium,Webdriver,kho,hay,de";
        /*
        * A positive limit means "at most this many splits."
          A zero limit means "split as many times as possible."
          A negative limit means "no limit on the number of splits."
        * */
        String split5[] = str5.split("kho",-1);
        System.out.println("Using split with regex and limit: " + Arrays.toString(split5));

        String str6 = "nam123456@yopmail.com";
        String split2[] = str6.split("123456");
        System.out.println(split2[0]);
    }
}
