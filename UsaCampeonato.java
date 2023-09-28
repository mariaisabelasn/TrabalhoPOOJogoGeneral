package JogoGeneralTrabalho;
import java.util.Scanner;

public class Campeonato {
    private Jogador[] players = new Jogador[5];
       
    public stat ic void main(String[] args){

        Scanner teclado = new Scanner (System.in);
        int opcao = 0;

        do{
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("1 - Incluir Jogador");
            System.out.println ("2 - Remover Jogador" );
            System.out.println ("3 - Iniciar Campeonato");
            System.out.println ("4 - Mostrar Cartela");
            System.out.println ("5 - Gravar em Arquivo");
            System.out.println ("6 - Ler do Arquivo");

            System.out.print ("Entre com uma opcao: ");
            opcao = teclado.nextInt( );

            switch( opcao ){
                case 1:
                    System.out.println ("Ola mundo");
                    break;
                case 2:
                    System.out.println ("Ola POO");
                    break;
                case 3:
                    System.out.println ("Saindo");
                    break;
                case 4:
                    System.out.println ("Saindo");
                    break;
                case 5:
                    System.out.println ("Saindo");
                    break;
                case 6:
                    System.out.println ("Saindo");
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(opcao != 6);

    }
 }