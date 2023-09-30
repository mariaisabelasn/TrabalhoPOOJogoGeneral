package JogoGeneral;

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
    
    
}
