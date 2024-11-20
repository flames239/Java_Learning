package Java_Concept.string;

public class StringsPrograms {
    public static void main(String[] args) {
        //Concat number and strings together
        String s1 = "Java" + 10 + 20;
        System.out.println(s1);
        String s2 =  10 + "Java" + 20;
        System.out.println(s2);
        String s3 =  10 + 20 + "Java";
        System.out.println(s3);
        String s4 =  "Learn" + (10 + 20) + "Java";
        System.out.println(s4);

        // Hoan doi vi tri chuoi
        String swapStr = "Hoc Java De Lam Automation Testing";
        String swapInd = ""; // tao mot bien rong
        String split[] = swapStr.split(" "); // tao bien slip de tach chuoi thanh mang co nhieu du lieu
        for(int i = split.length - 1; i >= 0; i--) {
            swapInd += split[i]; // luc nay gan bien rong vao concat voi bien split de dao vi tri
            if(i != 0) {
                swapInd += " "; // noi khoang cach nhin cho dep
            }
        }
        System.out.println("Chuoi sau khi dao vi tri: " + swapInd);
    }
}
