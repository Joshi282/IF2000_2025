/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author josha
 */

import java.time.LocalDateTime;
public class Log {
    private static int counter = 1;
    private int eventId;
    private String eventType;
    private LocalDateTime date;
    private String accountNumber;

    public Log(String eventType, String accountNumber) {
        this.eventId = counter++;
        this.eventType = eventType;
        this.date = LocalDateTime.now();
        this.accountNumber = accountNumber;
    }
     @Override
    public String toString() {
        return "Log{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                ", date=" + date +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
    
    
}
