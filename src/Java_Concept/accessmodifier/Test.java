package Java_Concept.accessmodifier;

public class Test {
    private int a = 100;
    private void display() {
        System.out.println("display access modifier Private: " + a);
    }

    int b = 200;
    void display1(String str) {
        System.out.println("display access modifier : " + str);
    }

    protected int c = 300;
    protected void display2(String str1) {
        System.out.println("display access modifier :" + str1);
    }

    public int d = 300;
    public void display3(String str2) {
        System.out.println("display access modifier :" + str2);
    }

    public static void main(String[] args) {
        Test t = new Test();
//        System.out.println(t.a);
//        t.display();

        t.display1("Automation Framework Java");

        System.out.println(t.c);
        t.display2("Protected access modified");
    }
}
