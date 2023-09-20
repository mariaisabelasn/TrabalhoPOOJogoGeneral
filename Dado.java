package JogoGeneralTrabalho;

import java.util.Random;

public class Dado {
     private int sideUp;

        public Die(){
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
