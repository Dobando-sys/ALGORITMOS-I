import java.util.Scanner;
public class evaluacionedades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int contadorMayores = 0;
        int contadorMenores = 0;

        while (true) {
            System.out.println("Ingrese la edad de la persona (números negativos para finalizar): ");
            edad = sc.nextInt();
            if (edad < 0) {
                break; // Salir del bucle si la edad es negativa
            }
            if (edad >= 18) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }
        }

        sc.close(); // Cerrar el Scanner correctamente
        System.out.println("Las personas mayores de edad son: " + contadorMayores);
        System.out.println("Las personas menores de edad son: " + contadorMenores);
    }
}