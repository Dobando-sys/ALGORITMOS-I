//*
//Crea una calculadora capaz de calcular el área de un círculo, cuadrado, rectángulo y triángulo.
//Pide al usuario que elija una opción y luego solicita los datos necesarios para calcular el área correspondiente.
//Cada figura tiene un método diferente para calcular su área.
//Los métodos no deben aceptar parámetros ni retornar valores.
//El programa debe tener un menú que permita al usuario elegir la figura y calcular su área.
//
//Creado por Dayana Carreño y Estevan Obando
//*
import java.util.Scanner;

public class calculadoraAreas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int varControl = 0;
        boolean terminar = false;
        while (terminar == false) {
            
            System.out.println("=====================================");
            System.out.println("Bienvenido a la calculadora de áreas, ¿Qué desea conocer?:");
            System.out.println("1. Área de un círculo\r\n" +
                    "2. Área de un cuadrado\r\n" +
                    "3. Área de un rectángulo\r\n" +
                    "4. Área de un triángulo\r\n" +
                    "5. Salir\r\n");
            varControl = sc.nextInt();
            if(varControl<1 || varControl>5){
                System.out.println("Opción no válida. Intente nuevamente.");
            }else if(varControl==5){
                System.out.println("Gracias por usar la calculadora de áreas. ¡Hasta luego!");
                terminar = true;
                sc.close();
                continue;

            } else if (varControl == 1) {
                areaCirculo();
                terminar = true;
                sc.close();
            } else if (varControl == 2) {
                areaCuadrado();
                terminar = true;
                sc.close();
            } else if (varControl == 3) {
                areaRectangulo();
                terminar = true;
                sc.close();
            } else if (varControl == 4) {
                triangulo();
                terminar = true;
                sc.close();
            }
        }
    }

    private static void areaCirculo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        if (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
            radio = 0;
        }

        sc.close();
        System.out.println((radio==0)?"No hay circulo pues el radio es 0.":"El área del círculo es: " + Math.PI * Math.pow(radio, 2) + " Unidades cuadradas.");
        System.out.println("Gracias por usar la calculadora de áreas. ¡Hasta luego!");
        System.out.println("=====================================");
    }

    private static void areaCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();
        if (lado < 0) {
            System.out.println("El lado no puede ser negativo.");
            lado = 0;
        }

        sc.close();
        System.out.println((lado==0)?"No hay cuadrado pues el lado es 0.":"El área del cuadrado es: " + Math.pow(lado, 2) + " Unidades cuadradas.");
        System.out.println("Gracias por usar la calculadora de áreas. ¡Hasta luego!");
        System.out.println("=====================================");
    }

    private static void areaRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado A: ");
        double lado = sc.nextDouble();
        System.out.print("Ingrese el lado B: ");
        double ladoB = sc.nextDouble();
        if (lado < 0) {
            System.out.println("El lado A no puede ser negativo.");
            lado = 0;
        }

        if (ladoB < 0) {
            System.out.println("El lado B no puede ser negativo.");
            ladoB = 0;
        }

        sc.close();
        System.out.println((lado==0 || ladoB==0)?"No hay rectángulo pues uno de sus lados es 0.":"El área del rectángulo es: " + lado*ladoB + " Unidades cuadradas.");
        System.out.println("Gracias por usar la calculadora de áreas. ¡Hasta luego!");
        System.out.println("=====================================");
    }

    private static void triangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la medida de la base: ");
        double lado = sc.nextDouble();
        System.out.print("Ingrese la medida de la altura: ");
        double ladoB = sc.nextDouble();
        if (lado < 0) {
            System.out.println("El lado A no puede ser negativo.");
            lado = 0;
        }

        if (ladoB < 0) {
            System.out.println("El lado B no puede ser negativo.");
            ladoB = 0;
        }

        sc.close();
        System.out.println((lado==0 || ladoB==0)?"No hay triángulo pues uno de sus lados es 0.":"El área del triángulo es: " + lado*ladoB/2 + " Unidades cuadradas.");
        System.out.println("Gracias por usar la calculadora de áreas. ¡Hasta luego!");
        System.out.println("=====================================");
    }
}