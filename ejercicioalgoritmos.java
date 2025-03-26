 /*
 * Modifica el ejercicio de clase para incluir el factorial
 * Creado por Estevan Obando y Dayana Carreño
 */

 import java.util.Scanner;

 public class ejercicioalgoritmos {
     public static void main(String[] args) {
         int numA = 0, numB = 0;
         int varControl = 0;
         int factorial = 1;
         int contador = numA;
 
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Bienvenidos");

         do {System.out.println("1. Sumar dos números\r\n" + //
         "2. Restar dos números\r\n" + //
         "3. Multiplicar dos números\r\n" + //
         "4. Dividir dos números\r\n" + //
         "5. Obtener los factores de un número\r\n" + //
         "6. Salir\r\n");

 System.out.print("Opción seleccionada: ");
 varControl = scanner.nextInt();

 switch (varControl) {
     case 1:
         System.out.print("Ingrese número A: ");
         numA = scanner.nextInt();
         System.out.print("Ingrese número B: ");
         numB = scanner.nextInt();

         System.out.println(numA + " + " + numB + " = " + (numA + numB));

         break;
     case 2:
         System.out.print("Ingrese número A: ");
         numA = scanner.nextInt();
         System.out.print("Ingrese número B: ");
         numB = scanner.nextInt();

         System.out.println(numA + " - " + numB + " = " + (numA - numB));

         break;
     case 3:
         System.out.print("Ingrese número A: ");
         numA = scanner.nextInt();
         System.out.print("Ingrese número B: ");
         numB = scanner.nextInt();

         System.out.println(numA + " * " + numB + " = " + (numA * numB));

         break;
     case 4:
         System.out.print("Ingrese número A: ");
         numA = scanner.nextInt();
         System.out.print("Ingrese número B: ");
         numB = scanner.nextInt();

         System.out.println(numA + " / " + numB + " = " + (numA / numB));

         break;
     case 5: 
         System.out.print("Ingrese número deseado para encontrar su factorial: ");
         numA = scanner.nextInt();
         while (numA != 0) {
            factorial = factorial * numA;
            numA--;
            System.out.println("El factorial de su número es: " +factorial);
         }
         break; 
     case 6:
         System.out.println("Gracias, hasta pronto!");

         break;
     default:
         System.out.println("Opción no valida!");
         break;
 }
} while (varControl != 6);
scanner.close(); 
     }
     
     } 