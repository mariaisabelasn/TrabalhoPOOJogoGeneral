package JogoGeneralTrabalho;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Campeonato {
    // private Jogador[] players = new Jogador[5]; // vetor dos jogadores presentes no campeonato TIRAR PQ TÁ EM FUNÇÕES
       
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
        int opcao = 0;

        do{
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("(a) Para incluir um jogador ");
            System.out.println ("(b) Para excluir um jogador (pelo nome)" );
            System.out.println ("(c) Executar rodada");
            System.out.print ("(d) Mostrar a cartela de resulatdos [da última jogada realizada]");
            System.out.print ("(e) Gravar os dados do campeonato em arquivo");
            System.out.print ("(f) Ler os dados do campeonato em arquivo");
            System.out.print ("(g) Sair da aplicação");
            opcao = teclado.nextInt( );

            switch( opcao ){
                case "a":
                    System.out.println ("Ola mundo");
                    break;
                case "b":
                    System.out.println ("Ola POO");
                    break;
                case "c":
                    System.out.println ("Saindo");
                    break;
                case "d":
                    System.out.println ("Saindo");
                    break;
                case "e":
                    System.out.println ("Saindo");
                    break;
                case "f":
                    System.out.println ("Saindo");
                    break;
                case "g":
                    System.out.println ("Saindo");
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(opcao != "g");

    }
 }