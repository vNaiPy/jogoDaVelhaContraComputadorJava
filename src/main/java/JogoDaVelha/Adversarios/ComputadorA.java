package JogoDaVelha.Adversarios;

import JogoDaVelha.Computador;

import java.util.Random;

public class ComputadorA extends Computador {

    @Override
    public int[] jogarComputador(Integer rodadaPartida) {

        //Faz somente jogadas aleatórias
        Random gerador = new Random();

        int[] pntJogado = new int[2];

        pntJogado[0] = gerador.nextInt(3);
        pntJogado[1] = gerador.nextInt(3);

        return pntJogado;
    }
}
