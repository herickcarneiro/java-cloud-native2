package sintaxe;

public class Operadores {
    public static void main(String[] args) {
        String primeiroNome = "Herick";
        String segundoNome = new String("Herick");
        System.out.println(primeiroNome == segundoNome);
        System.out.println(primeiroNome.equals(segundoNome));

        int a = 5;
        int b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }

}
