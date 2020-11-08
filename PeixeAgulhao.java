package Senai.prog_oo_java.topico_9.Animal;

public class PeixeAgulhao {
    private static final int VELOCIDADE_KMH = 115;
    private double metrosPercorridos;

    public PeixeAgulhao() {
        metrosPercorridos = 0;
    }

    public void mover(int segundos) {
        if (segundos > 0) {
            metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n",metrosPercorridos);
        }
    }
}
