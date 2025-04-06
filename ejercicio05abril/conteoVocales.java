//*
//Crea un vector de 10 caracteres.
//Pide al usuario que los ingrese uno por uno.
//Luego recorre el vector y cuenta cuántas vocales hay.
//
//Creado por Dayana Carreño y Estevan Obando
//*

package ejercicio05abril;

import java.util.Scanner;

public class conteoVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorVocales = 0; //VAriable que aumenta una unidad cada vez que se encuentra una vocal
        String [] letra = new String[10]; //Vector que almacena las letras ingresadas por usuario

        System.out.println("Ingrese 10 letras: ");
        for (short i=0;i<10;i++){
            System.out.print("Letra " + (i+1) + ": ");
            letra[i] = sc.next();
        }
        sc.close();

        for (short i=0;i<10;i++){
            //Compara si el carácter ingresado es una vocal. "equalsignorecase" permite comparar sin importar mayúsculas o minúsculas.
            if(letra[i].equalsIgnoreCase("a") || letra[i].equalsIgnoreCase("e") || letra[i].equalsIgnoreCase("i") || letra[i].equalsIgnoreCase("o") || letra[i].equalsIgnoreCase("u")){
                contadorVocales++;
            }
        }

        System.out.println("Usted ingresó " + contadorVocales + " vocales.");
    }
}
