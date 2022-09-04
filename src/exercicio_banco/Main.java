package exercicio_banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando conta no banco BAN");
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o numero da conta: ");
        String numeroDaConta = scanner.nextLine();
        System.out.print("Caso deseje realizar um depósito inicial digite o valor, caso contrário digite 0: ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(numeroDaConta, titular, depositoInicial);

        contaBancaria.dadosDaConta();

        contaBancaria.sacar(200);

        contaBancaria.dadosDaConta();

        contaBancaria.depositar(300);

        contaBancaria.dadosDaConta();

        scanner.close();
    }
}
