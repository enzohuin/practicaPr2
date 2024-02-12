package aplicacion;

import mates.Matematicas;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Principal {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos. Se espera que el primer
     *             argumento sea el número de pasos para la aproximación de Pi.
     */
    public static void main(String[] args) {
        // Verifica si se proporciona al menos un argumento en la línea de comandos.
        if (args.length < 1) {
            System.err.println("Se espera al menos un argumento: el número de pasos.");
            System.exit(1);
        }

        // Convierte el primer argumento a un entero que representa el número de pasos.
        int numeroPasos = Integer.parseInt(args[0]);

        // Utiliza el método de la clase Matematicas para generar una aproximación de Pi.
        double piAproximado = Matematicas.generarNumeroPiIterativo(numeroPasos);

        // Imprime el resultado.
        System.out.println("El número PI es " + piAproximado);
    }
}
