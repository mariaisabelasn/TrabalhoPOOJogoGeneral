package JogoGeneralTrabalho;
import java.util.Scanner;

public class Campeonato {
    private Jogador[] players = new Jogador[5];
       
    public stat ic void main(String[] args){

        Scanner teclado = new Scanner (System.in);
        int opcao = 0;

        do{
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("1 - Ola mundo");
            System.out.println ("2 - Ola POO" );
            System.out.println ("3 - Sair");
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
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(opcao != 3);

    }
 }