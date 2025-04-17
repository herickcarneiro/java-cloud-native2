package sintaxe;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Herick";
        String segundoNome = "Carneiro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.err.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
