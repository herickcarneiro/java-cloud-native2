package ex01_models;

public class Telegram extends ServiceMensagem {
    public void enviarMensagem() {
        estabelecerConexao();
        System.out.println("Enviando mensagem via Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Telegram");
    }
}
