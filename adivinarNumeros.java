import java.util.Scanner;
import java.util.Random;

public class adivinarNumeros {
    Scanner sc= new Scanner(System.in); // Scanner global
    Random random = new Random(); // Generador de números aleatorios
    int numeroAleatorio;
    int intentos;
    int maxIntentos;
    boolean terminar = false;

    public static void main(String[] args()){
        instrucciones();
    }

    public stactic void instrucciones(){
        System.out.println("Bienvenido al juego de adivinar el número.");
        System.out.println("He elegido un número entre 1 y 100. Tienes 10 intentos para adivinarlo.");
        System.out.println("Si adivinas el número, ganarás. Si no, perderás.");
        System.out.println("Buena suerte!");
    }
}
