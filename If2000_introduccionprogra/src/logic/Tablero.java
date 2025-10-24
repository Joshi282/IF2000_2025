/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josha
 */
public class Tablero{
    
     private char[][] tablero;

    public Tablero() {
        tablero = new char[8][8];
        inicializar();
    }

    private void inicializar() {
        
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 1) {
                    tablero[fila][col] = 'R';
                }
            }
        }

       
        for (int fila = 5; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 1) {
                    tablero[fila][col] = 'B';
                }
            }
        }
    }

    public void mostrar() {
        System.out.println("   0 1 2 3 4 5 6 7");
        for (int fila = 0; fila < 8; fila++) {
            System.out.print(fila + " ");
            for (int col = 0; col < 8; col++) {
                char ficha = tablero[fila][col];
                if (ficha == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(ficha + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean moverFicha(int origenFila, int origenCol, int destinoFila, int destinoCol, char turno) {
        if (!posicionValida(origenFila, origenCol) || !posicionValida(destinoFila, destinoCol)) {
            System.out.println("Posicion fuera del tablero.");
            return false;
        }

        char ficha = tablero[origenFila][origenCol];
        if (ficha != turno) {
            System.out.println("No puedes mover una ficha del otro color.");
            return false;
        }

        if (tablero[destinoFila][destinoCol] != 0) {
            System.out.println("La casilla destino esta ocupada.");
            return false;
        }

        
        if (turno == 'R' && destinoFila <= origenFila) {
            System.out.println("Las rojas solo se mueven hacia abajo.");
            return false;
        }

        
        if (turno == 'B' && destinoFila >= origenFila) {
            System.out.println("Las negras solo se mueven hacia arriba.");
            return false;
        }

        
        int diferenciaFila = Math.abs(destinoFila - origenFila);
        int diferenciaCol = Math.abs(destinoCol - origenCol);

        if (diferenciaFila == 1 && diferenciaCol == 1) {
            tablero[destinoFila][destinoCol] = ficha;
            tablero[origenFila][origenCol] = 0;
            return true;
        } else {
            System.out.println("Movimiento invalido. Solo se puede mover una casilla en diagonal.");
            return false;
        }
    }

    private boolean posicionValida(int fila, int col) {
        return fila >= 0 && fila < 8 && col >= 0 && col < 8;
    }
}