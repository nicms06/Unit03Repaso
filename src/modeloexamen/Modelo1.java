package modeloexamen;

import java.util.Scanner;

public class Modelo1 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un array
        String[] mensajes = {
            "LA NIEBLA CUBRE EL PUENTE",
            "NO MIRES DETRÁS DE LA PUERTA",
            "EL RELOJ SUENA A MEDIANOCHE",
            "LAS SOMBRAS SABEN TU NOMBRE",
            "TODO MENSAJE DEJA UNA HUELLA",
            "EL ECO REPITE LA VERDAD",
            "ALGUIEN ESCONDE ALGO AQUÍ",
            "NUNCA APAGUES LA RADIO"
        };

        int opcion = 0;
        boolean valido = false;

        do{
            System.out.println("\n1. Mostrar mensajes\n" +
                    "2. Contar letra en un mensaje\n" +
                    "3. Extraer mensaje oculto\n" +
                    "4. Buscar palabra en todos los mensajes\n" +
                    "5. Marcar mensaje como alterado\n" +
                    "6. Mostrar palabra más larga de un mensaje\n" +
                    "7. Mostrar estadísticas generales\n" +
                    "8. Salir\n" +
                    "\t Elija una opción: ");

            valido = false;
            while (!valido){
                try {
                    opcion = sc.nextInt();
                    valido = true;

                    while (opcion > 8 || opcion < 1){
                        System.out.println("El valor debe de estar entre 1 y 8.");
                        opcion = sc.nextInt();
                        sc.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Error: Ingresa un valor válido.");
                    sc.nextLine();
                }
            }

            switch (opcion){
                case 1:
                    mostrarMensajes(mensajes);
                    break;
                case 2:
                    int indice = sacarIndice(sc);

                    System.out.print("Introduce la letra que deseas buscar: ");
                    char letra = ' ';
                    boolean validoLetra = false;
                    while (!validoLetra){
                        String entrada = sc.nextLine();

                        if(entrada.length() == 1){
                            letra = entrada.charAt(0);
                            validoLetra = true;
                        } else{
                            System.out.println("ERROR. Introduzca solo un caracter.");
                        }
                    }

                    System.out.println("La letra '" + letra + "' aparece " + contarLetra(mensajes[indice], letra) + " veces.");
                    break;
                case 3:
                    int indiceMensajeOculto = sacarIndice(sc);
                    String mensajeOculto = extraerMensajeOculto(mensajes[indiceMensajeOculto]);
                    System.out.println("El mensaje oculto es : " + mensajeOculto);
                    break;
                case 4:
                    System.out.print("Introduce la palabra que deseas buscar: ");
                    String palabra = sc.nextLine();
                    sc.nextLine();

                    int apariciones = buscarMensajesConPalabra(mensajes, palabra);

                    System.out.println("La palabra '" + palabra + "' aparece " + apariciones + " veces.");
                    break;
                case 5:
                    int indiceAlterado = sacarIndice(sc);

                    boolean estaAlterado = marcarAlterado(mensajes, indiceAlterado);

                    if (estaAlterado){
                        System.out.println("Mensaje alterado correctamente");
                    } else{
                        System.out.println("El mensaje no se puede alterar.");
                    }

                    break;
                case 6:
                    int indicePalabraLarga = sacarIndice(sc);

                    String palabraLarga = palabraMasLarga(mensajes[indicePalabraLarga]);

                    System.out.println("La palabra más larga es '" + palabraLarga + "'.");
                    break;

                case 7:
                    mostrarEstadisticas(mensajes);
                    break;
                case 8:
                    System.out.println("Saliendo...");
            }

        }while(opcion != 8);

        //Cerramos el Scanner
        sc.close();

    }

    /**
     * Función que muestra por pantalla los mensajes contenidos en un array junto a su posición
     * @param mensajes --> Array de string que contiene mensajes
     */
    static void mostrarMensajes(String[] mensajes){
        for (int i = 0; i < mensajes.length; i++){ //Recorremos el array
            System.out.println(i+ ". " + mensajes[i]); //Mostramos los mensajes uno a uno junto a su índice
        }
    }

    /**
     * Función que comprueba si el índice existe dentro del array
     * @param mensajes --> array de String que contiene mensajes
     * @param indice --> número entero
     * @return --> devolvemos true si el índice es válido o false si no lo es
     */
    static boolean esIndiceValido(String[] mensajes, int indice){
        if (indice > mensajes.length || indice < 0){ //Comprobamos si el índice es erroneo
            return false;
        }
        return true;
    }

    /**
     * Función que se encarga de quitar los espacios de un texto
     * @param mensaje --> Cadena
     * @return --> Devolvemos la cadena sin espacios
     */
    static String quitarEspacios(String mensaje){
        return mensaje.replace(" ", "");
    }

    /**
     * Función que busca un char dentro de un mensaje
     * @param mensaje --> String
     * @param letra --> Char
     * @return --> Devolvemos el número de veces que aparece el caracter dentro del mensaje
     */
    static int contarLetra(String mensaje, char letra){
        mensaje = quitarEspacios(mensaje); //Eliminamos los espacios del mensaje
        letra = Character.toLowerCase(letra); //Converitmos la letra a minúculas

        char[] letrasMensaje = mensaje.toLowerCase().toCharArray(); //Metemos todas las letras dentro de un array y convertimos a minúsculas

        int contador = 0;

        for(char caracter : letrasMensaje){ //Recorremos todas las letras del mensaje
            if (caracter == letra){ //Si encontramos la letra sumamos 1 al contador
                contador++;
            }
        }

        return contador;
    }

    /**
     * Función que extrae dentro de un String los caracteres con índice par de un mensaje
     * @param mensaje --> String
     * @return --> Devolvemos un String con el mensaje oculto
     */
    static String extraerMensajeOculto(String mensaje){
        mensaje = quitarEspacios(mensaje); //Eliminamos los espacios del mensaje

        String[] mensajeOculto = new String[(mensaje.length() + 1) / 2]; //Creación de un nuevo array

        String[] mensajeSeparado = mensaje.split(""); //Separamos todas las letras del mensaje en un array

        int j = 0;
        for (int i = 0; i < mensajeSeparado.length; i++) {
            if (i % 2 == 0) {
                mensajeOculto[j] = mensajeSeparado[i];
                j++;
            }
        }

        return String.join("", mensajeOculto);
    }

    /**
     * Función que busca en cuantas frases aparece una palabra
     * @param mensajes --> array con mensajes distintos
     * @param palabra --> String que contiene una palabra
     * @return --> Devolvemos en cuantas frases aparece una palabra
     */
    static int buscarMensajesConPalabra(String[] mensajes, String palabra){

        int contador = 0; //Inicializamos el contador en 0

        for (int i = 0; i < mensajes.length; i++){ //Recorremos los mensajes
            String[] mensajeSeparado = mensajes[i].split(" "); //Separamos cada palabra del mensaje dentro de un array

            for(int j = 0; j < mensajeSeparado.length; j++){ //Recorremos el array con las letras separadas
                if (mensajeSeparado[j].equalsIgnoreCase(palabra)){ //Si encuentra la palabra suamamos 1 al contador y pasamos a la diguiente frase
                    contador++;
                    break;
                }
            }
        }

        return contador;
    }

    /**
     * Función que:
     *      -Comprueba que el índice sea válido
     *      -Cambia el mensaje añadiendo al principio la marca: "[ALTERADO] " Solo si todavía no la tiene.
     * @param mensajes --> Array qe contiene mensajes
     * @param indice --> valor entero que representa el índice en el que se escuentra una frase
     * @return --> true si se ha marcado correctamente o false si no se puede
     */
    static boolean marcarAlterado(String[] mensajes, int indice){

        if(!esIndiceValido(mensajes, indice)){
            return false;
        }

        String marca = "[ALTERADO] ";
        String mensaje = mensajes[indice];

        boolean yaMarcado = true;

        if(mensaje.length() < marca.length()){
            yaMarcado = false;
        } else{
            for(int i = 0; i < marca.length(); i++){
                if(mensaje.charAt(i) != marca.charAt(i)){
                    yaMarcado = false;
                }
            }
        }

        if(yaMarcado){
            return true;
        }

        mensajes[indice] = marca + mensaje;

        return true;
    }

    /**
     * Función que devuelve la palabra más larga de una frase
     * @param mensaje Cadena que contiene un pequeño mensaje
     * @return devolvemos en un String la palabra más larga del mensaje
     */
    static String palabraMasLarga(String mensaje){
        String[] mensajeSeparado = mensaje.split(" ");

        String palabraLarga = mensajeSeparado[0];

        for (String palabra : mensajeSeparado){
            if (palabra.length() > palabraLarga.length()){
                palabraLarga = palabra;
            }
        }

        return palabraLarga;
    }

    /**
     * Función que se encarga de mostrar:
     *      -cuántos mensajes hay en total
     *      -cuántos están marcados como alterados
     *      -cuál es el mensaje con mayor longitud
     *      -cuántas veces aparece en total la letra 'A' en todos los mensajes
     * @param mensajes array de String que contiene los mensajes
     */
    static void mostrarEstadisticas(String[] mensajes){
        int numeroMensajes = mensajes.length;

        int alterado = 0;
        int longitud = 0;
        int indice = 0;
        int apariciones = 0;

        String marca = "[ALTERADO] ";
        int largoMarca = marca.length();

        for (int i = 0; i < mensajes.length; i++){
            if (mensajes[i].length() >= largoMarca){
                String inicio = "";
                for (int j = 0; j < largoMarca; j++){
                    inicio += mensajes[i].charAt(j);
                }

                if (inicio.equals(marca)){
                    alterado++;
                }
            }

            if (mensajes[i].length() > longitud){
                longitud = mensajes[i].length();
                indice = i;
            }

            apariciones += contarLetra(mensajes[i], 'a');
        }

        System.out.println("En total hay " + numeroMensajes + " mensajes.");
        System.out.println(alterado + " mensajes están marcados como alterados.");
        System.out.println("El mensaje con mayor longitud tiene índice " + indice);
        System.out.println("La letra 'A' aparece un total de " + apariciones + " veces.");
    }

    static int sacarIndice (Scanner sc){
        System.out.print("Introduce el índice del mensaje: ");

        int indice = 0;
        boolean validoIndice = false;

        while (!validoIndice){
            try {
                indice = sc.nextInt();
                sc.nextLine();
                validoIndice = true;
            } catch (Exception e) {
                System.out.println("Error: Ingresa un valor válido.");
                sc.nextLine();
            }
        }

        return indice;
    }
}