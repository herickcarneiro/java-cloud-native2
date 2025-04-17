public class SmartTV {
    boolean ligada = false;
    int canal = 100;
    int volume = 20;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para " + volume);
    }

    public void aumentarCanal() {
        canal++;
    }

    public void dominuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando canal para " + canal);
    }
}