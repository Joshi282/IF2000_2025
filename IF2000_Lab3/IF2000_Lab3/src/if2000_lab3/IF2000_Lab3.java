/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */
import java.util.Scanner;
public class IF2000_Lab3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // Client data
        System.out.println(" Client Registration ");
        System.out.print("First name: ");
        String name = sc.nextLine();

        System.out.print("Last name: ");
        String lastName = sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        Person client = new Person(name, lastName, id, phone, age);

       
        System.out.println("\n Account Creation ");
        System.out.print("Account number: ");
        String accNumber = sc.nextLine();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.println("Which type of account do you want to create?");
        System.out.println("1. Savings");
        System.out.println("2. Checking");
        int option = sc.nextInt();
        sc.nextLine(); 

        Account account;

        if (option == 1) {
            System.out.print("Start date (yyyy-mm-dd): ");
            String startDate = sc.nextLine();

            System.out.print("Term in months: ");
            int term = sc.nextInt();

            System.out.print("Interest rate (e.g., 0.02): ");
            double rate = sc.nextDouble();

            account = new SavingsAccount(accNumber, balance, client, startDate, term, rate);

        } else {
            System.out.print("Annual interest rate (e.g., 0.015): ");
            double rate = sc.nextDouble();

            account = new CheckingAccount(accNumber, balance, client, rate);
        }

        // Operations menu
        int action;
        do {
            System.out.println("\n=== Operations Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate interests");
            System.out.println("4. Show account information");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    System.out.println("Deposit completed.");
                    break;
                case 2:
                    System.out.print("Amount to withdraw: ");
                    double wth = sc.nextDouble();
                    account.withdraw(wth);
                    System.out.println("Withdrawal completed.");
                    break;
                case 3:
                    account.interestCalculation();
                    System.out.println("Interests calculated and added to balance.");
                    break;
                case 4:
                    System.out.println(account);
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (action != 0);

        sc.close();
    }
}
    
