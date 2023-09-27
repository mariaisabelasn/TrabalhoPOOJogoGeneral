package JogoGeneralTrabalho;

public class Jogador {
    private String nome = new String();
    private String tipoJogador = new String();

    public Jogador (String nome, String tipoJogador){
        this.nome = nome;
        this.tipoJogador = tipoJogador;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipoJogador(){
        return this.tipoJogador;
    }

    public void jogarDados(){
        System.out.println("Rolando dados para"+this.nome+"...");
        .roll();
    }

    // public String toString(){
    //     return(this.nome);
    // }

    public escolherJogada(){
        if(getTipoJogador()=="H"){

        }
    }

    public mostrarJogadasExecutadas(){

    }




    
}
