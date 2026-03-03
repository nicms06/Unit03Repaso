/*
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas.
 * A continuación, mostrará la nota mínima, máxima y media de cada alumno.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
	
		//Creación de un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creación de una matriz para 4 alumnos con 5 notas cada uno
		double[][] notas = new double[4][5];
		
		//Pedimos las notas
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + (i+1) + ": ");
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				notas[i][j] = sc.nextInt();
				
				//Las notas deben de estar comprendidas entre 0 y 10
				while (notas[i][j] > 10 || notas[i][j] < 0) {
					System.out.print("La nota debe de estar comprendida entre 0 y 10: ");
					notas[i][j] = sc.nextInt();
				}
			}
			System.out.println();
		}
		
		//Mostramos las notas
		for(int i = 0; i < notas.length; i++) {
            double maximo = notas[i][0];
            double minimo = notas[i][0];
            double suma = 0;
			System.out.print("Alumno " + (i+1) + ": ");
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");
				if (maximo < notas[i][j]) {
					maximo = notas[i][j];
				}
				if (minimo > notas[i][j]) {
					minimo = notas[i][j];
				}
				suma += notas[i][j];
				
			}
			System.out.println(" | Maximo = " + maximo + " | Minimo = " + minimo + " | Media = " + suma / notas[i].length + " |");
			System.out.println();
		}

		//Cerramos el Scanner
		sc.close();

	}

}
