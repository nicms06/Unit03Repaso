/*
Realiza una función que reciba como parámetro una tabla de enteros y devuelva la suma de todos los valores almacenados en la tabla.
Prueba el comportamiento de la función en un método main.
 */

package funciones;

import java.util.Arrays;

public class Exercise01 {

    public static void main(String[] args) {
        //Creación de la tabla con valores enteros
        int[] tabla = {5, 7, 3, 10, 24};

        //Imprimimos el resultado llamando a la función suma
        System.out.println(Arrays.toString(tabla) + " | Suma = " + suma(tabla));
    }

    /**
     * Función que suma todos los elementos de un array
     * @param tabla --> Array con números enteros
     * @return --> Suma de los elementos de la tabla
     */
    static int suma(int[] tabla){
        int suma = 0;
        for(int numero : tabla){
            suma += numero;
        }
        return suma;
    }
}
