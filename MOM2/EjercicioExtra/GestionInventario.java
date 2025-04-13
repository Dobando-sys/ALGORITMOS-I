//*
//Una tienda desea optimizar su inventario gestionando la información de 10 productos. Cada
//producto tiene nombre, cantidad y precio. Se requiere además poder buscar productos por
//nombre, actualizar cantidades y calcular el valor total del inventario.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

package MOM2.EjercicioExtra;
import java.util.Random;
import java.util.Scanner;

public class GestionInventario {
    public static void main(String[] args) {

        int[] id = new int[10]; //ID del producto.
        String[] nombres = new String[10]; // Nombre del producto.
        int[] cantidades = new int[10]; // Cantidad del producto.
        int[] precios = new int[10]; // Precio del producto.
        
        int totalInventario = 0; // Inicializa el total del inventario

        String terminar = "N"; // Variable para controlar el ciclo 1 de modificación del inventario

        Random aleatorio = new Random(System.currentTimeMillis()); // Generador de números aleatorios

        System.out.println("\nBienvenidos a la gestión de inventario");
        System.out.println("El estado actual es el siguiente:");
        System.out.println("\nIndice\tNombre\tCantidad\tPrecio ($/unidad)");
        System.out.println("-------------------------------------------------");
        
        // Llena los vectores paralelos con información de productos.
        String[] nombresIniciales = new String[]{"producto1", "producto2", "producto3", "producto4", "producto5", "producto6", "producto7", "producto8", "producto9", "producto10"};
        for (int i = 0; i < 10; i++) {
            id[i]= i+1;
            nombres[i] = nombresIniciales[i];

            cantidades[i] = aleatorio.nextInt(100); // Llena el vector de cantidades con números aleatorios entre 1 y 100
            precios[i] = aleatorio.nextInt(5000, 100000); // Llena el vector de precios con números aleatorios entre 5000 y 10000

            System.out.println(id[i]+"\t"+nombres[i] + "\t" + cantidades[i] + "\t" + precios[i]);

            totalInventario += cantidades[i] * precios[i]; // Calcula el valor total del inventario
        }

        System.out.println("-------------------------------------------------");
        System.out.println("El valor total del inventario es: \t $" + totalInventario);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n¿Desea modificar el inventario?\n1. Sí\n2. No:\n");
            String respuesta = sc.nextLine();
            terminar = respuesta.equals("2")? "S": "N";
            
            String terminar2= "N";
            while (terminar2.equalsIgnoreCase("N") && terminar.equalsIgnoreCase("N")) {

                System.out.println("\nQué modificación desea realizar?\n1. Buscar Producto\n2. Modificar producto\n3. Conocer valor del Inventario\n4. Menú anterior\n");
                String resultado2 = sc.nextLine();
                switch (resultado2) {
                    case "1":
                        System.out.println("Ingrese el nombre del producto a buscar:");
                        String nombreBuscar = sc.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < 10; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("\nIndice\tNombre\t\tCantidad\tPrecio ($/unidad)");
                                System.out.println(id[i] + "\t" + nombres[i] + "\t" + cantidades[i] + "\t\t" + precios[i]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El producto no existe.");
                        }
                        break;
                    case "2":
                        System.out.println("Ingrese el nombre del producto a modificar:");
                        String nombreModificar = sc.nextLine();
                        boolean modificado = false;
                        for (int i = 0; i < 10; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreModificar)) {
                                System.out.println("Nuevo nombre:");
                                nombres[i] = sc.nextLine();
                                System.out.println("Ingrese nueva cantidad:");
                                cantidades[i] = sc.nextInt();
                                System.out.println("Ingrese nuevo precio:");
                                precios[i] = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Producto modificado:");
                                System.out.println("\nIndice\tNombre\t\tCantidad\tPrecio ($/unidad)");
                                System.out.println(id[i] + "\t" + nombres[i] + "\t" + cantidades[i] + "\t\t" + precios[i]);
                                modificado = true;
                                break;
                            }
                        }
                        if (!modificado) {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case "3":
                        int totalInventarioModificado = 0;
                        for (int i = 0; i < 10; i++) {
                            totalInventarioModificado += cantidades[i] * precios[i];
                        }
                        System.out.println("El valor actual del inventario es: \t $" + totalInventarioModificado);
                        break;
                    case "4":
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                terminar2 = resultado2.equals("4")? "S": "N";
            }
        } while (terminar.equalsIgnoreCase("N"));
        System.out.println("\n¡Adiós!");
        sc.close();
    }
}
