/*
 * Escribe un programa que lea 10 números por teclado, los almacene en una tabla, 
 * y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse.
 */

package arrays;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creación de un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creación de un array de tamaño 10
		int[] numeros = new int[10];
		
		//Bucle que pide números y los introduce en el array
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el valor " + (i+1) + ": ");
			numeros[i] = sc.nextInt();
		}
		
		//Mostramos los valores en orden inverso
		System.out.println("Orden inverso: \n");
		for(int i = numeros.length - 1; i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
