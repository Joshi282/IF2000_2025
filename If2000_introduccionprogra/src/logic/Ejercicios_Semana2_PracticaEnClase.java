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

public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
   
  
   public void ejercicioA(int n){
     
       for (int j = 1; j <= n; j++) {
            System.out.print("*    ");
        }
        System.out.println();

        // Filas intermedias
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*    "); // Primer asterisco

            for (int j = 1; j <= n - 2; j++) {
                System.out.print("     "); // Espacios en el centro
            }

            System.out.print("*    "); // Último asterisco
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

        // Ordenamiento burbuja ascendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }      
      
   }


         
              
            
     
          
               
           
    
          
    
           
       
     
   
   
    

