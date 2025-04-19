//*
//Una estación meteorológica necesita procesar las temperaturas máximas diarias registradas durante 30 días.
//Calcular la temperatura máxima, mínima y promedio del mes.
//Informar cuántos días tuvieron temperaturas superiores a 25 grados Celsius.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

import java.util.Scanner;

public class registroTemperatura {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int promediocalidos = 0; //CAntidad de días cálidos (Superiores a 25 °C).

        double [] temperatura = new double [30]; //Vector para almacenar las temperaturas.
        
        // Al ingresar la primera temperatura, se inicializan las variables max, min y suma.
        // entendiendo que la primera temperatura es la única registrada hasta el momento,
        // se toma como la referencia para calcular la máxima y mínima de los 30 días.
        System.out.println("Ingrese la temperatura registrada en los últimos 30 días: ");
        System.out.print("Dia 1:");
        double max = sc.nextDouble();
        double min = max;
        double suma = max;
        temperatura[0] = max;

        for (int i = 1; i < 30; i++){
            System.out.print("Dia " + (i + 1) + ":");
            temperatura[i] = sc.nextDouble();
            suma += temperatura[i];
            if (temperatura[i] > max){
                max = temperatura[i];
            }
            if (temperatura[i] < min){
                min = temperatura[i];
            }
            if (temperatura[i] > 25){
                promediocalidos++;
            }
        }
        sc.close();

        double promedio = suma/30; // Promedio de las temperaturas del mes.
        System.out.println("La temperatura promedio es: " + promedio+" grados celsius");
        System.out.println("La temperatura máxima registrada es: " + max+" grados celsius");
        System.out.println("La temperatura mínima registrada es: " + min+" grados celsius");
        System.out.println((promediocalidos == 0) ?  "No se registraron días cálidos." : "La cantidad de días cálidos (>25°C) fueron " + (promediocalidos));
        }
    }