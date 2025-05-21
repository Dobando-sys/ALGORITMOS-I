package taller;

import java.util.Scanner;

public class ValidadorCedula {
    public static final int CANTIDAD_MAXIMA_CHAR = 10;

    public static boolean esFormatoCedulaValido(String numeroCedula) {
        if (numeroCedula.length() < CANTIDAD_MAXIMA_CHAR || numeroCedula.charAt(0) == '0') {
            return false;
        }

        for (char c : numeroCedula.toCharArray()) {
            if (Character.isDigit(c)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenido al sistema validador de formato de cédula:");

        do{
            System.out.println("------------------------------------------");
            System.out.println("Por favor, ingrese su número de cédula:");

            String numeroCedula = scanner.nextLine();

            if (esFormatoCedulaValido(numeroCedula)){
                System.out.println("Formato de cédula VÁLIDO.");
            } else {
                System.out.println("formato de cédula INVÁLIDO.");
            }

            System.out.println("¿Desea validar otro número de cédula? (s/N):");
            String respuesta = scanner.nextLine();
            if(respuesta.equalsIgnoreCase("N")){
                continuar = false;
            } else if (respuesta.equalsIgnoreCase("s")){
                continuar = true;
            } else {
                System.out.println("Opción no válida. Saliendo del programa.");
                continuar = false;
            }
        }while (continuar);
        System.out.println("\n-------------------------------------------");
        System.out.println("Gracias por usar el sistema validador de formato de cédula.");
        System.out.println("-------------------------------------------\n");
        scanner.close();
    }
}
