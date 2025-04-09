//Crea una matriz de 3x4 donde se almacenen las notas de 3 estudiantes en 4 asignaturas.
//Solicita al usuario ingresar todas las notas.
//Luego, calcula y muestra el promedio de cada estudiante.      
//
//*
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio01abril;

import java.util.Scanner;

public class notasPromedio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double [][] notas = new double[3][4]; // Matriz de 3 estudiantes y 4 asignaturas
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota del estudiante " + (i + 1) + " en la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); // Leer la nota
            }
        }

        sc.close(); // Cerrar el escáner

        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j]; // Sumar las notas del estudiante
            }
            double promedio = suma / 4; // Calcular el promedio
            System.out.println("El promedio del estudiante " + (i + 1) + " es: " + promedio); // Mostrar el promedio
        }
    }
}
