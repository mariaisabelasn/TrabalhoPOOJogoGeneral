package JogoGeneralTrabalho;

import java.util.Arrays;

public class JogoGeneral {
    private Dado[] dados = new Dado[5];
    private int[] jogadas = new int[13];

    public JogoGeneral() {
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Dado(); // cria os 5 dados
        }
        for (int j = 0; j < 13; j++) {
            this.jogadas[j] = -1; // -1 marca que a jogada em questao ainda nao foi realizada.
        }
    }

    public void rolarDados() { // resultados dos 5 dados
        for (int i = 0; i < 5; i++) {
            this.dados[i].roll();
        }
    }

    public String toString() { //transforma o array de dados em uma string
        String result = "Valores obtidos: ";
    
        for (int i = 0; i < dados.length; i++) {
            result += dados[i].getSideUp() ;
            if (i < dados.length - 1) {
                result += "-"; // Adiciona um traço entre os elementos, exceto no último
            }
        }
        return result;
    }

    public Boolean validarJogada(int njogada) { // vai verificar se a jogada escolhida é valida retorna
        int i = 0;

        if (njogada == 1) {
            if (jogadas[0] != -1) { //verifica se dentro das jogadas feitas essa já n está preenchida
                System.out.println("Jodada já utilizada.");
                return false;
            }
            do {
                if (this.dados[i].getSideUp() == 1) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 2) {
            if(jogadas[1]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            do {
                if (this.dados[i].getSideUp() == 2) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 3) {
            if(jogadas[2]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            do {
                if (this.dados[i].getSideUp() == 3) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 4) {
            if(jogadas[3]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            do {
                if (this.dados[i].getSideUp() == 4) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 5) {
            if(jogadas[4]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            do {
                if (this.dados[i].getSideUp() == 5) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 6) {
            if(jogadas[5]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            do {
                if (this.dados[i].getSideUp() == 6) {
                    return true; // certo
                }
                i++;
            } while (i != 5);
        } 
        else if (njogada == 7) { //trinca
            if(jogadas[6]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            if(contador(3)){
                return true;
            }
            else{
                return false;
            }
        }
        else if (njogada == 8) { //quadrula
            if(jogadas[7]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            
            if(contador(4)){
                return true;
            }
            else{
                return false;
            }

        }
        else if(njogada==9){//FULL HOUSE
            

        }
        else if(njogada==10){//Sequencia alta
            if(jogadas[9]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            int vet[]={2,3,4,5,6};//vetor como a jogada de sequencia alta deve ser
            for(i=0; i<5; i++){
                if(this.dados[i]!=vet[i]){
                    return false;
                }
            }
            return true; //se passar pelo for e o primeiro if sem problemas

        }
        else if(njogada==11){//Sequencia Baixa
            if(jogadas[10]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            int vet[]={1,2,3,4,5};//vetor como a jogada de sequencia baixa deve ser
            for(i=0; i<5; i++){
                if(this.dados[i]!=vet[i]){
                    return false;
                }
            }
            return true; //se passar pelo for e o primeiro if sem problemas
        }
        else if(njogada==12){//General
            if(jogadas[11]!=-1){
                System.out.println("Jodada já utilizada.");
                return false;
              }
            
            if(contador(5)){
                return true;
            }
            else{
                return false;
            }

        }
        else if(njogada==13){//jogada aleatória
            if(jogadas[11]!=-1){
                System.out.println("Jogada ja usada");
                return false;
            }
            else {
                return true;
            }

        }

    }

    public int pontuarJogada(int njogada) {
        // if () { // se a jogada for validada
            int i = 0;
            int cont = 0;
            if (njogada == 1 || njogada==2 || njogada==4 || njogada==5 || njogada==6 || njogada==13) { //dá pra juntar no mesmo if jogadas 1 2 3 4 5 6 e aleatoria pq todos os resultados delas são as somas
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                do {
                    if (dados[i].getSideUp() == 1) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            } 
            else if (njogada == 7) { // trinca
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                do {
                    cont += dados[i].getSideUp();
                    i++;
                } while (i != 5);

                return cont;
            } 
            else if (njogada == 8) {// quarta
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                do {
                    cont += dados[i].getSideUp();
                    i++;
                } while (i != 5);

                return cont;
            } 
            else if (njogada == 9) {// full hand
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                i=25;
                return i;
            } 
            else if (njogada == 10) {//sequencia alta
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                i=30;
                return i;
            } 
            else if (njogada == 11) {//sequencia baixa
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                i=40;
                return i;
            } 
            else if (njogada == 12) { //general
                if(validarJogada(njogada)==false){ //se a jogada escolhida não for valida ela é zerada
                    return 0;
                }
                i=50;
                return i;
            } 
            else{
                System.out.println("Essa jogada não exite");
                return 0;
            }
        
    }

    public Boolean contador (int x){ // recebe a quantidade que deve ser repetido (por ex da quadra x=4)
        boolean resultado = false;
        int posicao;

        for (int j=0; j<5; j++){
            cont=0;
            posicao=this.dados[j].getSideUp();

                    for (i=0; i<5; i++){
                        if(posicao==this.dados[i].getSideUp()){
                            cont++;
                        }

                    }   

            if (cont>=x){
                resultado=true;
            }
                
        }
        if(resultado==true){
            return true;
        }
        else{
            return false;
        }
 }

 public void mostrarDados (){
    
        System.out.println(this.dados.toString());
    }
    


}

