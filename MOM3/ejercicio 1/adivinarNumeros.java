//*
//Juego de adivinar un número.
//El usuario tiene que adivinar un número entre 1 y 100.
//cuenta con 10 intentos (modificable) para adivinar el número.
//El programa le da pistas al usuario si el número es mayor o menor que el número a adivinar.
//Además, le da pistas de si el número está caliente, tibio o frío.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

import java.util.Scanner;
import java.util.Random;

public class adivinarNumeros {
    static Scanner sc= new Scanner(System.in); // Scanner global. Se cierra en el método main.
    static int maxIntentos = 10; // Número máximo de intentos

    public static void main(String[] args){
        instrucciones();
        sc.close();
    }

    public static void instrucciones(){
        System.out.println("\nBienvenido al juego de adivinar el número.");
        System.out.println("He elegido un número entre 1 y 100.");
        System.out.println("Si adivinas el número, ganarás. Si no, perderás.");
        System.out.println("Tienes "+ maxIntentos + ". ¡Buena suerte!");

        System.out.println("¿Quieres jugar? (s/n)");
        String respuesta = sc.nextLine(); // Leer respuesta del usuario
        if(respuesta.equalsIgnoreCase("s")){
            iniciarJuego(); // Llamar al método para iniciar el juego
        } else {
            System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        }
    }

    public static void iniciarJuego(){
        Random random = new Random(); // Generador de números aleatorios
        int numeroAdivinar = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0; // Contador de intentos

        System.out.println("\n=====================================================================");
        for(int i=0; i < maxIntentos; i++){
            System.out.print("\nIntroduce un número entre 1 y 100: ");
            int numeroUsuario = sc.nextInt();
            intentos++; // Incrementar contador de intentos
            
            if (numeroUsuario < 1 || numeroUsuario > 100){
                System.out.println("Número fuera de rango. Debe ser entre 1 y 100.");
                intentos--; // No contar este intento
                continue; // Volver a pedir un número
            }

            if(numeroUsuario == numeroAdivinar){
                System.out.println("\n=====================================================================\n");
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break; // Salir del bucle si adivina el número
            } else if(numeroUsuario < numeroAdivinar){
                // Dar pistas sobre la cercanía del número
                if (Math.abs(numeroUsuario - numeroAdivinar) <= 5) {
                    System.out.print("¡Muy caliente! El número está realmente cerca");
                }else if (Math.abs(numeroUsuario - numeroAdivinar) <= 10) {
                    System.out.print("¡Caliente! El número está cerca");
                }else if (Math.abs(numeroUsuario - numeroAdivinar) <= 20) {
                    System.out.print("¡Tibio! El número está un poco lejos");
                } else if (Math.abs(numeroUsuario - numeroAdivinar) <= 30) {
                    System.out.print("¡Frío! El número está lejos");
                }else {
                    System.out.print("¡Helado! El número está muy lejos");
                } 
                System.out.println(" y es mayor. Intenta de nuevo.");
                System.out.println("Intentos restantes: " + (maxIntentos - intentos)); //Indica la cantidad de intentos restantes
            } else {
                // Dar pistas sobre la cercanía del número
                if (Math.abs(numeroUsuario - numeroAdivinar) <= 5) {
                    System.out.print("¡Muy caliente! El número está realmente cerca");
                }else if (Math.abs(numeroUsuario - numeroAdivinar) <= 10) {
                    System.out.print("¡Caliente! El número está cerca");
                }else if (Math.abs(numeroUsuario - numeroAdivinar) <= 20) {
                    System.out.print("¡Tibio! El número está un poco lejos");
                } else if (Math.abs(numeroUsuario - numeroAdivinar) <= 30) {
                    System.out.print("¡Frío! El número está lejos");
                }else {
                    System.out.print("¡Helado! El número está muy lejos");
                } 
                System.out.println(" y es menor. Intenta de nuevo.");
                System.out.println("Intentos restantes: " + (maxIntentos - intentos)); //Indica la cantidad de intentos restantes
            }
        }

        if(intentos == maxIntentos){
            // Si se agotan los intentos, mostrar el número objetivo.
            System.out.println("\n=====================================================================\n");
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAdivinar);
        }
    }
}
