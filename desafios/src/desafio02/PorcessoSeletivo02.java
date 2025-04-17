package desafio02;

import java.util.concurrent.ThreadLocalRandom;

public class PorcessoSeletivo02 {
    public static void main(String[] args) {
        selecionaCandidatos();
    }

    public void imprimirSelecionados() {

    }

    public static void selecionaCandidatos() {
        String[] candidatos = { "Herick", "João", "Athur", "Maria", "Gabriela", "Ana", "Luiza" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salario();
            System.out.println("Candidato " + candidato + " pretende ganhar " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double salario() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
