package examen;

public class Modelo02 {
    public static void main(String[] args) {
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



    }

    /**
     * Función que muestra los mensajes de un array por pantalla junto a su índice
     * @param mensajes Array de String con los mensajes almacenados
     */
    static void mostrarMensajes(String[] mensajes){
        for (int i = 0; i < mensajes.length; i++){
            System.out.println(i + ". " + mensajes[i]);
        }
    }

    /**
     * Función que comprueba la validez de un índice
     * @param mensajes Array de String con los mensajes almacenados
     * @param indice valor que indica la posicion dentro del array
     * @return devolvemos true si es válido y false si no lo es
     */
    static boolean esIndiceValido(String[] mensajes, int indice){
        if (indice >= mensajes.length || indice < 0){
            return false;
        }
        return true;
    }

    /**
     * Función que elimina los espacios de un texto
     * @param mensaje Texto al que queremos quitarle los espacios
     * @return devolvemos el mensaje sin espacios
     */
    static String quitarEspacios(String mensaje){
        return mensaje.replace(" ", "");
    }

    /**
     * Función para contar las veces que aparece una letra en un mensaje
     * @param mensaje cadena que contiene un mensaje
     * @param letra caracter que queremos saber cuantas veces aparece en el texto
     * @return número de veces que aparece la letra en el texto
     */
    static int contarLetra(String mensaje, char letra){
        mensaje = quitarEspacios(mensaje); //Eliminamos los espacios del mensaje

        String[] caracteres = mensaje.split(""); //Separamos todas los caracteres del mensaje dentro de un array
        int contadorLetras = 0;

        for (String caracter : caracteres){
            if (caracter.equalsIgnoreCase(String.valueOf(letra))){ //Comparamos cada caracter del mensaje con la letra
                contadorLetras++;
            }
        }

        return contadorLetras;
    }

    /**
     * Función que guarda dentro de un String los caracteres con índice par de un mensaje
     * @param mensaje String original del que vamos a sacar el mensaje oculto
     * @return String con el mensaje oculto
     */
    static String extraerMensajeOculto(String mensaje){
        mensaje = quitarEspacios(mensaje); //Eliminamos los espacios del mensaje

        String mensajeOculto = "";

        for (int i = 0; i < mensaje.length(); i+=2){
            mensajeOculto += mensaje.charAt(i);
        }
        return mensajeOculto;
    }

    /**
     * Devulve cuántos mensajes contienen una palabra, sin distinguir entre mayúsculas y minúsculas.
     * @param mensajes array con mensajes almacenados
     * @param palabra string con la palabra que estams buscando en los mensajes
     * @return devolvemos el número de apariciones
     */
    static int buscarMensajesConPalabra(String[] mensajes, String palabra){

        int contadorApariciones = 0;

        for(int i = 0; i < mensajes.length; i++){
            String[] mensajeSeparado = mensajes[i].split(" "); //Separamos las palabras del mensaje

            for (int j = 0; j < mensajeSeparado.length; j++){
                if(mensajeSeparado[j].equalsIgnoreCase(palabra)){
                    contadorApariciones ++;
                    break;
                }
            }
        }

        return contadorApariciones;
    }

    static boolean marcarAlterado(String[] mensajes, int indice){

        boolean esValido = esIndiceValido(mensajes, indice);

        boolean seHaCambiado = false;

        if (esValido){
            for(int i = 0; i < mensajes.length; i++) {
                String[] mensajeSeparado = mensajes[i].split(" "); //Separamos las palabras del mensaje

                for (int j = 0; j < mensajeSeparado.length; j++){
                    if (!mensajeSeparado[j].equalsIgnoreCase("[ALTERADO]")){
                        mensajeSeparado[j] = "[ALTERADO] " + mensajeSeparado[j];
                        seHaCambiado = true;
                    }
                }
            }
        } else{
            return false;
        }

        return seHaCambiado;

    }
}
















