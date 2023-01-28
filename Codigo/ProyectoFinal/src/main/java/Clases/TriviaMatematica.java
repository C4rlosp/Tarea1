package Clases;

import javax.swing.JOptionPane;

/**
 * Clase TriviaMatematica Contiene los métodos para realizar operaciones
 * matemáticas.
 *
 * @author CarlosP, FreddyP y RafaS.
 * @since 01/10/2021
 * @version 1.0
 */
/**
 * Este juego consiste en una trivia matemática, donde se va a ir mostrando al
 * usuario preguntas matemáticas que debe ir resolviendo de forma acumulada.
 * Cada pregunta va a estar formada de una operación matemática donde los
 * números mostrados se van a ir generando de forma aleatoria entre el 5 y el 25
 * y los signos de operación permitidos son la suma ( + ), resta ( - ) y
 * multiplicación ( * ), los cuales también se van a escoger al azar.
 *
 * Con cada pregunta se le van a mostrar al usuario 3 opciones de respuesta,
 * definidas de la siguiente forma: • Respuesta 1: es el resultado correcto de
 * la operación definida • Respuesta 2: se genera aleatoriamente con un número
 * entre -35 y uno menos al valor de la respuesta. Por ejemplo si el resultado
 * correcto es 10, entonces se genera un número aleatoriamente entre --35 y 9. •
 * Respuesta 3: se genera aleatoriamente con un número entre un valor mayor a la
 * respuesta correcta y 900. Por ejemplo si el resultado correcto es 20,
 * entonces se genera un número aleatoriamente entre 21 y 900.
 *
 * Para evitar que todas las preguntas tengan siempre la respuesta en la primera
 * opción, el orden de las respuestas se deben colocar de forma aleatoria.
 *
 * En total se deben realizar 5 operaciones. Por cada pregunta, se le debe
 * indicar al usuario el número, por ejemplo: “ Pregunta 1 … ”. Si el usuario
 * responde una pregunta de forma incorrecta, el programa le muestra un mensaje
 * indicando el resultado correcto. Al final del juego, se le muestra al usuario
 * la cantidad de respuestas correctas e incorrectas.
 */
public class TriviaMatematica {

    /**
     * Método público encargado de mostrar el detalle de las operaciones
     * matemática
     */
    public void TriviaMatematica() {
//Declaración de variables
        /**
         * Inicializacón de atributos
         *
         * @param correctas
         * @param incorrectas
         */
        int correctas = 0;
        int incorrectas = 0;
        String[] operEspeciales = {"+", "-", "*"};

        /**
         * Método público que realiza las operaciones matemáticas
         *
         * @param operEspeciales
         */
//Aplicación de ciclo for
        for (int i = 0; i < 5; i++) {
            /**
             */
            String[] result = new String[3];
            /**
             * Se realiza la multiplicación de números aleatorios
             *
             * @param oper1
             * @param oper2
             */
            int oper1 = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
            int oper2 = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
            String oper = operEspeciales[(int) Math.floor(Math.random() * (2 - 0 + 1) + 0)];
            String operacion = String.valueOf(oper1) + oper + String.valueOf(oper2);
            String resultCorrecto = recibeRespuesta(oper1, oper2, oper);
            String resultIncorrecto = String.valueOf((int) Math.floor(Math.random() * ((Integer.valueOf(resultCorrecto) - 1) - (-35) + 1) + (-35)));
            String resultIncorrecto2 = String.valueOf((int) Math.floor(Math.random() * (900 - ((Integer.valueOf(resultCorrecto) - 1)) + 1) + ((Integer.valueOf(resultCorrecto) - 1))));
            result[0] = resultCorrecto;
            result[1] = resultIncorrecto;
            result[2] = resultIncorrecto2;
            /**
             * Iterador contador inicializado
             *
             * @param contador
             */
            int contador = 0;
            String operacionesM = "Resuelva la siguiente operación matemática:  " + operacion + "\n";
            /**
             * Ejecución de if con módulo del iterador "i" Esto para generar un
             * conteo del arreglo con módulo sumando un número más en cada paso
             * por el arreglo
             */
            if (i % 2 == 0) {
                contador = contador + 1;
                for (int j = 0; j < result.length; j++) {

                    operacionesM += "Opción(" + contador + ") = " + result[j] + "\n";
                    contador++;
                }

            } else {
                contador = contador + 1;
                for (int j = result.length - 1; j >= 0; j--) {
                    operacionesM += "Opción(" + contador + ") = " + result[j] + "\n";
                    contador++;
                }

            }
            /**
             * Mostramos el mensaje con el resultado de las operaciones
             * matemáticas
             *
             * @param res
             * @return respuestasfallidas o respuestas correctas
             */
            JOptionPane.showMessageDialog(null, operacionesM);
            int res = 0;
            res = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese la respuesta correcta"));

            if (res == Integer.valueOf(resultCorrecto)) {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        JOptionPane.showMessageDialog(null, "Respuestas correctas: " + correctas + "\n Respuestas fallidas: " + incorrectas);

    }

    /**
     * Menú de operaciones en case Muestra los valores de las operaciones a
     * consultar al usuario
     */
    static String recibeRespuesta(int oper1, int oper2, String oper) {
        String resultado = "";
        switch (oper) {
            case "+":
                resultado = String.valueOf((oper1 + oper2));
                return resultado;
            case "-":
                resultado = String.valueOf((oper1 - oper2));
                return resultado;
            case "*":
                resultado = String.valueOf((oper1 * oper2));
                return resultado;
        }
        return "";
    }
}
