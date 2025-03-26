import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número límite para calcular la serie de Fibonacci: ");
        int numeri = sc.nextInt();

        // Variable que representa el número actual de la serie
        int sumador = 1;
        // Variable que representa el número anterior de la serie
        int anterior = 1;
        sc.close();

        System.out.println("Su serie de Fibonnacci ");
        System.out.println("0");
        do {
            System.out.println(sumador);
            sumador = anterior + sumador; // Suma el número actual con el anterior
            anterior = sumador - anterior; // Se calcula la diferencia entre el nuevo número actual y el anterior
            
        } while (sumador <= numeri);
        
    }
}