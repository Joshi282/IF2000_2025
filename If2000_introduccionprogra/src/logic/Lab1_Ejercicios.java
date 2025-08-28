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

public class Lab1_Ejercicios {
    private Scanner sc;

    public Lab1_Ejercicios() {
        sc = new Scanner(System.in);  
    }

    public void ejercicio1() {
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR.");
        } else {
            System.out.println("El numero " + numero + " es IMPAR.");
        }
    }

    public void ejercicio2() {
        System.out.print("Ingrese un numero (puede ser negativo): ");
        int numero = sc.nextInt();

        int valorAbsoluto = (numero < 0) ? -numero : numero;

        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
    
    public void ejercicio3() {
        int suma = 0;
        System.out.print("Serie: ");

        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i);
            suma += i;
            if (i < 99) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
        System.out.println("Suma total: " + suma);
    }
    
     public void ejercicio4() {
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Numeros en orden ascendente: " + num1 + ", " + num2 + ", " + num3);
    }
     
     public void ejercicio5() {
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int resultado;

        if (num1 == num2) {
            resultado = num1 * num2;
            System.out.println("Los numeros son iguales. Resultado de la multiplicación: " + resultado);
        } else if (num1 > num2) {
     resultado = num1 - num2;
            System.out.println("El primero es mayor. Resultado de la resta: " + resultado);
        } else {
            resultado = num1 + num2;
            System.out.println("El segundo es mayor. Resultado de la suma: " + resultado);
        }
    }
     
      public void ejercicio6() {
        boolean hayDiez = false;
        int nota;

        System.out.println("Ingrese las notas (0 a 10). Ingrese -1 para terminar.");

        while (true) {
            System.out.print("Nota: ");
            nota = sc.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Debe estar entre 0 y 10, o -1 para salir.");
                continue;
            }

            if (nota == 10) {
                hayDiez = true;
            }
        }

        if (hayDiez) {
            System.out.println("Si hubo al menos una nota con valor 10.");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }
    }
      public void ejercicio7() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su sexo (F para femenino, M para masculino): ");
        String sexo = sc.nextLine().toUpperCase();

        double pulsaciones;

        if (sexo.equals("F")) {
            pulsaciones = (220 - edad) / 10.0;
            System.out.println("Numero de pulsaciones cada 10 segundos (Femenino): " + pulsaciones);
        } else if (sexo.equals("M")) {
            pulsaciones = (210 - edad) / 10.0;
            System.out.println("Numero de pulsaciones cada 10 segundos (Masculino): " + pulsaciones);
        } else {
            System.out.println("Sexo inválido. Use 'F' para femenino o 'M' para masculino.");
        }
    }
public void ejercicio8() {
        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese los anios de antiguedad en la empresa: ");
        double antiguedad = sc.nextDouble();

        double porcentaje;

        if (antiguedad < 1) {
            porcentaje = 0.05;
        } else if (antiguedad < 2) {
            porcentaje = 0.07;
        } else if (antiguedad < 5) {
            porcentaje = 0.10;
        } else if (antiguedad < 10) {
            porcentaje = 0.15;
        } else {
            porcentaje = 0.20;
        }

        double utilidad = salario * porcentaje;

        System.out.println("La utilidad anual que le corresponde es: $" + utilidad);
    }

  public void ejercicio9() {
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El numero no es primo.");
            return;
        }

        boolean esPrimo = true;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
  
  
    public void ejercicio10() {
        final double PRECIO_UNITARIO = 11000;

        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = sc.nextInt();

        double totalSinDescuento = cantidad * PRECIO_UNITARIO;
        double descuento = 0;

        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad < 10) {
      descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        double montoDescuento = totalSinDescuento * descuento;
        double totalConDescuento = totalSinDescuento - montoDescuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: $" + totalSinDescuento);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Total a pagar con descuento: $" + totalConDescuento);
    }

    public void ejercicio11() {
        System.out.print("Ingrese un numero natural N (mayor o igual a 2): ");
        int N = sc.nextInt();

        if (N < 2) {
            System.out.println("Error: N debe ser mayor o igual a 2.");
            return;
        }

        System.out.println("Numeros primos entre 2 y " + N + ":");
        for (int num = 2; num <= N; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }
      private boolean esPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
       public void ejercicio12() {
        System.out.print("Ingrese la base del triangulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triangulo es: " + area);
    }
    public void cerrarScanner() {
        sc.close();
    }
}
     
    


