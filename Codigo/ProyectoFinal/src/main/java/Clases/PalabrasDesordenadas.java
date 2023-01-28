package Clases;

/**
 * Clase PalabrasDesordenadas
 *
 * @author CarlosP, FreddyP y RafaS.
 * @since 1/10/2021
 * @version 1.0
 */
/**
 * Esta aplicación consiste en ir mostrando en pantalla palabras desordenadas
 * para que el usuario la escriba de forma ordenada. El programa va a tener
 * guardabas las palabras de forma correcta. Debe de tener como mínimo 8
 * palabras y escoger las que se van a mostrar de forma aleatoria.
 *
 * Cada vez que el sistema toma una palabra, debe desordenar al azar el orden de
 * las letras y mostrarlas al usuario para que éste escriba correctamente la
 * palabra a la que se refiere.
 *
 * En total se va a mostrar 5 palabras diferentes al usuario. Cada vez que el
 * usuario digita la palabra, el sistema le indica si está correcta o incorrecta
 * y le muestra la siguiente palabra desordenada. Al final, se le debe indicar
 * al usuario la cantidad de palabras acertadas y las que no.
 */
import javax.swing.JOptionPane;

public class PalabrasDesordenadas {

    /**
     * Se realiza un public para elaborar la construcción del método que realiza
     * las operaciones matemáticas de forma aleatoria
     */
    public void PalabrasDesordenadas() {
        /**
         * DeclaraciÓn de variable de tipo string En este proceso declaramos la
         * dimensión del contador
         *
         * @see String palabra
         * @see ramdonEntero
         * @see String palabraDesordenada
         */
        String[] listaPalabras = {"colombia", "venezuela", "argentina", "guatemala", "nicaragua", "panama", "uruguay", "brasil"};
        int i = 4;//cantidad de exposición de palabras (5)
        int correctas = 0;//contador de palabras correctas
        int incorrectas = 0;//contador de palabras incorrectas
        while (i >= 0) {//condición siempre que sea =0
            int ramdonEntero = (int) Math.floor(Math.random() * (7 - 0 + 1) + 0);//lógica matemática para elegir palabras en orden aleatorio usando el metodo math
            String palabra = listaPalabras[ramdonEntero];//declaracion de variable palabra y llenado con variable del metodo math
            String palabraDesordenada = desordenarPalabra(palabra);//elección de palabras random
            String opc = "";//Declaración de variable para ingreso de respuesta
            JOptionPane.showMessageDialog(null, "Palabra desordenada " + palabraDesordenada);//muestra palabra desordenada elegida de forma aleatoria al usuario

            opc = JOptionPane.showInputDialog(null, "Ingrese la palabra correcta: ");//solicitud de respuesta

            /**
             * Condición de ingresos para contar aciertos y desaciertos
             */
            if (opc.equalsIgnoreCase(palabra)) {

                JOptionPane.showMessageDialog(null, "Palabra correcta");//mensaje que se imprime si la respuesta es correcta
                correctas++;//contamos aciertos
            } else {

                JOptionPane.showMessageDialog(null, "Palabra incorrecta");//mensaje que se imprime si la respuesta es incorrecta
                incorrectas++;//contamos desaciertos
            }
            i--;
        }
        /**
         * Impresión de contadores con mensaje de palabras correctas e
         * incorrectas
         */
        JOptionPane.showMessageDialog(null,
                "Palabras coorectas " + correctas
                + "\n Palabras incorrectas " + incorrectas);
    }

    /**
     * Método de desorden de palabras que muestra los caracteres diferentes
     */
    static String desordenarPalabra(String palabra) {
        return palabra.substring(1) + palabra.charAt(0);
    }

}
