package Clases;

/**
 *
 * @author Carlos Ernesto Pérez Pérez.
 * @author Rafael Alberto Saborío Rojas.
 * @author Feddy Junior Pérez Cordoba.
 *
 * @since 2021/12/09
 *
 * @version 1.0
 *
 * Descripción: El proyecto consiste en realizar un juego de habilidad mental en
 * el lenguaje de programación "JAVA". Se desarrollaron 3 aplicaciones en una
 * sola.
 *
 * Dentro de este programa tendra las siguientes opciones:
 *
 * 1. Clasificación de Palabras. Esta aplicación consiste en que se le solicita
 * al usuario tres palabras, para ordenarlas por: a)Vocales. b)Consonantes.
 * c)Alfabeticamente. d)Ingreso.
 *
 * 2. Palabras desordenadas. Esta aplicación consiste en ir mostrando en
 * pantalla palabras desordenadas para que el usuario la escriba de forma
 * ordenada
 *
 * 3. Trivia matemática. Este juego consiste en una trivia matemática, donde se
 * va a ir mostrando al usuario problemas matemáticos que debe ir resolviendo de
 * forma acumulada.
 *
 * Clase Principal
 *
 * Contiene información del menú principal del programa.
 *
 */
public class Principal {

    public static void main(String args[]) {
        /**
         * Declaracion de variable de tipo objeto.
         *
         * @see MenuProyecto
         */
        MenuProyecto objMenuProyecto;

        /**
         * Se Instancia el objeto..
         *
         * @see MenuProyecto
         */
        objMenuProyecto = new MenuProyecto();

        /**
         * Impresión del método para mostrar el menú principal al usuario..
         *
         * @see MenuProyecto
         */
        objMenuProyecto.mostrarMenu();

        /**
         * @deprecated se mantiene por estándar pero no se utiliza.
         */
        System.exit(0);

    }

}
