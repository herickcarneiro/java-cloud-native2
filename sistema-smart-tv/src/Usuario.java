public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual canal atua? " + smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Novos Status -> Tv ligada?" + smartTv.ligada);
        smartTv.mudarCanal(120);

    }

}
