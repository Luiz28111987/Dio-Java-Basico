public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentou o canal para: " + canal);
    }
    public void abaixarCanal(){
        canal--;
        System.out.println("Diminuiu o canal para: " + canal);
    }

    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentou o volume para: " + volume);
    }
    public void abaixarVolume(){
        //volume = volume - 1
        volume--;
        System.out.println("Diminuiu o volume para: " + volume);
    }

}
