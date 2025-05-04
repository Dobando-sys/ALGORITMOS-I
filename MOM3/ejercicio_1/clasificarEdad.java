//*
//Desarrollar un programa que pida ingresar edades y clasifique cada edad como "Menor de 
//edad" o "Mayor de edad". El usuario puede finalizar escribiendo 0. Se deben usar 
//condicionales, un ciclo y métodos sin argumentos ni retorno.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

import java.util.Scanner;

public class clasificarEdad {
    static Scanner sc = new Scanner(System.in);
    static int edad; // Variable global para almacenar la edad ingresada por el usuario

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        do {
            System.out.println("Sistema de clasificación de edades. Instrucciones.");
            System.out.println("1. Escriba la edad a clasificar en el apartado.");
            System.out.println("2. La edad debe ser un número entero positivo.");
            System.out.println("3. Para finalizar el programa, escriba el número 0 en el apartado.\n");
            System.out.print("Ingrese la edad: ");

            edad = sc.nextInt();

            if (edad == 0) {
                System.out.println("Gracias por usar el sistema de clasificación de edades. ¡Hasta la próxima!\n");
            } else if (edad > 0) {
                clasificar();
            } else {
                System.out.println("Edad inválida. Por favor, ingrese un número positivo.\n");
            }

        } while (edad != 0);
    }

    public static void clasificar() {
        if (edad < 18) {
            System.out.println("La edad ingresada (" + edad + " años) corresponde a un menor de edad.\n");
        } else {
            System.out.println("La edad ingresada (" + edad + " años) corresponde a un mayor de edad.\n");
        }
    }
}

