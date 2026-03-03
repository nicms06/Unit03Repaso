/*
Escribe un programa que cree una tabla de 10x10 que contenga los valores de las tablas de multiplicar del 1 al 10
(cada tabla de multiplicar en una fila). Muestra la tabla por pantalla.
 */

package arraysbidimensionales;

public class Exercise03 {
    public static void main(String[] args) {

        //Creación de una matriz de 10 x 10
        int[][] tablas = new int[10][10];

        //Creamos las tablas mediante un bucle
        for (int i = 0; i < tablas.length; i++){
            System.out.print("Tabla del " + (i+1) + ": ");
            for (int j = 0; j < tablas[i].length; j++){
                tablas[i][j] = (i+1) * (j+1);
                System.out.print((i+1) + " * " + (j+1) + " = " + tablas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}