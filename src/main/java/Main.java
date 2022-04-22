import JogoDaVelha.Adversarios.ComputadorA;
import JogoDaVelha.Adversarios.ComputadorB;
import JogoDaVelha.Adversarios.ComputadorC;
import JogoDaVelha.Computador;
import JogoDaVelha.Jogador;
import JogoDaVelha.Tabuleiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Tabuleiro[][] tabuleiroJogo = new Tabuleiro[3][3];
        Jogador jogadorHumano = new Jogador();

        boolean jogoEmAndamento = true;
        boolean ganhador = false;
        Computador computador;

        char simboloAtual = 'X';
        Integer rodadaPartida = 1;

        //Pega o nome do jogador
        System.out.println("Escreva o seu nome, jogador: ");
        String nomeJogadorHumano = teclado.next();
        if(nomeJogadorHumano != ""){
            jogadorHumano.setNome(nomeJogadorHumano);
        }

        //Selecionar a dificuldade do adversário
        System.out.println("Selecione o adversário digitando um número de 1 a 3: ");
        Integer adversarioComputador = teclado.nextInt();
        if(adversarioComputador == 2){
            computador = new ComputadorB();
            System.out.println("Jogador Computador B");
        }else if(adversarioComputador == 3){
            computador = new ComputadorC();
            System.out.println("Jogador Computador C");
        }else{
            computador = new ComputadorA();
            System.out.println("Jogador Computador A");
        }

        iniciarJogoVelha(tabuleiroJogo);

        //Inicio do jogo
        while(jogoEmAndamento){
            Tabuleiro.imprimirTabuleiro(tabuleiroJogo);
            ganhador = Tabuleiro.verificaTabuleiro(tabuleiroJogo, jogadorHumano, rodadaPartida);

            if(ganhador){//Imprimi o ganhador e finaliza o jogo.
                break;
            }

            try{
                if(simboloAtual == 'X'){//Jogada do humano
                    if(verificaRodada(tabuleiroJogo, jogar(teclado, simboloAtual), simboloAtual)){
                        simboloAtual = 'O';
                        rodadaPartida++;
                    }
                }else if(simboloAtual == 'O') {//Jogada do computador
                    if(verificaRodada(tabuleiroJogo, computador.jogarComputador(rodadaPartida), simboloAtual)){
                        simboloAtual = 'X';
                        rodadaPartida++;
                    }
                }
            }catch(Exception e){
                System.out.println("Houve algum problema!");
            }
        }
    }

    //Verifica posição jogada na rodada
    public static boolean verificaRodada(Tabuleiro[][] tabuleiroJogo, int pntJogado[], char simboloAtual){
        if (tabuleiroJogo[pntJogado[0]][pntJogado[1]].getSimbolo() == ' ') {
            tabuleiroJogo[pntJogado[0]][pntJogado[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    //Informa a localização de onde deve ser marcado com o simbolo do jogador
    public static int[] jogar(Scanner teclado, char simboloAtual){

        int[] pntJogado = new int[2];

        System.out.println("A vez é do: " + simboloAtual);
        System.out.println("Informe a linha: ");
        pntJogado[0] = teclado.nextInt();
        System.out.println("Informe a coluna: ");
        pntJogado[1] = teclado.nextInt();

        return pntJogado;
    }

    //Dá inicio ao jogo da velha
    public static void iniciarJogoVelha(Tabuleiro[][] tabuleiroJogo){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tabuleiroJogo[i][j] = new Tabuleiro();
            }
        }
    }
}
