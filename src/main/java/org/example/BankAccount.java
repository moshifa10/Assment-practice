package org.example;
import java.util.Random;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private static int accounts = 1000;
    BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
//        Random random = new Random();
//        String next = Integer.toString(random.nextInt(1000000000,200000000));
        this.accountNumber = "Acc"+accounts;
        accounts++;

    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Amount should be greater than 0");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("You cant withdraw funds that are bigger than your current balance");
            return;
        }
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void printStatement(){
        System.out.println("Account holder is: "+ this.accountHolder+"\nAccount number: " + this.accountNumber + "\nAccount Balance: R" + this.balance );
    }

    public static void main(String[] args){

        BankAccount account1 = new BankAccount("Alice", 500);
        account1.deposit(200);
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getAccountHolder());
        System.out.println(account1.getBalance());
        account1.printStatement();
        account1.withdraw(900);
        System.out.println(account1.balance);
    }

}
