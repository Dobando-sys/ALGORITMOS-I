package MOM2.EjercicioExtra;
import java.util.Scanner;

import java.util.Random;

public class EstadisticoEstudiantes {
    public static void main(String[] args) {
        // Definición de variables
        int [][] notasEstudiantes = new int[5][4];
        String [] nombres = new String[]{"EStudiante1", "EStudiante2", "EStudiante3", "EStudiante4", "EStudiante5"};

        Random aleatorio = new Random(System.currentTimeMillis()); // Generador de números aleatorios

        // Llenar la matriz con notas aleatorias entre 0 y 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                notasEstudiantes[i][j] = aleatorio.nextInt(101); // Llenar con notas entre 0 y 100
            }
        }

        System.out.println("\nBienvenidos al sistema de gestión de notas");
        System.out.println("El estado actual de los estudiantes es el siguiente:");
        System.out.println("\nIndice\tNombre\tnota\tpromedio");
        System.out.println("-------------------------------------------------");

        // Mostrar la matriz de notas y calcular el promedio
        for (int i = 0; i < 5; i++) {
            int sumaNotas = 0;
            System.out.print((i+1) + "\t" + nombres[i] + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(notasEstudiantes[i][j] + "\t");
                sumaNotas += notasEstudiantes[i][j];
            }
            double promedio = (double) sumaNotas / 4;
            System.out.println(promedio);
        }
        System.out.println("-------------------------------------------------");
        

    }
    
}
