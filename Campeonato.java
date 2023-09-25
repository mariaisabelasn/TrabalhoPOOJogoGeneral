package JogoGeneralTrabalho;

public class Campeonato {
    private Jogador[] players = new Jogador[5];
    int cont=0;

    public void incluirjogador(nome player, tipoJogador biotipo){
        if(cont != 5){
            players[cont]=(player, biotipo);
        }

    }
       
    
 }