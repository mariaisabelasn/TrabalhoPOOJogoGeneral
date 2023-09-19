package JogoGeneralTrabalho;

public class JogoGeneral {
    private[] Dado dados = new Dado[5];
    private[] int jogadas = new int[13];

    public JogoGeneral(){
        for(int i = 0; i < 5; i++){
            this.dados[i] = new Dado();
        }
        for(int j = 0; j < 13; j++){
            this.jogadas[i] = -1;   // -1 marca que a jogada em questao ainda nao foi realizada.
        }
    }

    public void jogarDados(){
        for(int i = 0; i < 5; i++){
            this.dados[i].roll();
        }
    }
    
}
