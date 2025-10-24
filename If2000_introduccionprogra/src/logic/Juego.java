/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author jos
 */

import java.util.Scanner;
public class Juego {
    private Tablero tablero;
    private char turno; 
    private Scanner scanner;

    public Juego() {
        tablero = new Tablero();
        turno = 'R'; 
        scanner = new Scanner(System.in);
    }

    public void jugar() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Turno de las " + (turno == 'R' ? "rojas (R)" : "negras (B)"));
            tablero.mostrar();

            System.out.print("Fila origen: ");
            int filaOrigen = scanner.nextInt();
            System.out.print("Columna origen: ");
            int columnaOrigen = scanner.nextInt();
            System.out.print("Fila destino: ");
            int filaDestino = scanner.nextInt();
            System.out.print("Columna destino: ");
            int columnaDestino = scanner.nextInt();

            boolean movimientoValido = tablero.moverFicha(filaOrigen, columnaOrigen, filaDestino, columnaDestino, turno);

            if (movimientoValido) {
                turno = (turno == 'R') ? 'B' : 'R'; // es para cambiar el turno
            }

            System.out.print("quiere continuar jugando? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }
     
}
