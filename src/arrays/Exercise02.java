/*
 * Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. 
 * Utiliza el mismo bucle tanto para solicitar los 5 números como para almacenarlos en la tabla. 
 * A continuación, en un bucle distinto, mostrar por consola los números en el mismo orden en el que se han introducido.
 */

package arrays;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Creación de un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creación de un array de 5 valores decimales
		double[] numeros = new double[5];
		
		//Creación de un bucle que solicita los valores al usuario y los introduce dentro del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el valor " + (i+1) + ": ");
			numeros[i] = sc.nextDouble();
		}
		
		//Creación de un bucle que muestra los valores del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
