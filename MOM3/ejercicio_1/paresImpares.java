//*
//Crear un programa en Java que imprima todos los números pares entre 1 y 20 utilizando un 
//ciclo y condicionales. Todo el flujo debe estar organizado en métodos sin retorno ni 
//argumentos.
//
//Creado por Dayana Carreño y Estevan Obando
//*/

public class paresImpares { 
    public static void main(String[] args) {
        mostrarInstrucciones();
        imprimirNumerosPares();
    }

    public static void mostrarInstrucciones() {
        System.out.println("El propósito de este programa es imprimir los números pares contenidos en el conjunto 1 - 20.");
    }

    public static void imprimirNumerosPares() {
        System.out.println("Los números pares contenidos en el conjunto 1 - 20 son:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { // Verifica si el número es par validando el residuo de la división entre 2
                System.out.println(i);
            }
        }
    }
}
