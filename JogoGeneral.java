package JogoGeneralTrabalho;

import java.util.Arrays;

public class JogoGeneral {
    private Dado dados = new Dado[5];
    private int jogadas = new int[13];

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

    public String toString() { // transforma o valor dos dados em string
        return Arrays.dados;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Meu Array: [");

        for (int i = 0; i < meuArray.length; i++) {
            result.append(meuArray[i]);
            if (i < meuArray.length - 1) {
                result.append(", "); // Adiciona uma vírgula e um espaço entre os elementos, exceto no último.
            }
        }

        result.append("]");
        return result.toString();
    }

    public String toString() {
        String result = "Meu Array: [";
    
        for (int i = 0; i < meuArray.length; i++) {
            result += meuArray[i];
            if (i < meuArray.length - 1) {
                result += ", "; // Adiciona uma vírgula e um espaço entre os elementos, exceto no último.
            }
        }
    
        result += "]";
        return result;
    }

    public Boolean validarJogada(int njogada) { // vai verificar se a jogada escolhida é valida retorna
        int i = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;

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
            // do {
            //     if (this.dados[i].getSideUp() == 1) {
            //         cont1++;
            //     } 
            //     else if (this.dados[i].getSideUp() == 2) {
            //         cont2++;
            //     } 
            //     else if (this.dados[i].getSideUp() == 3) {
            //         cont3++;
            //     } 
            //     else if (this.dados[i].getSideUp() == 4) {
            //         cont4++;
            //     } 
            //     else if (this.dados[i].getSideUp() == 5) {
            //         cont5++;
            //     } 
            //     else if (this.dados[i].getSideUp() == 6) {
            //         cont6++;
            //     }

            //     i++;
            // } while (i != 5);
            // if (cont1 == 3 || cont2 == 3 || cont3 == 3 || cont4 == 3 || cont5 == 3 || cont6 == 3) { // é trinca
            //     return true;
            // } 
            // else {
            //     return false;
            // }
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
            // do {
            //     if (this.dados[i].getSideUp() == 1) {
            //         cont1++;
            //     } else if (this.dados[i].getSideUp() == 2) {
            //         cont2++;
            //     } else if (this.dados[i].getSideUp() == 3) {
            //         cont3++;
            //     } else if (this.dados[i].getSideUp() == 4) {
            //         cont4++;
            //     } else if (this.dados[i].getSideUp() == 5) {
            //         cont5++;
            //     } else if (this.dados[i].getSideUp() == 6) {
            //         cont6++;
            //     }
            //     i++;
            // } while (i != 5);

            // if (cont1 == 4 || cont2 == 4 || cont3 == 4 || cont4 == 4 || cont5 == 4 || cont6 == 4) {
            //     return true;
            // } 
            // else {
            //     return false;
            // }
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
            int vet[5]={2,3,4,5,6};//vetor como a jogada de sequencia alta deve ser
            for(int i=0; i<5; i++){
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
            int vet[5]={1,2,3,4,5};//vetor como a jogada de sequencia baixa deve ser
            for(int i=0; i<5; i++){
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
            // int indice =this.dados[0];
            // for (int i=0; i<5; i++){
            //     if(indice==this.dados[i].getSideUp()){
            //         cont++;
            //     }

            // }   
            // if(cont==5){
            //     return true;
            // }
            // else{
            //     return false;
            // }
            if(contador(5)){
                return true;
            }
            else{
                return false;
            }

        }
        else if(njogada==13){//jogada aleatória
            if(jogadas[11]!=-1){
                System.out.println("Jodada já 
                utilizada.");
                return false;
            }
            else {
                return true;
            }

        }

    }

    public int pontuarJogada(int njogada) {
        if (validarJogada(njogada)) { // se a jogada for validada
            int i = 0;
            int cont = 0;
            if (njogada == 1) { //dá pra juntar para otimizar colocando no mesmo if jogadas 1 2 3 4 5 6 e aleatoria
                do {
                    if (dados[i].getSideUp() == 1) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            } 
            else if (njogada == 2) {
                do {
                    if (dados[i].getSideUp() == 2) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;

            } 
            else if (njogada == 3) {
                do {
                    if (dados[i].getSideUp() == 3) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            } 
            else if (njogada == 4) {
                do {
                    if (dados[i].getSideUp() == 4) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            } 
            else if (njogada == 5) {
                do {
                    if (dados[i].getSideUp() == 5) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            } 
            else if (njogada == 6) {
                do {
                    if (dados[i].getSideUp() == 6) {
                        cont += dados[i].getSideUp();
                    }

                } while (i != 5);

                return cont;
            }
            else if (njogada == 7) { // trinca
                do {
                    cont += dados[i].getSideUp();
                    i++;
                } while (i != 5);

                return cont;
            } 
            else if (njogada == 8) {// quarta
                do {
                    cont += dados[i].getSideUp();
                    i++;
                } while (i != 5);

                return cont;
            } 
            else if (njogada == 9) {
                i = 25;
                return i;
            } 
            else if (njogada == 10) {
                return 30;
            } 
            else if (njogada == 11) {
                return 40;
            } 
            else if (njogada == 12) {
                return 50;
            } 
            else if (njogada == 13) {
                do {
                    cont += dados[i].getSideUp();
                    i++;
                } while (i != 5);

                return cont;
            }
        }
    }

    public Boolean (int x){ // recebe a quantidade que deve ser repetido (por ex da quadra x=4)
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

