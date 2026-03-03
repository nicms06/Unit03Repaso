/*
Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.
 */

package funciones;

import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {

        //Creación de una tabla con valores enteros
        int[] tabla = {20, 7, 104, 745, 528, 0};

        //Imprimimos el valor
        System.out.println(Arrays.toString(tabla) + " | Máximo: " + maximo(tabla));
    }

    /**
     * Función que busca el valor más alto contenido en una tabla
     * @param t --> Array que contiene valores enteros
     * @return --> Devolvemos el valor máximo
     */
    static int maximo(int[] t){
        int max = t[0];
        for (int numero : t){
            if (max < numero){
                max = numero;
            }
        }
        return max;
    }
}
