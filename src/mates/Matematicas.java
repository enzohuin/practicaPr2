package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long puntosDentroCirculo = 0;

        Random random = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distanciaAlCentro = x * x + y * y;

            if (distanciaAlCentro <= 1) {
                puntosDentroCirculo++;
            }
        }

        // La fórmula para aproximar Pi mediante Montecarlo
        double piAproximado = 4.0 * puntosDentroCirculo / pasos;

        return piAproximado;
    }
}
