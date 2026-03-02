/*
 * Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. 
 */

package arrays;

import java.util.Random;
import java.util.Arrays;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Ceración de un objeto de la clase Random
		Random rand = new Random();
		
		//Creación de un array de longitud 10
		int[] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 101);
		}
		
		//Mostramos el array
		System.out.println(Arrays.toString(numeros));

	}

}
