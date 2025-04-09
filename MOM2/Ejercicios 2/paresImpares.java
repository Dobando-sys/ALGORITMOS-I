//* 
//Pide al usuario ingresar 10 números enteros.
//Luego, muestra cuántos de estos números son pares y cuántos son impares.
//
//Creado por Dayana Carreño y Estevan Obando
//*

import java.util.Scanner;
public class paresImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0; //Variable que representa el número ingresado por el usuario
        short par = 0, impar = 0; //Variables que representan la cantidad de números pares e impares, respectivamente.
        System.out.println("Ingrese 10 números enteros: ");
        for (int i=1; i <= 10; i++) {
            System.out.println(i + " número:");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        sc.close();
    
    // Se imprime el resultado de la cantidad de alumnos aprobados y reprobados.
    System.out.println("De los 10 números ingresados: ");
    System.out.println(par  + " son pares (" + (10*par) + "%).");
    System.out.println(impar  + " son impares (" + (10*impar) + "%).");
    }
}
