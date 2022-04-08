package JogoDaVelha.Adversarios;

import JogoDaVelha.Computador;

import java.util.Random;

public class ComputadorC extends Computador {

    @Override
    public int[] jogarComputador(Integer rodadaPartida) {

        Random gerador = new Random();

        int[] pntJogado = new int[2];

        //Faz a primeira jogada diferente
        if(rodadaPartida == 2){
            pntJogado[0] = gerador.nextInt(3);
            pntJogado[1] = gerador.nextInt(1);
        }else{
            //Faz jogadas aleatórias
            pntJogado[0] = gerador.nextInt(3);
            pntJogado[1] = gerador.nextInt(3);
        }

        return pntJogado;
    }
}
