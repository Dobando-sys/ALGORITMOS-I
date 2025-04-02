//Solicita al usuario ingresar 10 números en un vector.
//Después pide un número y verifica si este se encuentra dentro del vector.
//Muestra un mensaje indicando si fue encontrado o no.	 
//*
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio01abril;

import java.util.Scanner;

public class buscarNumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[10];
        byte encontrado = 0;
        System.out.println("Ingrese 10 números enteros: ");
        
        for(int i=0; i<10;i++){
            System.out.println((i+1)+ " número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Ingrese el número a buscar: ");
        int numero = sc.nextInt();

        for(int i=0; i<10;i++){
            if(numeros[i] == numero){
                encontrado = 1;
                System.out.println("El número " + numero + " fue encontrado en la posición " + i);
                break; // Salir del bucle si se encuentra el número
            }
        }

        if(encontrado == 0){
            System.out.println("El número " + numero + " no fue encontrado en el arreglo.");
        }
        sc.close();
    }
}
