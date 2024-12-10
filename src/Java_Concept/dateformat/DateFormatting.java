package Java_Concept.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
        String strDate1 = formatter1.format(date);
        System.out.println(strDate1);

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strDate2 = formatter2.format(date);
        System.out.println(strDate2);

        SimpleDateFormat formatter3 = new SimpleDateFormat("dd MMMM yyyy");
        String strDate3 = formatter3.format(date);
        System.out.println(strDate3);

        SimpleDateFormat formatter4 = new SimpleDateFormat("dd MMMM yyyy zzzz");
        String strDate4 = formatter4.format(date);
        System.out.println(strDate4);

        SimpleDateFormat formatter5 = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss z");
        String strDate5 = formatter5.format(date);
        System.out.println(strDate5);

    }
}
