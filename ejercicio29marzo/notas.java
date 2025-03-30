//* 
//Agregar descripión de la presentación
//Creado por Estevan Obando y Dayana Carreño
//

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short nota = 0; //Variable que representa la nota del alumno
        int aprobados = 0, reprobados = 0, total = 0; //Variables que representan la cantidad de alumnos aprobados, reprobados y el total de alumnos

        // Si la nota es -1, se sale del bucle.
        System.out.println("Ingrese la nota de los alumnos (entre 0 y 100). Para cerrar el programa, ingrese -1.");
        while (nota != -1) {
            System.out.println("Introduce la nota del alumno " + (total+1) + ": ");
            nota = sc.nextShort();
            
            //* Valida que la nota se encuentre en el rango correcto.
            // Si la nota es válida, se incrementa el contador de aprobados o reprobados (Se aprueba con nota de 60 o más).
            if (nota <= 100 && nota >= 0) {
                if (nota >= 60) {
                    aprobados++;
                    total++;
                } else {
                    reprobados++;
                    total++;
                }
            } else if (nota == -1) {
                break;
            }else {
                System.out.println("La nota no es válida. La nota debe estar entre 0 y 100.");
            }
        }
        sc.close();

        // Se imprime el resultado de la cantidad de alumnos aprobados y reprobados.
        // Si no se han ingresado notas, se imprime un mensaje indicando que no se han ingresado notas.
        if (total == 0) {
            System.out.println("No se han ingresado notas.");
        } else {
            System.out.println("Del total de alumnos ingresados (" + total + "): ");
            System.out.println("Aprobaron: " + aprobados  + " estudiantes (" + (100*aprobados/ total) + "%).");
            System.out.println("Reprobaron: " + reprobados + " estudiantes (" + (100*reprobados/ total) + "%).");
        }
    }
}