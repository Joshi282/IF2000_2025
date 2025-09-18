/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author josha
 */
public class Checking extends Account{
    private double interestRate;

    public Checking(String accountNumber, double balance, Person client, double interestRate) {
        super(accountNumber, balance, client);
        this.interestRate = interestRate;
        
    }
     @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }
 @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
     @Override
    public void interestCalculation() {
        double interest = (getBalance() * interestRate) / 12;
        setBalance(getBalance() + interest);
        System.out.println("Interest added. New balance: " + getBalance());
    }
    
}
