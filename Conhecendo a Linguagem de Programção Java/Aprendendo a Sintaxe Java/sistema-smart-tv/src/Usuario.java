public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("X-------------------------------X");
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        System.out.println("X-------------------------------X");
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("X-------------------------------X");

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("X-------------------------------X");
    }
}
