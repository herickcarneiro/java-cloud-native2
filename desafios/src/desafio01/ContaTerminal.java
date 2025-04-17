import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o nome da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu número!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo!");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
