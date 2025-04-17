package ex01_models;

public class MSN extends ServiceMensagem {
    public void enviarMensagem() {
        estabelecerConexao();
        System.out.println("Enviando mensagem via MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");
    }
}
