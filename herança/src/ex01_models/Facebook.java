package ex01_models;

public class Facebook extends ServiceMensagem {
    public void enviarMensagem() {
        estabelecerConexao();
        System.out.println("Enviando mensagem via Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Facebook");
    }
}
