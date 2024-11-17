package Java_Concept.string;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "Hoc Java De Lam Automation Testing";
        String words[] = str.split(" "); // tach chuoi thanh mang nhieu chuoi
        String revEach = ""; // tao mot chuoi bien rong
        for (String x : words) { // for each qua mang nhieu chuoi
            String reverseWord = ""; // khai bao bien chua ky tu
            for (int i = x.length() - 1; i >= 0; i--) { // chay vong lap de dao nguoc ky tu
                reverseWord += x.charAt(i);
            }
            // noi chuoi lai voi nhau va them khoang trang cho dep
            revEach += reverseWord + " ";
        }
        System.out.println("Before reserve each words: " + str);
        System.out.println("After reserve each words: " + revEach);
    }
}
