package JogoDaVelha;

public class Tabuleiro {
    private char simbolo;

    public Tabuleiro() {
        this.simbolo = ' ';
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public void setSimbolo(char simbolo) {
        if(this.simbolo == ' '){
            this.simbolo = simbolo;
        }else{
            System.out.println("Já foi preenchido!");
        }

    }

    //Contrução do tabuleiro
    public static void imprimirTabuleiro(Tabuleiro[][] tabuleiroJogo){
        System.out.println("   0    1    2");
        System.out.printf("0  %c |  %c  |  %c  %n"
                ,tabuleiroJogo[0][0].getSimbolo()
                ,tabuleiroJogo[0][1].getSimbolo()
                ,tabuleiroJogo[0][2].getSimbolo());
        System.out.printf("1  %c |  %c  |  %c  %n"
                ,tabuleiroJogo[1][0].getSimbolo()
                ,tabuleiroJogo[1][1].getSimbolo()
                ,tabuleiroJogo[1][2].getSimbolo());
        System.out.printf("2  %c |  %c  |  %c  %n"
                ,tabuleiroJogo[2][0].getSimbolo()
                ,tabuleiroJogo[2][1].getSimbolo()
                ,tabuleiroJogo[2][2].getSimbolo());
    }

    //Verifica quem é o vencedor
    public static boolean verificaTabuleiro(Tabuleiro[][] tabuleiroJogo, Jogador jogadorHumano, Integer rododaPartida){

        //Verifica X
        //Vertical
        if(tabuleiroJogo[0][0].getSimbolo() == 'X'
                && tabuleiroJogo[1][0].getSimbolo() == 'X'
                && tabuleiroJogo[2][0].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][1].getSimbolo() == 'X'
                && tabuleiroJogo[1][1].getSimbolo() == 'X'
                && tabuleiroJogo[2][1].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][2].getSimbolo() == 'X'
                && tabuleiroJogo[1][2].getSimbolo() == 'X'
                && tabuleiroJogo[2][2].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }

        //Horizontal
        else if(tabuleiroJogo[0][0].getSimbolo() == 'X'
                && tabuleiroJogo[0][1].getSimbolo() == 'X'
                && tabuleiroJogo[0][2].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }
        else if(tabuleiroJogo[1][0].getSimbolo() == 'X'
                && tabuleiroJogo[1][1].getSimbolo() == 'X'
                && tabuleiroJogo[1][2].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }
        else if(tabuleiroJogo[2][0].getSimbolo() == 'X'
                && tabuleiroJogo[2][1].getSimbolo() == 'X'
                && tabuleiroJogo[2][2].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }

        //Diagonal
        else if(tabuleiroJogo[0][0].getSimbolo() == 'X'
                && tabuleiroJogo[1][1].getSimbolo() == 'X'
                && tabuleiroJogo[2][2].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][2].getSimbolo() == 'X'
                && tabuleiroJogo[1][1].getSimbolo() == 'X'
                && tabuleiroJogo[2][0].getSimbolo() == 'X')
        {
            System.out.println("'X' "+ jogadorHumano.getNome() +" venceu!");
            return true;
        }

        //Verifica O
        //Vertical
        if(tabuleiroJogo[0][0].getSimbolo() == 'O'
                && tabuleiroJogo[1][0].getSimbolo() == 'O'
                && tabuleiroJogo[2][0].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][1].getSimbolo() == 'O'
                && tabuleiroJogo[1][1].getSimbolo() == 'O'
                && tabuleiroJogo[2][1].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][2].getSimbolo() == 'O'
                && tabuleiroJogo[1][2].getSimbolo() == 'O'
                && tabuleiroJogo[2][2].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }

        //Horizontal
        if(tabuleiroJogo[0][0].getSimbolo() == 'O'
                && tabuleiroJogo[0][1].getSimbolo() == 'O'
                && tabuleiroJogo[0][2].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        else if(tabuleiroJogo[1][0].getSimbolo() == 'O'
                && tabuleiroJogo[1][1].getSimbolo() == 'O'
                && tabuleiroJogo[1][2].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        else if(tabuleiroJogo[2][0].getSimbolo() == 'O'
                && tabuleiroJogo[2][1].getSimbolo() == 'O'
                && tabuleiroJogo[2][2].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        //Diagonal
        if(tabuleiroJogo[0][0].getSimbolo() == 'O'
                && tabuleiroJogo[1][1].getSimbolo() == 'O'
                && tabuleiroJogo[2][2].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }
        else if(tabuleiroJogo[0][2].getSimbolo() == 'O'
                && tabuleiroJogo[1][1].getSimbolo() == 'O'
                && tabuleiroJogo[2][0].getSimbolo() == 'O')
        {
            System.out.println("'O' Computador venceu!");
            return true;
        }

        //Verifica se houve empate
        if(rododaPartida > 9){
            System.out.println("Deu velha!");
            return true;
        }

        return false;
    }

}
