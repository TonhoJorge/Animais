package Senai.prog_oo_java.topico_9.Animal;

public class Guepardo {
    private static final int VELOCIDADE_KMH = 130;
    private double metrosPercorridos;

    public Guepardo() {
        metrosPercorridos = 0;
    }

    public void mover(int segundos) {
        if (segundos > 0) {
            metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
            System.out.printf("O guepardo correu %.1f metros.%n", metrosPercorridos);
        }
    }
}
