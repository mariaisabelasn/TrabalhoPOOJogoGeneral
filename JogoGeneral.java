package JogoGeneralTrabalho;

public class JogoGeneral {
    private[] Dado dados = new Dado[5];
    private[] int jogadas = new int[13];

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

    toString String() { // transforma o valor dos dados em string
        return dados;
    }

    public Boolean validarJogada(String njogada, Dado[] dados){ //vai verificar se a jogada escolhida é valida retorna 1 vdd 0 falso
    int i=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
    if(njogada=="1"){
        do{
            if(dados[i].getSideUp()==1){
                return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="2"){
        do{
            if(dados[i].getSideUp()==2){
               return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="3"){
        do{
            if(dados[i].getSideUp()==3){
                return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="4"){
        do{
            if(dados[i].getSideUp()==4){
                return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="5"){
        do{
            if(dados[i].getSideUp()==5){
                return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="6"){
        do{
            if(dados[i].getSideUp()==6){
                return 1; //certo
            }
            i++;
        }while(i!=5);
    }
    else if(njogada=="T"){
        do{
            if(dados[i].getSideUp()==1){
                cont1++;
            }
            else if(dados[i].getSideUp()==2){
                cont2++;
            }
            else if(dados[i].getSideUp()==3){
                cont3++;
            }
            else if(dados[i].getSideUp()==4){
                cont4++;
            }
            else if(dados[i].getSideUp()==5){
                cont5++;
            }
            else if(dados[i].getSideUp()==6){
                cont6++;
            }

            i++;
        }while(i!=5);
        if(cont1==3|| cont2==3|| cont3==3 ||cont4==3 || cont5==3|| cont6==3){ //é trinca
                return 1;
        }
            else{
                return 0;
            }
    }   
    if(njogada == "Q"){
            do{
            if(dados[i].getSideUp()==1){
                cont1++;
            }
            else if(dados[i].getSideUp()==2){
                cont2++;
            }
            else if(dados[i].getSideUp()==3){
                cont3++;
            }
            else if(dados[i].getSideUp()==4){
                cont4++;
            }
            else if(dados[i].getSideUp()==5){
                cont5++;
            }
            else if(dados[i].getSideUp()==6){
                cont6++;
            }
            i++;
        }while(i!=5);

        if(cont1==4|| cont2==4|| cont3==4 ||cont4==4 || cont5==4|| cont6==4){ //é trinca
                return 1;
         }
        else{
                return 0;
        }

    }
}// macri


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
