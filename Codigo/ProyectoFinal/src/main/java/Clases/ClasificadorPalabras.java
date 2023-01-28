package Clases;

/**
 *
 * @since 2021/12/09
 *
 * @version 1.0
 *
 * Clase Clasificación de palabras
 *
 * La aplicacioón consiste en que se trabajara con la solicitud y ordenamiento
 * de tres palabras, segun los requerimientos del proyecto
 *
 * 1) Ordenamiento de menor a mayor por cantidad de carácteres. 2) Ordenamiento
 * de menor a mayor por cantidad de vocales. 3) Ordenamiento de menor a mayor
 * por cantidad de consonantes. 4) Ordenamiento alfabetico. 5) Ordenamiento por
 * ingreso.
 *
 *
 * Para este objeto se requirió el uso de diferentes APIS para disponer de
 * múltiples métodos y asi poder aplicarlos en el desarrollo de los
 * requerimientos del proyecto.
 *
 * Arrays (clase) java.util.Arrays Esta clase proporciona múltiples métodos para
 * manipular Arrays sobre múltiples tipos de datos T: primitivos(enteros,
 * reales, carácteres y booleanos) y objetos.
 *
 * java.util.Collections La interfaz de Java Collections Framework proporciona
 * tipos de datos abstractos que representan colecciones, Está en la parte
 * superior de la jerarquía del marco de Colecciones.
 *
 * javax.swing.JOptionPane es una clase que nos provee una conjunto de ventanas
 * de diálogo que es ideal, para mostrar mensajes al usuario.
 *
 */
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ClasificadorPalabras {

    /**
     * char[] Este método Java toma un argumento que siempre es de tipo int.
     */
    char[] vocales
            = {
                'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú',
                'A', 'E', 'I', 'O', 'U', 'Á', 'Á', 'Á', 'O', 'Ú'
            };
    char[] consonantes
            = {
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
            };

    /**
     * Array[] array Java es una estructura de datos que nos permite almacenar
     * una lista de datos de un mismo tipo.
     */
    int[] contador;
    String[] arrPalabras;
    String[] palabrasIngresadas;
    int[] arreglo;

    /**
     * Método ClasificadorPalabras() Es nuestro constructor por omisión en este
     * objeto. En este declaramos la dimensión de nuestro Array.
     */
    public ClasificadorPalabras() {
        this.arrPalabras = new String[3];
        this.palabrasIngresadas = new String[3];
        this.arreglo = new int[3];
    }

    /**
     * Método llenadoPalabras() Se ultiliza para solicitar al usuarios datos de
     * tipo String, que se estarán utilizando para almacenar los datos en los
     * diferentes índices.
     */
    public void llenadoPalabras() {

        this.arrPalabras[0] = (JOptionPane.showInputDialog(null, "Ingrese la primera palabra: "));
        this.arrPalabras[1] = JOptionPane.showInputDialog(null, "Ingrese la segunda palabra: ");
        this.arrPalabras[2] = JOptionPane.showInputDialog(null, "Ingrese la tercera palabra: ");
        for (int i = 0; i < arrPalabras.length; i++) {
            palabrasIngresadas[i] = arrPalabras[i];
        }
    }

    /**
     * Método mostrarMenu() La ultilidad de este método es poder tener una
     * interacción con el usuario, mostrandole opciones que puede utilizar para
     * elegir el orden que desea, ademas hacemos uso de los métodos 'switch';
     * 'do while' para mantener los datos en el espacio de memoria y de esta
     * manera el usuario, pueda realizar más de una opción con los datos ya
     * solicitados en la primera opción.
     */
    public void mostrarMenu() {

        String opciones = "**** Menú Operaciones proyecto final ****";
        opciones += "\n1. LLenado de palabras. "
                + "\n2. Ordenamiento de menor a mayor por cantidad de carácteres"
                + "\n3. Ordenamiento de menor a mayor por cantidad de vocales. "
                + "\n4. Ordenamiento de menor a mayor por cantidad de consonantes. "
                + "\n5. Ordenamiento alfabético. "
                + "\n6. Ordenamiento por ingreso. "
                + "\n7. Salir."
                + "\n Digite una opción: ";
        String dato = "";
        int opcion = 0;
        do {
            dato = JOptionPane.showInputDialog(opciones);
            opcion = Integer.parseInt(dato);

            switch (opcion) {
                case 1:
                    this.llenadoPalabras();
                    break;
                case 2:
                    this.ordenPalabras();
                    break;
                case 3:
                    this.ordenadoVocales();
                    break;
                case 4:
                    this.ordenConsonantes();
                    break;
                case 5:
                    this.ordenAlfabetico();
                    break;
                case 6:
                    this.ordenIngreso();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Está saliendo del juego \n"
                            + " **clasificador de palabras**");
                    break;
            }
        } while (opcion != 7);
    }

    /**
     * Método ordenadoPalabras(String[] palabras, int[] cantidades) utilizado
     * para tener un orden de palabras ingresadas y contar carácteres.
     */
    public void ordenadoPalabras(String[] palabras, int[] cantidades) {
        String aux;
        for (int i = 0; i < cantidades.length; i++) {
            if (i + 1 != cantidades.length) {
                if (cantidades[i] > cantidades[i + 1]) {
                    aux = palabras[i];
                    palabras[i] = palabras[i + 1];
                    palabras[i + 1] = aux;
                    int vocal = cantidades[i];
                    cantidades[i] = cantidades[i + 1];
                    cantidades[i + 1] = vocal;
                }
            } else {
                break;
            }
        }
    }

    /**
     * Método ordenPalabras() Se utiliza para tener un orden de palabras de
     * menor a mayor para cumplir la primera sentencia.
     */
    public void ordenPalabras() {
        for (int i = 0; i > this.arrPalabras.length; i++) {
            for (int j = 0; j > this.arrPalabras.length - 1; j++) {
                String actual = this.arrPalabras[j], siguiente = this.arrPalabras[j + 1];
                if (actual.compareTo(siguiente) > 0) {
                    this.arrPalabras[j] = siguiente;
                    this.arrPalabras[j + 1] = actual;
                }
            }
        }
        JOptionPane.showMessageDialog(null, this.arrPalabras);
    }

    /**
     * Método ordenadoVocales() Se ultiliza el método para contar los carácteres
     * que pertenecen a las vocales para luego ordenarlas e imprimirlas de menor
     * a mayor.
     */
    public void ordenadoVocales() {
        int[] numVocales = new int[arrPalabras.length];
        int VocalesNum = vocales.length, ConsonantesNum = consonantes.length;
        int contVocales = 0;
        for (int i = 0; i < this.arrPalabras[0].length(); i++) {
            for (int j = 0; j < VocalesNum; j++) {
                if (vocales[j] == this.arrPalabras[0].charAt(i)) {
                    contVocales++;
                }
            }
        }

        numVocales[0] = contVocales;
        contVocales = 0;
        for (int i = 0; i < this.arrPalabras[1].length(); i++) {
            for (int j = 0; j < VocalesNum; j++) {
                if (vocales[j] == this.arrPalabras[1].charAt(i)) {
                    contVocales++;
                }
            }
        }

        numVocales[1] = contVocales;
        contVocales = 0;
        for (int i = 0; i < this.arrPalabras[2].length(); i++) {
            for (int j = 0; j < VocalesNum; j++) {
                if (vocales[j] == this.arrPalabras[2].charAt(i)) {
                    contVocales++;
                }
            }
        }

        numVocales[2] = contVocales;
        String contenido = "**** Ordenado de palabras por vocales **** \n";
        ordenadoPalabras(this.arrPalabras, numVocales);
        imprimirResultado(contenido, this.arrPalabras, numVocales);
    }

    /**
     * Método imprimirResultado Se utiliza para tener un formato de impresión
     * para el resto de requerimientos del sistema.
     */
    private void imprimirResultado(String mensaje, String[] palabras, int[] cantidades) {
        if (cantidades != null) {
            for (int i = 0; i < palabras.length; i++) {
                mensaje += palabras[i] + " (" + cantidades[i] + ")" + "\n";
            }
        } else {
            for (Object palabra : palabras) {
                mensaje += palabra + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Método ordenConsonantes() Se ultiliza el método para contar los
     * carácteres que pertenecen a consonantes para luego ordenarlas e
     * imprimirlas de menor a mayor.
     */
    public void ordenConsonantes() {
        String auxConsonante = "";
        this.arreglo = new int[3];
        int ConsonantesNum = consonantes.length, auxContaConsonante;
        int contConsonantes = 0;
        for (int i = 0; i < this.arrPalabras[0].length(); i++) {
            for (int j = 0; j < ConsonantesNum; j++) {
                if (consonantes[j] == this.arrPalabras[0].charAt(i)) {
                    contConsonantes++;
                }
            }
        }
        this.arreglo[0] = contConsonantes;
        contConsonantes = 0;
        for (int i = 0; i < this.arrPalabras[1].length(); i++) {
            for (int j = 0; j < ConsonantesNum; j++) {
                if (consonantes[j] == this.arrPalabras[1].charAt(i)) {
                    contConsonantes++;
                }
            }
        }
        this.arreglo[1] = contConsonantes;
        contConsonantes = 0;
        for (int i = 0; i < this.arrPalabras[2].length(); i++) {
            for (int j = 0; j < ConsonantesNum; j++) {
                if (consonantes[j] == this.arrPalabras[2].charAt(i)) {
                    contConsonantes++;
                }
            }
        }
        this.arreglo[2] = contConsonantes;
        for (int i = 0; i < this.arreglo.length - 1; i++) {
            for (int j = 0; j < this.arreglo.length - 1; j++) {
                if (this.arreglo[j] > this.arreglo[j + 1]) {
                    auxContaConsonante = this.arreglo[j];
                    auxConsonante = this.arrPalabras[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arrPalabras[j] = this.arrPalabras[j + 1];
                    this.arreglo[j + 1] = auxContaConsonante;
                    this.arrPalabras[j + 1] = auxConsonante;
                }
            }
        }
        String resultado = "Ordenado de palabras por consonantes: \n";
        ordenadoPalabras(this.arrPalabras, arreglo);
        imprimirResultado(resultado, this.arrPalabras, arreglo);
    }

    /**
     * Método ordenAlfabetico() Se utiliza el metodo Collections.sort para
     * cumplir la condición de imprimir en orden alfabetico
     */
    public void ordenAlfabetico() {
        Collections.sort(Arrays.asList(palabrasIngresadas));

        String resultado = "Ordenado de palabras por alfabeto: \n";
        imprimirResultado(resultado, palabrasIngresadas, null);
    }

    /**
     * Método ordenIngreso() Se utiliza para cumplir la condición de imprimir en
     * orden de ingreso.
     */
    public void ordenIngreso() {
        String resultado = "Ordenado de palabras por ingreso: \n";
        imprimirResultado(resultado, palabrasIngresadas, null);
    }
}
