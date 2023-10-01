package JogoGeneralTrabalho;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UsaCampeonato {
       
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
        int opcao = 0;

        do{
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("(a) Para incluir um jogador ");
            System.out.println ("(b) Para excluir um jogador (pelo nome)" );
            System.out.println ("(c) Executar rodada");
            System.out.print ("(d) Mostrar a cartela de resultados da última jogada realizada]");
            System.out.print ("(e) Gravar os dados do campeonato em arquivo");
            System.out.print ("(f) Ler os dados do campeonato em arquivo");
            System.out.print ("(g) Sair da aplicação");
            opcao = teclado.nextInt( );

            switch( opcao ){
                case "a":
                    incluirjogador();
                    break;
                case "b":
                    removerJogador();
                    break;
                case "c":
                    iniciarCampeonato();
                    break;
                case "d":
                    mostrarCartela();
                    break;
                case "e":
                    gravarEmArquivo();
                    break;
                case "f":
                    lerDoArquivo();
                    break;
                case "g":
                    System.out.println ("Saindo...");
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(opcao != "g");

    }
 }

