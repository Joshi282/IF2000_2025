/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josha
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
   
  
   public void ejercicioA(int n){
     
       for (int j = 1; j <= n; j++) {
            System.out.print("*    ");
        }
        System.out.println();

        // filas intermedia
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*    "); 

            for (int j = 1; j <= n - 2; j++) {
                System.out.print("     "); 
            }

            System.out.print("*    "); 
            System.out.println();
        }
          for (int j = 1; j <= n && n > 1; j++) {
            System.out.print("*    ");
        }
        System.out.println();
   }
        public void ejercicioB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    public void ejercicioC(int n) {
    for (int i = 0; i < n; i++) {
        // Espacios
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }

        // Asteriscos
        for (int k = 0; k < n - i; k++) {
            System.out.print("*");
        }

        // Salto de línea
        System.out.println();
    }
}
     public void ejercicioD() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");

        // Entrada de datos
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

       
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }  
     public void ejercicioE() {
        Integer[] numeros = new Integer[100];
        Random random = new Random();

       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000); // Números del 0 al 999
        }

        
        Arrays.sort(numeros, Collections.reverseOrder());

        
        System.out.println("Arreglo ordenado en forma descendente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
public void ejercicioF() {
    String[][] tablero = new String[8][8];

    
    for (int fila = 0; fila < 8; fila++) {
        for (int col = 0; col < 8; col++) {
            tablero[fila][col] = " ";
        }
    }
     for (int fila = 0; fila < 3; fila++) {
        for (int col = 0; col < 8; col++) {
            if ((fila + col) % 2 != 0) {
                tablero[fila][col] = "N";
            }
        }
    }
     
      for (int fila = 5; fila < 8; fila++) {
        for (int col = 0; col < 8; col++) {
            if ((fila + col) % 2 != 0) {
                tablero[fila][col] = "R";
            }
        }
    }
      
      System.out.println("  1    2    3    4    5    6    7    8");

    
    char filaLetra = 'A';

    for (int fila = 0; fila < 8; fila++) {
        System.out.print(filaLetra + " ");
        for (int col = 0; col < 8; col++) {
            System.out.print(tablero[fila][col] + "    ");
        }
        System.out.println();
        filaLetra++;
    }
}

        
          }


      
   


         
              
            
     
          
               
           
    
          
    
           
       
     
   
   
    

