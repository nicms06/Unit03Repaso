/*
Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial en la tabla t el valor clave.
En caso de encontrarlo, devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
 */

package funciones;

public class Exercise04 {
    public static void main(String[] args) {
        //Creación de dos tablas
        int[] tablaClave = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tablaSinClave = {1, 2, 3, 4, 5, 6, 8, 9 ,10, 11};

        //Declaramos el valor clave
        int clave = 7;

        //Mostramos el resultado
        int encontrado1 = buscar(tablaClave, clave);
        int encontrado2 = buscar(tablaSinClave, clave);

        if (encontrado1 >= 0){
            System.out.println("Valor encontrado en la posición " + encontrado1);
        } else{
            System.out.println("Valor no encontrado");
        }

        if (encontrado2 >= 0){
            System.out.println("Valor encontrado en la posición " + encontrado2);
        } else{
            System.out.println("Valor no encontrado");
        }
    }

    /**
     * Función que se encarga de buscar la clave en una tabla
     * @param t --> array con valores enteros
     * @param clave --> Valor que estamos buscando en el array
     * @return --> En caso de encontrar la clave devolvemos la posición donde se encontro y en caso contrario devolvemos -1
     */
    static int buscar(int[] t, int clave){
        int posicion = 0;
        for(int num : t){
            if (num == clave) {
                return posicion;
            }
            posicion ++;
        }
        return -1;
    }
}
