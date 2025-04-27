package MOM3.ejercicio_2;
import java.util.Scanner;

public class contadorNumeros {
    private static Scanner sc = new Scanner(System.in); // Scanner global

    public static void main(String[] args){
        menu();
        sc.close();
    }

    private static void menu(){
        boolean terminar = false;
        while (!terminar) {
            System.out.print("Seleccione una opción:\n1. Contar números\n2. Salir\n");
            int opcion = sc.nextInt();
            
            if (opcion == 1) {
                contarNumeros();
                terminar = true; // Termina el ciclo después de contar números
            } else if (opcion == 2){

                terminar = true;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        System.out.println("Gracias por usar el programa.\nHasta luego.");
    }

    private static void contarNumeros(){
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        boolean terminar = false;
        while (!terminar) {
            System.out.print("Ingrese un número (para terminar ingrese -1): ");
            int numero = sc.nextInt();
            if (numero == -1) {
                terminar = true;
            } else if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }else if (numero == 0) {
                System.out.println("El número 0 no se cuenta como positivo ni negativo.");
                cero++;
            } else {
                System.out.println("Número no válido. Intente de nuevo.");

            }
        }
        System.out.println("\n=================================================\n");
        System.out.println("Resultados:\n");
        System.out.println("Cantidad de números positivos:\t" + positivos);
        System.out.println("Cantidad de números negativos:\t" + negativos);
        System.out.println("Cantidad de ceros:\t\t" + cero);
        System.out.println("\nCantidad de números ingresados:\t" + (positivos + negativos + cero));
        System.out.println("\n=================================================");
    }
}
