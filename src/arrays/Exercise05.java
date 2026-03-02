/*
 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A continuación, en un bucle distinto, 
 * recorrerá esa tabla y mostrará esos números junto con la palabra “par” o “impar” según proceda.
 */

package arrays;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creación de un nuevo Array
		int[] num = new int[8];
		
		//Bucle que pide números y los introduce dentro del array
		for (int i = 0; i < num.length; i++) {
			System.out.print("Valor " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " (par)");
			} else {
				System.out.println(num[i] + " (impar)");
			}
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
