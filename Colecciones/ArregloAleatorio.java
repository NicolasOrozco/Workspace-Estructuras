package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArregloAleatorio {

    public static void main(String[] args ) { 

        int[] numeros = crearArreglo();

        imprimirArreglo(numeros, 5);

        Arrays.sort(numeros);

        imprimirArreglo(numeros, 5);

        System.out.println(Arrays.binarySearch(numeros, 10));
    }

    public static int[] crearArreglo(){
        int[] numeros = new int[5];

        for(int i = 0; i <= 4; i++){
            numeros[i] = ((int) (Math.random() * 100));
        }

        return numeros;
    }
    
    public static void imprimirArreglo(int[] arreglo, int tamanio){
        for(int i = 0; i < tamanio; i++ ){
            System.out.print(arreglo[i] + ", ");
        }
        System.out.print("\n");
    }
}
