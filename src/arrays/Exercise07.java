/*
Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10.
Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
 */

package arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        //Creamos un nuevo objeto de la clase Random
        Random rand = new Random();

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un array de tamaño 100
        int[] numeros = new int[100];

        //Generamos números aleatorios y los añadimos al array
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(1, 11);
        }

        //Pedimos un valor al usuario
        System.out.print("Introduce un valor entre 1 y 10: ");
        int valor = sc.nextInt();

        //El valor debe estar comprendido entre 1 y 10
        while(valor > 10 || valor < 1){
            System.out.print("El valor debe de estar entre 1 y 10: ");
            valor = sc.nextInt();
        }

        //Buscamos las posiciones en las que se encuentra valor
        int posicion = 0;
        System.out.println("Tu valor se encuentra en las posiciones: ");
        for (int n : numeros){
            if (n == valor){
                System.out.println(posicion);
            }
            posicion ++;
        }

        //Cerramos el Scanner
        sc.close();
    }
}
