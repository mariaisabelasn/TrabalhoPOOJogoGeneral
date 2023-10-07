import java.io.Serializable;
public class Jogador implements Serializable{
    private String nome = new String();
    private String tipoJogador = new String();
    private JogoGeneral jogoGeneral = new JogoGeneral();

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

    public JogoGeneral getJogo() { //para acessar por outra classe o jogo de cada jogador
        return this.jogoGeneral;
    }

    public void dell(){ //deleta os dados do jogador
        this.nome=null;
        this.tipoJogador=null;
        this.jogoGeneral=null;
    }


    public void mostrarJogadasExecutadas() {
        // Jogadas já feitas
        // System.out.println("entrou no mostrar");
		for (int i = 0 ; i < 13 ; i++) { 
			if(this.jogoGeneral.getJogadas(i) !=-1) {
                // System.out.println("entrou no mostrar 3");
				System.out.printf("%d\t", this.jogoGeneral.getJogadas(i)); 
			} 
            else if(this.jogoGeneral.getJogadas(i) ==-1) {
				System.out.print("-\t");
			}
		}
		System.out.println("");
    }

    public void imprimirDados(){ //imprime nome tipo e jogadas do jogador 
        System.out.println("Nome do jogador(a): "+this.nome.toString());
        System.out.println("Tipo do jogador(a): "+this.tipoJogador.toString());
        System.out.println(this.jogoGeneral.toString());
    }

}
