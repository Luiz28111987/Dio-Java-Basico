public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarTv smarTv = new SmarTv();

        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal Atual : " + smarTv.canal);
        System.out.println("Volume Atual : " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smarTv.ligada);
        smarTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smarTv.ligada);

        smarTv.aumentarVolume();
        smarTv.abaixarVolume();

        smarTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smarTv.canal);
        smarTv.abaixarCanal();
        smarTv.aumentarCanal();

    }
}
