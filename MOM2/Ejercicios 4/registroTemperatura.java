//Crea un vector para almacenar la temperatura durante 7 días.
//Pida al usuario que ingrese cada temperatura. Calcula el promedio.
//Si alguna temperatura supera los 38 grados, imprima un mensaje de advertencia.     
//*
//Creado por Dayana Carreño y Estevan Obando
//*


package ejercicio05abril;

import java.util.Scanner;

public class registroTemperatura {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        double [] numeros = new double [7];
        double suma = 0; //suma de las temperaturas de la semana
        double promedio = 0; //promedio de la semana
        for (int i = 0; i < 7; i++){
            System.out.println("Ingrese la temperatura del día " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        promedio = suma / 7;
        boolean temperaturaAlta = false;
        for (int i = 0; i < 7; i++) {
            if (numeros[i] > 38){
                temperaturaAlta = true;
                break;
            }
        }
        if (temperaturaAlta){
            System.out.println("¡Cuidado! Riesgo de fiebre, (Alguna o varias temperaturas superaron los 38°)");
        } else {
            System.out.println("Las temperaturas son regulares, el promedio de la semana fue " + promedio + "°");
        }
        
        sc.close();
    }
}
