//* 
//Un docente quiere ingresar las calificaciones de sus estudiantes (entre 0 y 100).
//El programa termina cuando ingresa -1. Al finalizar, el programa debe mostrar
//cuántos estudiantes aprobaron (nota ≥ 60) y cuántos reprobaron.
//
//Creado por Dayana Carreño y Estevan Obando
//*

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nota: Variable que representa la nota del alumno
        //aprobados, reprobados, total: Variables que representan la cantidad de alumnos aprobados, reprobados y el total de alumnos, respectivamente.
        short nota = 0;
        int aprobados = 0, reprobados = 0, total = 0; 
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
