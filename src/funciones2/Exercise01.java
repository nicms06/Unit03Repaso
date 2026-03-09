/*
Realiza una función que reciba una tabla de dos dimensiones. A continuación, debe devolver un array de dos posiciones que contenga el mínimo en la posición 0 y el máximo en la posición 1.
Define un metodo main que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, debe llamar a la función con este array y mostrar por consola los valores mínimo y máximo de la tabla.
 */

package funciones2;

import java.util.Random;
import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {

        //Creación de un objeto de la clase Random
        Random rand = new Random();

        //Creación de una matriz 6x10
        int[][] numRandom = new int[6][10];

        //Rellenamos la matriz con números aleatorios y mostramos la matriz
        for(int i = 0; i < numRandom.length; i++){
            for (int j = 0; j < numRandom[i].length; j++){
                numRandom[i][j] = rand.nextInt(0, 1001);
                System.out.print(numRandom[i][j] + "\t");
            }
            System.out.println();
        }

        //Llamamos a la función maxMin y mostramos los valores
        System.out.println("\nValores Maximo y Mínimo: " + Arrays.toString(maxMin(numRandom)));

    }

    /**
     * Función que busca los valores mínimo y maximo de una matriz
     * @param tabla --> Array de dos dimensiones
     * @return --> Devolvemos un array de una dimensión con el valor mínimo y máximo
     */
    static int[] maxMin(int[][] tabla){
        //Declaración de las variables maximo y mínimo
        int max = tabla[0][0];
        int minimo = tabla[0][0];

        //Recorremos la tabla y buscamos el valor más pequeño y más grande
        for(int[] fila : tabla){
            for(int elemento : fila){
                if (elemento > max){
                    max = elemento;
                }
                if (elemento < minimo){
                    minimo = elemento;
                }
            }
        }

        //Creamos un array de 2 posiciones con los datos y lo devolvemos
        return new int[]{minimo, max};
    }
}
