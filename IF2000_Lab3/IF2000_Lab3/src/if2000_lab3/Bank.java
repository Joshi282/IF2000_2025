/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    // SINPE Mobile simulation
    public static void sinpeTransfer(Bank fromBank, String fromAccountNum, Bank toBank, String toAccountNum, double amount) {
        Account fromAccount = fromBank.findAccount(fromAccountNum);
        Account toAccount = toBank.findAccount(toAccountNum);

        if (fromAccount == null || toAccount == null) {
            System.out.println("One of the accounts does not exist in the banks.");
            return;
        }

        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("SINPE Transfer successful! " + amount + " transferred.");
        } else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bank: " + name + "\nAccounts:\n");
        for (Account acc : accounts) {
            sb.append(acc.toString()).append("\n");
        }
        return sb.toString();
    }
}
    

