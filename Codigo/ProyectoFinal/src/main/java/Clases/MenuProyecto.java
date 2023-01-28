package Clases;

/**
 * @since 2021/12/09
 *
 * @version 1.0
 *
 * Se importa la api javax.swing.JOptionPane para utilizar cuadros de diálogos
 * en la interacción con el usuario.
 */
import javax.swing.JOptionPane;

/**
 * Clase del menu del proyecto
 *
 * Contiene la informacion del menu principal y el cual llama a los submenus de
 * las clases.
 *
 */
public class MenuProyecto {

    /**
     * Creación de objetos para el manejo de los juegos.
     */
    private TriviaMatematica objTriviaMatematica;
    private ClasificadorPalabras objClasificadorPalabras;
    private PalabrasDesordenadas objPalabrasDesordenadas;

    /**
     * Método encargado para mostrar el menú.
     */
    public void mostrarMenu() {
        /**
         * Instanciar los objetos de las clases.
         *
         * @param TriviaMatematica
         * @param ClasificadorPalabras
         * @param PalabrasDesordenadas
         */
        this.objTriviaMatematica = new TriviaMatematica();
        this.objClasificadorPalabras = new ClasificadorPalabras();
        this.objPalabrasDesordenadas = new PalabrasDesordenadas();

        /**
         * Mensaje de bienvenida al programa con información general.
         */
        JOptionPane.showMessageDialog(null, "         ****Hola bienvenido a PlayApp UH****"
                + "\n    Este programa consta de 3 juegos mentales"
                + "\n"
                + "\n"
                + "\n    Elaborado por CarlosP, FreddyP, RafaelS."
                + "\n    Fecha 09 de diciembre 2021."
                + "\n                   'Proyecto Final'");

        /**
         * Mostrar el menú al usuario dandole opción de elegir uno de los tres
         * juegos o salir del programa.
         */
        String opcionMenu = ""
                + "\n     Elija una opción: ";
        opcionMenu += "\n1.   Clasificador de Palabras.";
        opcionMenu += "\n2.   Palabras Desordenadas.";
        opcionMenu += "\n3.   Trivia Matemáticas.";
        opcionMenu += "\n4.   Salir.";

        //Atributos
        /**
         * Obtiene una respuesta.
         */
        String dato = "";
        /**
         * Atributo de tipo entero para convertir el String a entero.
         */
        int opcion = 0;

        /**
         * Método do while para que el menú se repita mientras el usuario no
         * eleja la opción de salir.
         */
        do {
            /**
             * Atributo quien recibe una opción del menú de tipo String
             */
            dato = JOptionPane.showInputDialog(opcionMenu);
            /**
             * Atributo para convertir un dato de tipo String a entero.
             */
            opcion = Integer.parseInt(dato);
            /**
             * Método switch para eleccion de opciones y llamar a cada atributo
             * correspondiente.
             */
            switch (opcion) {
                case 1:
                    /**
                     * @param ClasificadorPalabra Se llama al método mostrarMenu
                     * de la clase ClasificadorPalabra.
                     */
                    this.objClasificadorPalabras.mostrarMenu();
                    break;
                case 2:
                    /**
                     * @param PalabrasDesordenadas Se llama al método
                     * PalabrasDesordenadas de la clase PalabrasDesordenadas.
                     */
                    this.objPalabrasDesordenadas.PalabrasDesordenadas();
                    break;
                case 3:
                    /**
                     * @param TriviaMatematica Se llama al método
                     * TriviaMatematica de la clase TriviaMatematica.
                     */
                    this.objTriviaMatematica.TriviaMatematica();
                    break;
                case 4:
                    /**
                     * opción para salir del programa. Se muestra un mensaje de
                     * salida
                     */
                    JOptionPane.showMessageDialog(null, "Has salido del sistema.");
                    break;
            }
            /**
             * Cierre del método switch.
             */
        } while (opcion != 4);

    }
}
