package Java_Concept.oops;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Encapsulation_BankAccount {
    // variables
    private int accountNum;
    private String name;
    private double balance;

    // methods
    public int getAccountNum() {
        System.out.println(accountNum);
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
