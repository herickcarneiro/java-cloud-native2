package desafio02;

import java.util.Random;

public class Ligações {
    public static void main(String[] args) {
        String[] candidatos = { "Herick", "João", "Ana", "Luiz" };
        for (String candidato : candidatos) {
            int tentativa = 0;
            boolean atendeu = false;
            do {
                atendeu = atender();
                tentativa++;
            } while (!atendeu && tentativa < 3);
            if (atendeu) {
                System.out.println(candidato + " atendeu em " + tentativa + " tentativas");
            } else {
                System.out.println(candidato + " não atendeu. Numéro máximo de " + tentativa + " tentativas");
            }

        }
    }

    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
