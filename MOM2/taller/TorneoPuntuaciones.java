import java.util.Scanner; //ERROR DE SINTAXIS CORREGIDO: Hacía falta importar la clase Scanner.

public class TorneoPuntuaciones {
    public static void main(String[] args) { //ERROR DE SINTAXIS CORREGIDO: String debe iniciar con Mayúscula, pues esta es la declaración correcta del tipo String.
    // Declarar vector para 5 puntuaciones
    int[] puntuaciones = new int[5]; //ERROR DE SINTAXIS CORREGIDO: Se debe cerrar esta línea de código con un ;.
    Scanner teclado = new Scanner(System.in);
    int puntuacionMaxima = 0;
    System.out.println("Ingrese las 5 puntuaciones de los jugadores:");
    // Ciclo para ingresar puntuaciones
    //ERROR DE SINTAXIS CORREGIDO : Se debe usar i++ en lugar de i+.
    //ERROR DE SINTAXIS CORREGIDO : se debe usar < en lugar de <= para recorrer el vector completo. Esto pues el índice del vector va de 0 a 4, y el tamaño del vector es 5.
    // Usar <= arrojará un error de ArrayIndexOutOfBoundsException, pues el índice 5 no existe.
    for (int i = 0; i < puntuaciones.length; i++) { 
        System.out.println("Puntuación jugador " + (i + 1) + ": "); //ERROR DE LÓGICA CORREGIDO : Es mejor usar System.out.println(). Usar print() puede causar confusión al no mostrar el salto de línea (Todo se imprime en una línea).
        puntuaciones[i] = teclado.nextInt();
        // Comprobar si es la puntuación máxima
        if (puntuaciones[i] > puntuacionMaxima) { //ERROR DE LÓGICA CORREGIDO : Se debe usar > en lugar de < para encontrar la puntuación máxima. Tal como está actualmente el código, se está buscando la puntuación mínima.
            puntuacionMaxima = puntuaciones[i];
        }
    }

    teclado.close(); //ERROR DE LÓGICA CORREGIDO : Se debe cerrar el Scanner para liberar recursos.
    // Mostrar puntuaciones (bucle while incorrecto)
    System.out.println("\nPuntuaciones ingresadas:");
    int k = 0;

    //ERROR DE SINTAXIS CORREGIDO : Se debe usar <=en lugar de =. En primer lugar porque = es un símbolo de asignación, no de comparación. 
    //En segundo lugar porque el bucle while debe realizar la impresión de registros mientras k se encuentre dentro del rango de índices del vector puntuaciones. 
    //ERROR DE SINTAXIS CORREGIDO : Se debe usar (puntuaciones.length-1) en lugar de puntuaciones.length. Esto porque el índice del vector va de 0 a 4, y el tamaño del vector es 5.
    while (k <= (puntuaciones.length-1)) {
        System.out.println("Jugador "+(k+1)+ ": " + puntuaciones[k]); //Sugerencia de Lógica Corregido : Mencionar en el Print del sistema al jugador que corresponde a la puntuación.
        k++; //ERROR DE LÓGICA CORREGIDO : El bucle while actual no tiene sentido, pues no se está incrementando el índice k.
    }
    // Mostrar puntuación máxima
    System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);
    }
} //ERROR DE SINTAXIS CORREGIDO: Hacía falta cerrar el bloque de clase con un corchete.
