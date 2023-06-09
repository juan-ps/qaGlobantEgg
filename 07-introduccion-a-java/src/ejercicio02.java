/* EJERCICIO N°2 :: GUIA 07 - Introducción a Java
 * PDF: Material de Trabajo
 * Curso QA + Automation by Globant / Egg Cooperation
*/

// IMPORTAMOS CLASE SCANNER DESDE EL PAQUETE JAVA UTIL
import java.util.Scanner;

    /**
     * @author Juan Pablo Sinkachkuk / GITHUB: '@juan-ps'
     * @version 1.0
     */

public class ejercicio02 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        /* Escribir un programa que pida tu nombre,
        lo guarde en una variable y lo muestre por
        pantalla. */

        // DEFINIMOS VARIABLES Y EL METODO LEER
        String nombre;
        Scanner leer = new Scanner(System.in);

        // PEDIMOS AL USUARIO LOS DATOS
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        // IMPRIMIMOS EL NOMBRE POR PANTALLA
        System.out.println("Su nombre es: " + nombre);
        System.out.println("");

        // FIN DEL PROGRAMA
        leer.close();
        System.out.println("-------------------------------------------");
        System.out.println("    Programa hecho por @juan-ps (GitHub)   ");
        System.out.println("");
        
    }
}