package Java_Concept.oops;

public class BankAccount {
    public static void main(String[] args) {
        Encapsulation_BankAccount eb = new Encapsulation_BankAccount();
        eb.setAccountNum(44856548);
        eb.getAccountNum();

        eb.setName("Nam Ha");
        eb.getName();

        eb.setBalance(152.20);
        eb.getBalance();
    }
}
