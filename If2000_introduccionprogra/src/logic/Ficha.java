/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josha
 */
public class Ficha {
          private char color;
      public Ficha(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }
     @Override
    public String toString() {
        return String.valueOf(color);
    }

}
    

