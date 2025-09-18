/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */

    
public abstract class Account {
    private String accountNumber;
    private double balance;
    private Person client;

    public Account() {}

    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Person getClient() { return client; }
    public void setClient(Person client) { this.client = client; }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void interestCalculation();

    @Override
    public String toString() {
        return "\nBANK ACCOUNT INFORMATION:" +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nAccount Owner: " + client;
    }
}