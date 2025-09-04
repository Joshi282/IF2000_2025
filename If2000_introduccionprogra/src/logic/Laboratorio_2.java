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
public class Laboratorio_2 {
  
    public void sumaPares2a1000() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("Suma de pares entre 2 y 1000: " + suma);
    }
    
     public void convertirCelsiusAFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese temperatura en Celsius: ");
        double c = sc.nextDouble();
        double f = 9.0 / 5 * c + 32;
        System.out.println("Temperatura en Fahrenheit: " + f);
    }

    // 15. Potencia X^n
    public void potencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese base X: ");
        int x = sc.nextInt();
        System.out.print("Ingrese exponente n: ");
        int n = sc.nextInt();
        int resultado = (int) Math.pow(x, n);
        System.out.println("Resultado: " + resultado);
    }

    // 16. Número a mes
    public void numeroAMes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero del 1 al 12: ");
        int num = sc.nextInt();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (num >= 1 && num <= 12)
            System.out.println("Mes: " + meses[num - 1]);
        else
            System.out.println("Numero inválido");
    }

    // 17. Evaluación de función F(x)
    public void evaluarFuncion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese valor de x: ");
        int x = sc.nextInt();
        int resultado;
        if (x > 0)
            resultado = x + 5;
        else if (x < 0)
            resultado = x * x;
        else
            resultado = 1;
        System.out.println("F(x) = " + resultado);
    }

    // 18. Área de triángulo por Herón
    public void areaTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese lado c: ");
        double c = sc.nextDouble();
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("area del triángulo: " + area);
    }

    // 19. Intercambiar valores A y B
    public void intercambiarValores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese B: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Despues del intercambio: A = " + a + ", B = " + b);
    }

    // 20. Ecuación de la recta
    public void ecuacionRecta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese X0: ");
        double x0 = sc.nextDouble();
        System.out.print("Ingrese Y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Ingrese X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese Y1: ");
        double y1 = sc.nextDouble();

        double m = (y1 - y0) / (x1 - x0);
        double b = y0 - m * x0;

        System.out.println("Ecuacion de la recta: y = " + m + "x + " + b);
    }

    // 21. Suma de naturales menores a K
    public void sumaNaturales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese K: ");
        int k = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        System.out.println("Suma: " + suma);
    }

    // 22. Promedio de números positivos
    public void promedioNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros positivos quiere ingresar: ");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            double num = sc.nextDouble();
            if (num > 0)
                suma += num;
        }
        double promedio = suma / n;
        System.out.println("Promedio: " + promedio);
    }

    // 23. Suma pares, impares, totales
    public void analisisDiezNumeros() {
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0, sumaImpares = 0, total = 0, pares = 0, impares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int num = sc.nextInt();
            total += num;
            if (num % 2 == 0) {
                sumaPares += num;
                pares++;
            } else {
                sumaImpares += num;
                impares++;
            }
        }
        System.out.println("Suma total: " + total);
        System.out.println("Pares: " + pares + ", Suma pares: " + sumaPares);
        System.out.println("Impares: " + impares + ", Suma impares: " + sumaImpares);
    }

    // 24. Suma pares e impares entre 1 y 200
    public void sumaParesImpares200() {
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0)
                sumaPares += i;
            else
                sumaImpares += i;
        }
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }

    // 25. Suma de cuadrados de los 100 primeros números
    public void sumaCuadrados() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("Suma de cuadrados: " + suma);
    }

    // 26. Factorial de un número
    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        System.out.println(n + "! = " + resultado);
    }

    // 27. Valor máximo de una serie de 10 números
    public void maximoDeDiez() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int num = sc.nextInt();
            if (num > max)
                max = num;
        }
        System.out.println("El numero mayor es: " + max);
    }
    
    
 
    
    
    
    
    
    
}

    

