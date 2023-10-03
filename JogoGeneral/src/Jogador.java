
import java.util.Scanner;

public class Jogador {
    private String nome = new String();
    private String tipoJogador = new String();
    private JogoGeneral jogoGeneral = new JogoGeneral();
    private int[] vet= new int[13];
        
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

    public int getJogoGeneral(int i){ 	// Função para pegar as jogadas da "ficha" dos respectivos jogadores.
        return this.jogoGeneral.getJogadas(i);
    }

    public int escolherJogada(){
        int opcao = 1;
        if(getTipoJogador()=="H"){ //Se o jogador for humano ele escolhe a jogada que quer fazer
            do{
                teclado.nextLine();
                opcao = teclado.nextInt();
                if(jogoGeneral.validarJogada(opcao)){ // se a jogada escolhida estiver disponível então será marcada e excutada (MACRI se quer marcar e executar tem que ser o PontuarJogada, ele vai ver a validade e já marcar se n for valido zera)
                    this.jogoGeneral.setJogadas(opcao, 1);
                }
                else{
                    System.out.println("Jogada indisponível, tente outra");
                }
            }while(!jogoGeneral.validarJogada(opcao));//Se um determinado resultado n˜ao cumprir os requisitos para a jogada escolhida, o jogador zera a respectiva jogada. (Até aqui tá no pontuar MACRI) E ainda, se um determinado resultado n˜ao puder ser classificado como nenhuma das jogadas ainda restantes para aquele jogador, ele dever´a escolher qual das jogadas restantes ser´a descartada, marcando 0 (zero) para a jogada correspondente.(ver isso, caho que á simplesmente: se ele for escolher e nada se encaixar, escolher uma qualquer e ela vai ser zerada nos requisitos)
            

        }
        else{   // Se for do tipo máquina irá escolher a melhor jogada
//tentar achar um código na net para melhores jogadas/ jogadas inteligentes
            int melhorPontuacao = 0;
            int melhorJogada=0;
    
            do{//basicamente vai ver para aquela rodada qual vai ser a jogada com maior pontuação
                if(this.jogoGeneral.getJogadas(opcao)==-1){//se já não for ocupada a jogada
                    int pontuacao = jogoGeneral.getJogadas(opcao);

                    if(pontuacao>melhorPontuacao){//serve p achar a melhor jogada mas vai acabar preenchendo todas as outras do vetor jogadas tbm
                        melhorPontuacao=pontuacao;
                        melhorJogada=opcao;

                    }

                }
                else{
                    vet[opcao] = 1;//se a jogada já tiver sido usada anteriormente é marcada como 1;
                }

                opcao++;
            }while(opcao<13);

            for (int i=0; i<13; i++){
                if(this.jogoGeneral.getJogadas(i)!= melhorPontuacao && vet[i]!=1){
                    this.jogoGeneral.setJogadas(i, -1); //resolve o problema de preenchimento de outras jogadas
                }
            }

            return melhorJogada;
        }

        return 0; // caso todas as jogadas tenham sido executadas ele zera 

    }


    public void mostrarJogadasExecutadas(){
        // Jogadas já feitas
		for (int i = 0 ; i < 13 ; i++) { 
			if(this.jogoGeneral.getJogadas(i) != -1) {
				System.out.printf("%d", jogoGeneral.getJogadas(i)); 
			} else {
				System.out.print("-\t");
			}
		}
		System.out.println("");
    }

    public void imprimirDados(){ //imprime nome tipo e jogadas do jogador 
        System.out.println(this.nome.toString());
        System.out.println(this.tipoJogador.toString());
        System.out.println(this.jogoGeneral.toString());
    }

}

