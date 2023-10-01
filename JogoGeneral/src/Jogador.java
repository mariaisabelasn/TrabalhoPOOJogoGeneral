

import java.util.Scanner;

public class Jogador {
    private String nome = new String();
    private String tipoJogador = new String();
    private JogoGeneral= jogoGeneral;
        
    Scanner teclado = new Scanner (System.in);

    // Construtor
    public Jogador (String nome, String tipoJogador){
        this.nome = nome;
        this.tipoJogador = tipoJogador;
        this.jogoGeneral = new JogoGeneral();
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipoJogador(){
        return this.tipoJogador;
    }

    public int getJogoGeneral(int i){ 	// Função para pegar as jogadas da ficha dos respectivos jogadores.
        return this.jogoGeneral.getJogadas(i);
    }
    // public void jogarDados(){
    //     .roll();
    // }

    // public String toString(){
    //     return(this.nome);
    // }

    public escolherJogada(){
        int opcao = 0;
        if(getTipoJogador()=="H"){ //Se o jogador for humano ele escolhe a jogada que quer fazer
            do{
                opcao = teclado.nextInt();
                if(jogoGeneral.validarJogada(opcao)){ // se a jogada escolhida estiver disponível então será marcada e excutada
                    this.jogoGeneral.getJogadas[opcao] = 1;
                }
                else{
                    System.out.println("Jogada indisponível, tente outra");
                }
            }while(!jogoGeneral.validarJogada(opcao));

        }
        else{   // Se for do tipo máquina irá escolher a melhor jogada
//tentar achar um código na net para melhores jogadas/ jogadas inteligentes
        }

        


    }


    public mostrarJogadasExecutadas(){
        // Jogadas já feitas
		for (int i = 0 ; i < 13 ; i++) { 
			if(this.jogoGeneral.getJogadas(i) != -1) {
				System.out.print("X\t");
			} else {
				System.out.print("-\t");
			}
		}
		System.out.println("");
    }

}

