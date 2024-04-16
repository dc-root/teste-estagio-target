package me.dcdev.teste.exercicioUm;

public class PercorrerSequenciaDeNumeros {
    public static void main(String[] args) {
        int INDICE =13, SOMA = 0, K=0;

        for(;K < INDICE;K++) {
            SOMA = SOMA + K;
        }

        System.out.println(SOMA); // 78
    }
}
