package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo = 100000.43;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        nomeDoCliente = scanner.nextLine();

        System.out.println("Agora digite o número da sua conta e, em seguida, o número da sua agência:");
        numeroDaConta = scanner.nextInt();
        agencia = scanner.next();

        System.out.println("Olá, " + nomeDoCliente +
                            ", obrigado por criar uma conta em nosso banco, " +
                            " sua agência é: " + agencia + ", conta: " + numeroDaConta +
                            " e seu saldo (R$" + saldo + ") já está disponível para saque");

    }
}
