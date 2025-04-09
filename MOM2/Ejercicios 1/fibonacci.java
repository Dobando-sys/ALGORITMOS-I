/*
 * Crea una serie de Fibonacci con un número límite indicado por el usuario.
 * Creado por Estevan Obando y Dayana Carreño
 */

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número límite para calcular la serie de Fibonacci: ");
        int numeri = sc.nextInt();

        if (numeri > 0) {
            int sumador = 1; // Variable que representa el número actual de la serie
            int anterior = 0; // Variable que representa el número anterior de la serie
            int contador =1; // Variable que lleva un seguimiento del número de iteraciones
            sc.close();

            if (numeri == 1){
                System.out.println("El primer número de la serie Fibonacci es: ");
                System.out.println("0");
            
            }else{
                System.out.println("Los primeros " + numeri + " números de la series Fibonacci son: ");
                System.out.println("0");
                do {
                    System.out.println(sumador);
                    sumador = anterior + sumador; // Suma el número actual con el anterior
                    anterior = sumador - anterior; // Se devuelve la suma para llevar registro del número que va antes en la serie.
                    contador++; //Lleva un seguimiento del número de iteraciones
                } while (contador < numeri); //Se repite hasta que se alcance el número de iteraciones indicado por el usuario
                
            }
            
        }else{
            System.out.println("El número ingresado no es válido. Por favor, ingrese un número mayor a 0.");
        }
        
    }
}