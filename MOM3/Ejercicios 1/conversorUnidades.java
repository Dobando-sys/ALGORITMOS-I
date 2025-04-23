import java.util.Scanner;

public class conversorUnidades {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método que muestra el menú y llama a los métodos correspondientes
    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA DE CONVERSIONES DE UNIDADES ---");
            System.out.println("1. Metros a centímetros");
            System.out.println("2. Kilometros a metros");
            System.out.println("3. Grados Celsius a Fahrenheit");
            System.out.println("4. Grados Fahrenheit a Celsius");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    metrosCentimetros();
                    sc.close();
                    break;
                case 2:
                    kilometrosMetros();
                    sc.close();
                    break;
                case 3:
                    celsiusFahrenheit();
                    sc.close();
                    break;
                case 4:
                    fahrenheitCelsius();
                    sc.close();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

    }

    public static void metrosCentimetros() {
        System.out.println("Conversor de metros a centimetros");
        System.out.println("=====================================");
        System.out.println("Ingrese la cantidad de metros:");
        double resultado = sc.nextDouble();
        System.out.println("La media en centimetros es: " + resultado*100);
    }

    public static void kilometrosMetros() {
        System.out.println("Conversor de Kilometros a metros");
        System.out.println("=====================================");
        System.out.println("Ingrese la cantidad de Kilómetros:");
        double resultado = sc.nextDouble();
        System.out.println("La media en centimetros es: " + resultado*1000);
    }

    public static void celsiusFahrenheit() {
        System.out.println("Conversor de Celsius Fahrenheit");
        System.out.println("=====================================");
        System.out.println("Ingrese la cantidad de Celsius:");
        double resultado = sc.nextDouble();
        System.out.println("La media en centimetros es: " + ((1.8 * resultado) + 32));
    }

    public static void fahrenheitCelsius() {
        System.out.println("Conversor de Fahrenheit a Celsius");
        System.out.println("=====================================");
        System.out.println("Ingrese la cantidad de Fahrenheit:");
        double resultado = sc.nextDouble();
        System.out.println("La media en centimetros es: " + ((resultado - 32) / 1.8));
    }

}