/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author josha
 */
public class  Savings extends Account {
    private String startDate;
    private int termInMonths;
    private double interestRate;

    public Savings(String accountNumber, double balance, Person client,
                   String startDate, int termInMonths, double interestRate) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
}
    
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }

    
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void interestCalculation() {
        double interest = termInMonths * getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest added. New balance: " + getBalance());
    }
}
