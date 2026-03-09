package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos una frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        //Mostramos todas las palabras
        System.out.println("Palabras: " + Arrays.toString(obtenerPalabras(frase)));

        //Mostramos la cantidad de palabras
        System.out.println(obtenerPalabras(frase).length + " palabras");

        //Mostramos las palabras con más de 5 letras
        System.out.println("Número de palabras con más de 5 letras: " + contarPalabrasLargas(obtenerPalabras(frase), 5));

        //Mostramos la palabra más larga
        System.out.println("Palabra más larga: " + palabraMasLarga(obtenerPalabras(frase)));

        //Cerramos el Scanner
        sc.close();
    }

    /**
     * Función que separa todas las palabras de una frase y las añade a un array
     * @param frase --> frase completa introducida por el usuario
     * @return --> devolvemos todas las palabras separadas en un array
     */
    static String[] obtenerPalabras(String frase){
        //Quitamos los espacios iniciales y finales y ponemos la frase en minúsculas
        String textoEditado = frase.trim().toLowerCase();

        //Creación de un nuevo array de String con las palabras del texto
        return textoEditado.split(" ");
    }

    /**
     * Función que cuenta las palabras que son más largas que la longitud mínima establecida
     * @param palabras --> todas las palabras introducidas por el usuario
     * @param longitudMinima --> longitud mínima que tiene que tener una palabra para que sea larga
     * @return --> devolvemos el número de palabras que son más largas que el límite
     */
    static int contarPalabrasLargas(String[] palabras, int longitudMinima){

        int palabrasLargas = 0;

        //Buscamos las palabras con más longitud que la mínima
        for(String palabra : palabras){
            if(palabra.length() >= longitudMinima){
                palabrasLargas ++;
            }
        }

        return palabrasLargas;
    }

    /**
     * Función que busca la palabra más larga
     * @param palabras --> todas las palabras introducidas por el usuario
     * @return --> Devolvemos la palabra más larga del array
     */
    static String palabraMasLarga(String[] palabras){

        //Inicializamos la palabra más larga en la primera del array
        String palabraMasLarga = palabras[0];

        //Buscamos la palabra más larga
        for(String palabra : palabras){
            if (palabra.length() > palabraMasLarga.length()){
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }
}