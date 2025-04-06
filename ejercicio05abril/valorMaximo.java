//*
//Solicita al usuario igresar 8 números enteros en un vector.
//luego recoore el vector para encontrar el número mayor y
//muestra también su posición dentro del vector
//
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio05abril;

import java.util.Scanner;

public class valorMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[8];
        int maximo = 0; //Variable que almacena el número máximo
        short posicion = 0; // variable para la posición. EScogida como short, pues el máximo de la posición es 8
        System.out.println("Introduzca ocho (08) números enteros: ");
        for(short i=0; i<8;i++){
            System.out.print("Número " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
            }
        sc.close();
        
        //Recorre el vector para encontrar el número mayor
        for(short i=0; i<8;i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
                posicion = i;
            }
        }
        System.out.println("El número máximo introducido por usted fue " + maximo + " y se encuentra en la posición " + (posicion+1));
    }
}
