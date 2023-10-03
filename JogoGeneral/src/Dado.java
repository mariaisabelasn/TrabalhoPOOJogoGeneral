

import java.util.Random;

public class Dado {
    private int sideUp; //parte superior

        //construtor
        public Dado(){
            sideUp = 1;
        }

    public int getSideUp(){//pega a parte virada pra cima
        return  sideUp;
    }

    public void roll(){ //faz a rolagem do dado
        Random x = new Random();
        this.sideUp = x.nextInt(6) + 1;
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
    
    
}
