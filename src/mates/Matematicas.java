package mates;

import java.util.Random;

/**
 * Clase que contiene métodos matemáticos, incluyendo la aproximación de Pi
 * mediante el método de Montecarlo.
 */
public class Matematicas {

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     *
     * @param pasos El número de puntos generados para la aproximación.
     * @return Una aproximación del valor de Pi.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long puntosDentroCirculo = 0;

        // Se utiliza la clase Random para generar puntos aleatorios.
        Random random = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Calcula la distancia al centro del círculo.
            double distanciaAlCentro = x * x + y * y;

            // Verifica si el punto está dentro del círculo.
            if (distanciaAlCentro <= 1) {
                puntosDentroCirculo++;
            }
        }

        // La fórmula para aproximar Pi mediante Montecarlo.
        double piAproximado = 4.0 * puntosDentroCirculo / pasos;

        return piAproximado;
    }
}
