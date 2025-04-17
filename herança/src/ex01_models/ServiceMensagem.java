package ex01_models;

public abstract class ServiceMensagem {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void estabelecerConexao() {
        System.out.println("Conexão estabelecida");
    }
}
