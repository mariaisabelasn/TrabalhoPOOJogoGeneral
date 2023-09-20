package JogoGeneralTrabalho;

public class JogoGeneral {
    private[]
    Dado dados = new Dado[5];private[]
    int jogadas = new int[13];

    public JogoGeneral() {
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Dado(); // cria os 5 dados
        }
        for (int j = 0; j < 13; j++) {
            this.jogadas[i] = -1; // -1 marca que a jogada em questao ainda nao foi realizada.
        }
    }

    public void rolarDados() { // resultados dos 5 dados
        for (int i = 0; i < 5; i++) {
            this.dados[i].roll();
        }
    }

    toString String() { // transforma o valor dos dados em string
        return dados;
    }

    public Boolean validarJogada(String njogada, Dado[] dados){ //vai verificar se a jogada escolhida é valida retorna 1 vdd 0 falso
        int i=0;
        if(njogada=="1"){
            do{
                if(dados[i]==1){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="2"){
            do{
                if(dados[i]==2){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="3"){
            do{
                if(dados[i]==3){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="4"){
            do{
                if(dados[i]==4){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="5"){
            do{
                if(dados[i]==5){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="6"){
            do{
                if(dados[i]==6){
                    return 1; //certo
                }

            }while(i!=5);
        }
        if(njogada=="T"){
            do{
                if(dados[i]==3){
                    return 1; //certo
                }

            }while(i!=5);
        }

}

    public int pontuarJogada(String njogada, Dado[] dados){
        if(validarJogada(njogada, dados)){ //se a jogada for validada
            int i = 0;
            int cont = 0;
            if(njogada=="1"){
                do{
                    if(dados[i].getSideUp()==1){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);

                return cont;
            }
            else if(njogada=="2"){
                do{
                    if(dados[i].getSideUp()==2){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);

                return cont;
            
            }
            else if(njogada=="3"){
                do{
                    if(dados[i].getSideUp()==3){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);
                
                return cont;
            }
            else if(njogada=="4"){
                do{
                    if(dados[i].getSideUp()==4){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);

                return cont;
            }
            else if(njogada=="5"){
                do{
                    if(dados[i].getSideUp()==5){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);

                return cont;
            }
            else if(njogada=="6"){
                do{
                    if(dados[i].getSideUp()==6){
                        cont += dados[i].getSideUp();
                    }

                }while(i!=5);

                return cont;
            }
            else if(njogada=="T"){
                do{
                    cont += dados[i].getSideUp();
                    i++;
                }while(i!=5);

                return cont;
            }
            else if(njogada=="Q"){
                do{
                    cont += dados[i].getSideUp();
                    i++;
                }while(i!=5);

                return cont;
            }
            else if(njogada=="F"){
                return 25;
            }
            else if(njogada=="S+"){
                return 30;
            }
            else if(njogada=="S-"){
                return 40;
            }
            else if(njogada=="G"){
                return 50;
            }
            else if(njogada=="X"){
                do{
                    cont += dados[i].getSideUp();
                    i++;
                }while(i!=5);

                return cont;
            }
        }
    }

}
