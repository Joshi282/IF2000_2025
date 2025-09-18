/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */
public class SavingsAccount extends Account {
    private String startDate;
    private int termMonths;
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Person client,
    String startDate, int termMonths, double interestRate) {
        super(accountNumber, balance, client); 
        this.startDate = startDate;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance in savings account.");
        }
    }

    @Override
    public void interestCalculation() {
        double interest = termMonths * getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}
    
    

