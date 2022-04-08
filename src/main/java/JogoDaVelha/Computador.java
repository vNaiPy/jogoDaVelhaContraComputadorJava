package JogoDaVelha;

import java.util.Random;

public class Computador {

    public int[] jogarComputador(Integer rodadaPartida) {

        Random gerador = new Random();

        int[] pntJogado = new int[2];

        pntJogado[0] = gerador.nextInt(3);
        pntJogado[1] = gerador.nextInt(3);

        return pntJogado;
    }

}
