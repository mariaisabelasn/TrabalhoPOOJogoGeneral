package JogoGeneralTrabalho;

public class JogoGeneral {
    private[] Dado dados = new Dado[5];
    private[] int jogadas = new int[13];

    public JogoGeneral(){
        for(int i = 0; i < 5; i++){
            this.dados[i] = new Dado(); // cria os 5 dados
        }
        for(int j = 0; j < 13; j++){
            this.jogadas[i] = -1;   // -1 marca que a jogada em questao ainda nao foi realizada.
        }
    }

    public void rolarDados(){ //resultados  dos 5 dados 
        for(int i = 0; i < 5; i++){
            this.dados[i].roll();
        }
    }

    toString String (){ //transforma o valor dos dados em string
        return dados;
    }

    public Boolean validarJogada(int njogada, Dado[] dados){ //vai verificar se a jogada escolhida é valida retorna 1 vdd 0 falso
        int i=0;
    if(njogada==1){
        do{
            if(dados[i]==1){
                break;
            }

        }while(i!=5)
    }
    
}
    
}
