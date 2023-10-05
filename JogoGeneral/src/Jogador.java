
import java.util.Scanner;

//.
public class Jogador {
    private String nome = new String();
    private String tipoJogador = new String();
    private JogoGeneral jogoGeneral = new JogoGeneral();
    private int[] vet = new int[13];

    Scanner teclado = new Scanner(System.in);

    // Construtor
    public Jogador(String nome, String tipoJogador) {
        this.nome = nome;
        this.tipoJogador = tipoJogador;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipoJogador() {
        return this.tipoJogador;
    }

    public int getJogoGeneral(int i) { // Função para pegar as jogadas da "ficha" dos respectivos jogadores.
        return this.jogoGeneral.getJogadas(i);
    }

// public void escolherJogada(){
//     int opcao = 0;
        
//         if (jogoGeneral.validarJogadas(opcao-1)==true) {
//             this.jogoGeneral.setJogadas(opcao-1, this.jogoGeneral.pontuarJogada(opcao));
//         } else {
//             System.out.println("Jogada indisponível, tente outra");
//         }
//         // else{
//         //     teclado.nextLine(); // Limpar o buffer de entrada em caso de entrada não numérica
//         //     System.out.println("Entrada inválida. Digite um número válido.");
//         //     opcao = -1; // Defina uma opção inválida para continuar o loop
//         // }

//     else
//     { // Se for do tipo máquina irá escolher a melhor jogada
//         int melhorPontuacao = 0;
//         int melhorJogada = 0;
//         while (opcao < 13) {// basicamente vai ver para aquela rodada qual vai ser a jogada com maior
//                             // pontuação
//             if (this.jogoGeneral.getJogadas(opcao) == -1) {// se já não for ocupada a jogada
//                 int pontuacao = jogoGeneral.getJogadas(opcao);

//                 if (pontuacao > melhorPontuacao) {// serve p achar a melhor jogada mas vai acabar preenchendo todas as
//                                                   // outras do vetor jogadas tbm
//                     melhorPontuacao = pontuacao;
//                     melhorJogada = opcao;

//                 }

//             } else {
//                 vet[opcao] = 1;// se a jogada já tiver sido usada anteriormente é marcada como 1;
//             }

//             opcao++;
//         }

//         for (int i = 0; i < 13; i++) {
//             if (this.jogoGeneral.getJogadas(i) != melhorPontuacao && vet[i] != 1) {
//                 this.jogoGeneral.setJogadas(i, -1); // resolve o problema de preenchimento de outras jogadas
//             }
//         }
//         this.jogoGeneral.setJogadas(melhorJogada, melhorPontuacao);// pontua para a máquina

//         System.out.println("jogada da maquina: " + melhorJogada);// retorna a jogada feita pela maquina
//     }
//     }

    public void mostrarJogadasExecutadas() {
        // Jogadas já feitas
        for (int i = 0; i < 13; i++) {
            if (this.jogoGeneral.validarJogada(i)==true) {
                System.out.printf("%d", jogoGeneral.getJogadas(i));
            } 
            else {
                System.out.print("-\t");
            }
        }
        System.out.println("");
    }

    public void imprimirDados() { // imprime nome tipo e jogadas do jogador
        System.out.println(this.nome.toString());
        System.out.println(this.tipoJogador.toString());
        System.out.println(this.jogoGeneral.toString());
    }

}
