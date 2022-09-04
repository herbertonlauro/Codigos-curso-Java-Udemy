package curso_java;

import java.util.Scanner;

public class ExerciciosSequencial {
    public void exercicio1() {
        System.out.println("Exercício 1");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("SOMA = %d", a + b);
    }

    public void exercicio2() {
        System.out.println("Exercício 2");

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f", area);
    }

    public void exercicio3() {
        System.out.println("Exercício 3");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.printf("DIFERENCA = %d", (a * b) - (c * d));
    }

    public void exercicio4() {
        System.out.println("Exercicio 4");

        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        double horasTrabalhadas = scanner.nextDouble();
        double valorHoras = scanner.nextDouble();

        double valorSalario = horasTrabalhadas * valorHoras;

        System.out.printf("NUMBER  = %d%n", numeroFuncionario);
        System.out.printf("SALARY  = U$ %.2f%n", valorSalario);
    }

    public void exercicio5() {
        int codigoPeca1;
        int codigoPeca2;
        int numeroPeca1;
        int numeroPeca2;
        double valorPeca1;
        double valorPeca2;

        Scanner scanner = new Scanner(System.in);

        codigoPeca1 = scanner.nextInt();
        numeroPeca1 = scanner.nextInt();
        valorPeca1 = scanner.nextDouble();

        codigoPeca2 = scanner.nextInt();
        numeroPeca2 = scanner.nextInt();
        valorPeca2 = scanner.nextDouble();

        double valorTotal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);
    }

    public void exercicio6() {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f%n", Math.PI * Math.pow(c,2));
        System.out.printf("TRAPEZIO: %.3f%n", ((a + b) / 2) * c);
        System.out.printf("TRIANGULO: %.3f%n", Math.pow(b,2));
        System.out.printf("TRIANGULO: %.3f%n", (a * b));
    }
}
