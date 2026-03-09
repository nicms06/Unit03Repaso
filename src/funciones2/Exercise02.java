/*
Realiza una función que reciba una tabla bidimensional y devuelva en otro array distinto su transposición:
Define un metodo main que llame a esta función pasándole una tabla bidimensional y muestre por pantalla el resultado.
 */

package funciones2;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        int filas;
        int columnas;

        //Pedimos al susuario las filas y columnas
        do{
            System.out.print("Introduce el número de filas: ");
            filas = sc.nextInt();
        } while(filas < 1);

        do{
            System.out.print("Introduce el número de columnas: ");
            columnas = sc.nextInt();
        } while(columnas < 1);

        //Creación del array
        int[][] matriz = new int[filas][columnas];

        //Pedimos al usuario los valores
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Valor " + (i+1) + " | " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz original: ");
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz traspuesta: ");
        int[][] traspuesta = trasposicion(matriz);
        for (int[] ints : traspuesta) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        //Cerramos el Scanner
        sc.close();

    }

    static int[][] trasposicion(int[][] matriz){

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];

        //Recorremos la matriz
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                traspuesta[j][i] = matriz[i][j];
            }
        }

        //Devolvemos la matriz
        return traspuesta;
    }
}
