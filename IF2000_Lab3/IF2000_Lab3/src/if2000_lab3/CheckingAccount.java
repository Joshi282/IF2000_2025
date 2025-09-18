/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */
public class CheckingAccount extends Account {
    private double interestRate;

    public CheckingAccount(String accountNumber, double balance, Person client, double interestRate) {
        super(accountNumber, balance, client); // 🔑 Llamada correcta al constructor de Account
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
            System.out.println("Insufficient balance in checking account.");
        }
    }

    @Override
    public void interestCalculation() {
        double interest = (getBalance() * interestRate) / 12;
        setBalance(getBalance() + interest);
    }
}
    

