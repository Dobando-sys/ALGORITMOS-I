import java.util.Scanner;
public class promedio {
    public static void main(String[]args){
        int suma = 0;
        int numeroUsuario;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Ingrese el número (0 para finalizar):"); 
            numeroUsuario = sc.nextInt();
            if (numeroUsuario == 0) {
                break; // Salir del bucle si numeroUsuario es == 0
            } if (numeroUsuario > 0) {
                suma += numeroUsuario; 
                contador++;
            } 
        }
        sc.close();
        if (contador > 0) {
            double promedio = (double) suma /contador;
            System.out.println("El promedio es: " + promedio);
            } else {
                System.out.println("Los numeros ingresados no son postivos y/o son iguales a 0");
            }
        }
    }