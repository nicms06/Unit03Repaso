/*
Escribir la función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada,
que se encuentra rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive.
 */

package funciones;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        int longitud;

        //Pedimos la longitud del array
        do{
            System.out.print("Introduce el la longitud de la tabla: ");
            longitud = sc.nextInt();
        } while (longitud < 1);

        int fin;
        //Pedimos el número límite
        do{
            System.out.print("Introduce el número límite: ");
            fin = sc.nextInt();
        } while (fin < 1);

        //Mostramos la tabla
        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

        //Cerramos el Scanner
        sc.close();
    }

    /**
     * Función que crea un array y lo rellena con números pares ordenados
     * @param longitud --> longitud del array
     * @param fin --> número límite del array
     * @return --> devolvemos el array lleno y ordenado
     */
    static int[] rellenaPares(int longitud, int fin){
        //Creación de un objeto de la clase Random
        Random rand = new Random();

        //Creación de la tabla
        int[] tabla = new int[longitud];

        //Rellenamos la tabla
        for(int i = 0; i < tabla.length; i++){
            do{
                tabla[i] = rand.nextInt(2, fin+1);
            } while(tabla[i] % 2 != 0);
        }

        //Ordenamos la tabla
        Arrays.sort(tabla);

        return tabla;
    }
}
