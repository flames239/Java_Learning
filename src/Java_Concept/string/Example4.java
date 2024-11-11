package Java_Concept.string;

import java.util.Arrays;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {
        // replace - replace single or multiple it will replace in a string
        String str = "Learning Code is Simple Or Hard ?";
        String replace = str.replace("ing", "");

        System.out.println(replace);

        String replace1 = str.replace("Code", "Selenium Webdriver");
        System.out.println(replace1);

        // substring - cut the given string
        // retrieve part of an main string
        String str1 = "Nam Ha";
        String catStr1 = str1.substring(1); // delete the index in the string given
        System.out.println("String using substring beginIndex: " + catStr1);

        String catStr2 = str1.substring(0,5); // hold the value index from index value to index value
        System.out.println("String using substring begin and end index: " + catStr2);

        // lowerCase, upperCase
        String str2 = "Senior Apartment Quality Assurance";
        String str3 = "Apartment Developer";

        String lowStr2 = str2.toLowerCase();
        String upperStr3 = str3.toUpperCase();

        System.out.println("using toLowerCase: " + lowStr2);
        System.out.println("using toUpperCase: " + upperStr3);

        // split() - create multiple String based on delimeter
        // some special char not use (* % ^)
        String str4 = "Nam Ha Hoc Selenium WebDriver";
        String split[] = str4.split(" ");
        System.out.println("Using split: " +split[4]);

        String str5 = "Hoc,Selenium,Webdriver,kho,hay,de";
        String split1[] = str5.split("Webdriver",1);
        System.out.println("Using split with regex and limit: " + Arrays.toString(split1));

        String str6 = "nam123456@yopmail.com";
        String split2[] = str6.split("123456");
        System.out.println(split2[0]);
    }
}
