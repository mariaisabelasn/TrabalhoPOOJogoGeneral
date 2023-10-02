import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Campeonato {
    private Jogador[] players = new Jogador[5]; // vetor dos jogadores do campeonato
    private int contJogadores = 0;
    private Scanner teclado = new Scanner(System.in);// scanf do java
    JogoGeneral jogo = new JogoGeneral();
    private String nome, biotipo;

    public Campeonato() {
        for (int i = 0; i < players.length; i++) {
            players[i] = null; // Define cada elemento como nulo
        }
    }

    public void incluirjogador() {
        if (contJogadores < 5 && players[contJogadores] == null) {

            System.out.println("Nome do Jogador(a): ");
            nome = teclado.nextLine();
            System.out.println("Tipo do Jogador [H-Humano ou M-Máquina]: ");
            biotipo = teclado.nextLine();

            Jogador jogador = new Jogador(nome, biotipo);
            players[contJogadores] = jogador;
            contJogadores++;

        } else {
            System.out.println("Não podem ser incluídos novos jogadores(as)");
        }

    }

    public void removerJogador() {
        System.out.println("Digite o nome do jogador:");
        nome = teclado.nextLine();

        for (int i = 0; i < 5; i++) {
            if (nome.equals(players[i].getNome())) {
                for (int j = i; j < contJogadores - 1; j++) {
                    players[j] = players[j - 1];// vai "puxando" os que vem depois pro lugar do exclindo e reordenando
                }
                contJogadores--;// diminui a quantidade total de jogadore para que, se o usuario quiser, possa
                                // adicionar outro
                break;
            }
        }
        players[contJogadores] = null;
        System.out.println("Jogador(a) inexistente");

    }

    public void iniciarCampeonato() {//inicia ou reinicia um campeonato
        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < contJogadores; i++) {
                System.out.println("Rolando dados para" + players[i].getNome());
                System.out.print("Valores obtidos: ");// imprime sem pular a linha pros dados ficarem do lado
                jogo.rolarDados();
                jogo.mostrarDados();

                System.out.println("Para qual jogada deseja marcar: [1-13]" + players[i].getNome() + "?");

                players[i].escolherJogada();

                System.out.println("1\t2\t3\t4\t5\t6\t7(T)\t8(Q)\t9(F)\t10(S+)\t11(S-)\t12(G)\t13(X)");

                players[i].mostrarJogadasExecutadas();

            }
        }
    }

    public void mostrarCartela() {
        System.out.println("-- Cartela de Resultados --");
        System.out.print("Jogada\t");

        for(int i=0; i<contJogadores; i++){
            System.out.print(players[i].getNome()+"("+players[i].getTipoJogador()+")\t");
        } // vai imprimir o nome e o tipo de todos os players lado a lado
        System.out.print("\n"); //pula linha quando os nomes terminam

        String[] type={"1", "2", "3", "4", "5", "6", "7(T)", "8(Q)", "9(F)", "10(S+)", "11(S-)", "12(G)", "13(X)"};//string com os "nomes" das jogadas
        
       for(int j=0; j<13;j++){
        System.out.print(type[j]+"\t");//imprime os nomes das jogadas
        
        for(int k=0; k<contJogadores; k++){
            System.out.print(players[k].getJogoGeneral(k)+"\t"); // pega as pontuações jogadas de uma "ficha" dos jogadores que é o jogogeneral
        }
        System.out.print("\n");
       }

       System.out.println("-------------------------");
       System.out.println("Total\t");




    }
    public int somaJogadas(int jogante){
            int=soma;
            for(int j=0; j<13; j++){//pra percorrer todos od jogos de cada jogador
                soma=players[jogante].getJogoGeneral(j);

            }

        
    }

    public void gravarEmArquivo() {
        /* Gravar em arquivo */
        File arquivo = new File("Campeonato.dat");
        try {
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            // gravando o vetor de pessoas no arquivo
            oos.writeObject(players); //gravando o dado dos players, que é o único tipo que dá pra gravar e ler por se array(seguindo os exemplos da professora lá da classe pessoa)
            oos.flush();
            oos.close();
            fout.close();

        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }

    }

    public void lerDoArquivo() {
        File arquivo = new File("Campeonato.dat");

        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            //Lendo objetos de um arquivo
            Jogador[] players= (Jogador[]) oin.readObject();
            oin.close();
            fin.close();

            for (Jogador p : players) {
                p.imprimirDados();//Ainda falta essa função aqui
            }
        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }

    }

}