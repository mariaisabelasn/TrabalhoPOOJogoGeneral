package JogoGeneralTrabalho;

import java.util.Scanner;

public class Campeonato {
    private Jogador[] players = new Jogador[5]; //vetor dos jogadores do campeonato
    int contJogadores=0;
    Scanner teclado = new Scanner(System.in);//scanf do java
    String nome, biotipo;

    public Campeonato(){
        for (int i = 0; i < players.length; i++) {
            players[i] = null; // Define cada elemento como nulo 
        }

    }

    public void incluirjogador(){
        if(cont < 5 && players[cont]==null){ 

            System.out.println("Nome do Jogador(a): ");
            player=teclado.nextline();
            System.out.println("Tipo do Jogador [H-Humano ou M-Máquina]: ");
            biotipo=teclado.nextline();

            Jogador jogador = new Jogador(nome , biotipo);
            players[contJogadores]=jogador;
            contJogadores++;

        }
        else {
            System.out.println("Não podem ser incluídos novos jogadores(as)");
        }

    }
    public void removerJogador (){
        System.out.println("Digite o nome do jogador:");
        name=teclado.nextLine();

        for(int i=0; i<5; i++){
          if(name==players[i].getNome()){
            for(int j=i; j<contJogadores-1; j++){
                players[j]=players[j-1];//vai "puxando" os que vem depois pro lugar do exclindo e reordenando
            }
            contJogadores--;//diminui a quantidade total de jogadore para que, se o usuario quiser, possa adicionar outro
            break;
          }

        } 
         System.out.println("Jogador(a) elseinexistente");
        
    }
       
    
 }