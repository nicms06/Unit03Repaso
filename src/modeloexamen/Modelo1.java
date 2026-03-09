package modeloexamen;

public class Modelo1 {
    public static void main(String[] args) {

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

        //Mostramos los mensajes
        mostrarMensajes(mensajes);

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

    static boolean marcarAlterado(String[] mensajes, int indice){
        
    }
}

































