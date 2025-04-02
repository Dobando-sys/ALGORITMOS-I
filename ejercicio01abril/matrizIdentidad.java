//Solicita al usuario un número entero n, y crea una matriz identidad de tamaño n x n.
//Tener en cuenta que la matriz identidad tiene 1 en la diagonal principal y 0 en las demás.      
//*
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio01abril;

import java.util.Scanner;

public class matrizIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz identidad: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Asignar 1 en la diagonal principal
                } else {
                    matriz[i][j] = 0; // Asignar 0 en las demás posiciones
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimir la matriz
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    
}
