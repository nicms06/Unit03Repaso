/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, 
 * y luego lo recorra para calcular la suma de todos los números y, además, averiguar 
 * el máximo y mínimo y mostrarlos por pantalla.
 */

package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un array de tamaño 10
		double[] numeros = new double[10];
		
		//Pedimos los números y los introducimos dentro del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Valor " + (i+1) + ": ");
			numeros[i] = sc.nextDouble();
		}
		
		double suma = 0;
		double maximo = numeros[0];
		double minimo = numeros[0];
		
		//Recorremos el array
		for (int i = 0; i < numeros.length; i++) {
			//Calculamos la suma
			suma += numeros[i];
			
			if (maximo < numeros[i]) { //Si la variable maximo es menor al valor, cambiamos el valor de maximo
				maximo = numeros[i];
			}
			
			if (minimo > numeros[i]) { //Si la variable minimo es menor al valor, cambiamos el valor de minimo
				minimo = numeros[i];
			}
		}
		
		//Mostramos todos los valores
		System.out.println(Arrays.toString(numeros));
		System.out.println("Suma: " + suma);
		System.out.println("Máximo: " + maximo);
		System.out.println("Mínimo: " + minimo);
		
		//Cerramos el Scanner
		sc.close();

	}

}
