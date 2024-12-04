package Java_Concept.methodoverriding;
class Bank {
    // parents
    double interestRate() {
        return 5.5;
    }
}

class BOFA extends Bank {
    // child 1
    double interestRate() {
        return 6.5;
    }
}

class JPM extends Bank {
    // child 1
    double interestRate() {
        return 7.5;
    }
}

public class Example {
    public static void main(String[] args) {
        Bank b = new Bank();
        BOFA bofa = new BOFA();
        double na = bofa.interestRate();
        System.out.println(na);

        JPM jp = new JPM();
        double ja = jp.interestRate();
        System.out.println(ja);

    }
}
