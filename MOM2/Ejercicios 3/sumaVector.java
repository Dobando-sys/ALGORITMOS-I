//Crea un programa que solicite al usuario ingresar 5 números enteros en un vector.
//Luego el programa debe calcular y mostrar la suma de todos los números ingresados.   
//*
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio01abril;
import java.util.Scanner;
public class sumaVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0; // Variable para almacenar la suma

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); // Leer el número
            suma+= numeros[i]; // Sumar el número al total
        }

        sc.close();

        System.out.println("La suma de los números ingresados es: " + suma); // Mostrar la suma
    }
    
}
