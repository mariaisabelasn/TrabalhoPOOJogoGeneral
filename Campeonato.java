package JogoGeneralTrabalho;

public class Campeonato {
    private Jogador[] players = new Jogador[5];
    int cont=0;

    public Campeonato(){

    }

    public void incluirjogador(nome player, tipoJogador biotipo){
        if(cont < 5){
            Jogador jogador = new Jogador(nome, biotipo);
            players[cont]=jogador;
            cont++;

        }

    }
    public void removerJogador (nome player){
        

    }
       
    
 }