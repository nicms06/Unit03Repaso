/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y 
 * las almacene en una tabla (una posición por mes). A continuación, se debe mostrar un diagrama de barras 
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 */

package arrays;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		//Creación de un Scanner
		Scanner sc = new Scanner(System.in);
		
		//Array que contiene 12 valores con las temperaturas de cada mes
		double[] media = new double[12];
		
		//Pedimos la temperatura de cada mes y la introducimos en el array
		for(int i = 0; i < media.length; i++) {
			System.out.println("Mes " + (i+1) + ": ");
			media[i] = sc.nextDouble();
		}
		
		//Hacemos el diagrama
		for (int i = 0; i < media.length; i++) {
			System.out.print("Mes " + (i+1) + ": " + media[i] + " | ");
			
			for(int j = 0; j < (int)(media[i] * 10); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
