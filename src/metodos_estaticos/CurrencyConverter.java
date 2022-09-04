package metodos_estaticos;

import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar em reais (R$): ");

        double dolarCotation = scanner.nextDouble();

        System.out.print("Digite quantos dólares deseja comprar: ");
        double dolarAmount = scanner.nextDouble();

        double totalTransaction = Calculator.dolarToReal(dolarCotation, dolarAmount);

        System.out.printf("Total: %.2f%n", totalTransaction);

        scanner.close();
    }
}
