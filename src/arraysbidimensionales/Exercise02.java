/*
Escribe un programa que pida las dimensiones de una tabla bidimensional al usuario (número de filas y número de columnas).
A continuación, crea dicha tabla bidimensional y rellénala de la siguiente forma: el elemento de la posición [i][j] debe
contener el valor 10 * i + j. A continuación, muestra la tabla por consola.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos las filas y columnas
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        //Nos aseguramos de que las filas son positivas
        while(filas <= 0){
            System.out.print("Introduce un número positivo");
            filas = sc.nextInt();
        }

        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        //Nos aseguramos de que las columnas son positivas
        while(columnas <= 0){
            System.out.print("Introduce un número positivo");
            columnas = sc.nextInt();
        }

        //Creación de la matriz
        int[][] matriz = new int[filas][columnas];

        //Rellenamos la matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 10 * i + j;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //Cerramos el Scanner
        sc.close();
    }
}
