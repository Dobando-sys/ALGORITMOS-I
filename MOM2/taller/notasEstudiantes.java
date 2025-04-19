//*
//Un profesor necesita gestionar las notas de sus estudiantes en tres examenes diferentes para una asignatura.
//Permite que el profesor ingrese la cantidad de estudiantes y las notas de cada uno.
//Calcula el promedio de cada estudiante y determina si aprobaron o reprobaron (promedio >= 6).
//Genera un resumen con la cantidad de estudiantes aprobados y reprobados, así como el promedio de cada estudiante.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

import java.util.Scanner;

public class notasEstudiantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes de esta clase:");
        int CantidadEstudiantes = sc.nextInt(); //CAntidad de estudiantes.
        double[][] notas = new double[CantidadEstudiantes][3];
        double []promedio = new double[CantidadEstudiantes];
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("\nIngrese la nota de sus estudiantes: ");
        for(int i=0;i<CantidadEstudiantes;i++){
            double suma = 0;
            for(int j=0;j<3;j++){
                System.out.println("\nEstudiante " + (i+1) + ", examen " + (j+1) + ": ");
                notas[i][j] = sc.nextDouble();
                suma += notas[i][j]; // Almacenar la suma de las notas de cada estudiante en la asignatura.
            }
            promedio[i] = suma/3; //Vector para almacenar el promedio de cada estudiante.
        }
        sc.close();
        
        System.out.println("\n\n------------------------------------------------------------------");
        System.out.println("Resumen :");
        System.out.println("\nLa cantidad de estudiantes de esta clase es: \t" + CantidadEstudiantes);
        System.out.println("La cantidad de estudiantes aprobados es: \t" + aprobados + "\t(" + (aprobados*100/CantidadEstudiantes) + "%)");
        System.out.println("La cantidad de estudiantes reprobados es: \t" + reprobados + "\t(" + (reprobados*100/CantidadEstudiantes) + "%)\n");
        
        for(int i=0;i<CantidadEstudiantes;i++){
            System.out.println("Estudiante " + (i+1) + ", promedio: \t" + promedio[i]);
            System.out.println((promedio[i]>=6)?"El estudiante " + (i+1) + " ha aprobado." : "El estudiante " + (i+1) + " ha reprobado.");
            System.out.println("****\n");
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Fin del reporte.");
        System.out.println("------------------------------------------------------------------");
    }
}
