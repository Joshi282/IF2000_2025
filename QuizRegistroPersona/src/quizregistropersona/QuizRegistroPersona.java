/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizregistropersona;

/**
 *
 * @author josha
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuizRegistroPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = readNotEmpty(sc, "Enter your full name: ");
        String id = readNotEmpty(sc, "Enter your ID: ");
        int age = readPositiveInt(sc, "Enter your age: ");
        String email = readValidEmail(sc, "Enter your email: ");
        String phone = readValidPhone(sc, "Enter your phone number: ");

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String registrationDate = dateTime.format(formatter);

        String line = fullName + "|" + id + "|" + age + "|" + email + "|" + phone + "|" + registrationDate;

        saveLine(line);

        System.out.println(" Registration saved in personas.txt");
    }

    // va a leer una cadena vacia
    public static String readNotEmpty(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("️ The value cannot be empty. Try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    // leer un numero entero positivo
    public static int readPositiveInt(Scanner sc, String prompt) {
        int number = -1;
        while (number <= 0) {
            System.out.print(prompt);
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    System.out.println("️ Enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("️ Enter a valid number.");
            }
        }
        return number;
    }

    // leer un email valido que contenga '@'
    public static String readValidEmail(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@")) {
                System.out.println("️ The email must contain '@'.");
            }
        } while (!email.contains("@"));
        return email;
    }

    // leer un numero valido solo digitos al menos 8
    public static String readValidPhone(Scanner sc, String prompt) {
        String phone;
        do {
            System.out.print(prompt);
            phone = sc.nextLine().trim();
            if (!phone.matches("\\d{8,}")) {
                System.out.println("️ The phone must have only digits and at least 8 numbers.");
            }
        } while (!phone.matches("\\d{8,}"));
        return phone;
    }

    // guarda linea de datos en persona.txt
    public static void saveLine(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("person.txt", true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving the file: " + e.getMessage());
        }
    }
}
