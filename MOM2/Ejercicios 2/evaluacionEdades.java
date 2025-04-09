//*
//Un programa solicita repetidamente la edad de varias personas
//hasta que el usuario ingresa un valor negativo.
//Al finalizar, el programa muestra cuántas personas
//son menores de edad (menos de 18 años) y cuántas son mayores de edad.
//
//Creado por Dayana Carreño y Estevan Obando
//*

import java.util.Scanner;
public class evaluacionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int contadorMayores = 0;
        int contadorMenores = 0;

        while (true) {
            System.out.println("Ingrese la edad de la persona (números negativos para finalizar): ");
            edad = sc.nextInt();
            if (edad < 0) {
                break; // Salir del bucle si la edad es negativa
            }
            if (edad >= 18) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }
        }

        sc.close();
        System.out.println("Las personas mayores de edad son: " + contadorMayores);
        System.out.println("Las personas menores de edad son: " + contadorMenores);
    }
}
