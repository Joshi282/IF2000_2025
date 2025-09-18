/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2000_lab3;

/**
 *
 * @author josha
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private static int counter = 1;
    private int eventId;
    private String eventType; // deposit or withdraw
    private String date;
    private Account account;

    public Log(String eventType, Account account) {
        this.eventId = counter++;
        this.eventType = eventType;
        this.account = account;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Log{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                ", date='" + date + '\'' +
                ", accountNumber='" + account.getAccountNumber() + '\'' +
                ", client='" + account.getClient().getName() + " " + account.getClient().getLastName() + '\'' +
                ", balance=" + account.getBalance() +
                '}';
    }
}
    

