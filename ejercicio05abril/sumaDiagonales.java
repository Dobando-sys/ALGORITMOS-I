//Solicita al usuario un tamaño n (menor o igual a 5) y crea una matriz n x n. Llénala con
//datos ingresados por el usuario. Luego, calcula y muestra la suma de la diagonal principal
//y la diagonal secundaria.
//*
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio05abril;

import java.util.Scanner;

public class sumaDiagonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Ingrese el tamaño de la matriz cuadrada (debe ser menor a 5 y mayor a 1): ");
            n = sc.nextInt();
        } while (n < 2 || n > 5);
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos que desea en la matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int sumadiagonalp = 0;
        int sumadiagonali = 0;
        for (int i = 0; i < n; i++) {
            sumadiagonalp += matriz[i][i];
            sumadiagonali += matriz[i][n - 1 - i];
        }
        System.out.println("Aquí tienes la suma de los elementos ubicados en la diagonal principal: " + sumadiagonalp);
        System.out.println("Aquí tienes la suma de los elementos ubicados en la diagonal inversa: " + sumadiagonali);
        sc.close();
    }
}