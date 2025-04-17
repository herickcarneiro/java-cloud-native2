package desafio02;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(2000);
        analisarCandidato(2100);
        analisarCandidato(1500);
    }

    public static void analisarCandidato(double salario) {
        double salarioBase = 2000;
        if (salario < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salario == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
