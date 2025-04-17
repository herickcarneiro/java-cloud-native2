package ex01_service;

import ex01_models.Facebook;
import ex01_models.MSN;
import ex01_models.ServiceMensagem;
import ex01_models.Telegram;

public class Celular {
    public static void main(String[] args) {
        ServiceMensagem smi = null;
        String appEscolhida = "msn";
        if (appEscolhida.equals("msn")) {
            smi = new MSN();
        } else if (appEscolhida.equals("tlg")) {
            smi = new Telegram();

        } else if (appEscolhida.equals("fcb")) {
            smi = new Facebook();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
