package curso_java;

import java.util.Scanner;

public class ExerciciosCondicional {
    public void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String resultado = (number < 0) ? "NEGATIVO" : "NAO NEGATIVO";
        System.out.println(resultado);
    }

    public void exercicio2() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String resultado = (number % 2 == 0) ? "PAR" : "IMPAR";

        System.out.println(resultado);
    }

    public void exercicio3() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String resultado = (a % b == 0 || b % a == 0) ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(resultado);
    }

    public void exercicio4() {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int resultado;

        if (horaInicial >= horaFinal) {
            resultado = 24 - horaInicial + horaFinal;
        } else {
            resultado = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %s HORA(S)%n", resultado);
    }

    public void exercicio5() {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        if (codigo == 1) System.out.printf("Total: R$ %.2f", quantidade * 4.0);
        if (codigo == 2) System.out.printf("Total: R$ %.2f", quantidade * 4.5);
        if (codigo == 3) System.out.printf("Total: R$ %.2f", quantidade * 5.0);
        if (codigo == 4) System.out.printf("Total: R$ %.2f", quantidade * 2.0);
        if (codigo == 5) System.out.printf("Total: R$ %.2f", quantidade * 1.5);
    }

    public void exercicio6() {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        String resultado;

        if (valor >= 0 && valor <= 25) {
            resultado = "Intervalo [0,25]";
        } else if (valor > 25 && valor <= 50) {
            resultado = "Intervalo (25,50]";
        } else if (valor > 50 && valor <= 75) {
            resultado = "Intervalo (50,75]";
        } else if (valor > 75 && valor <= 100) {
            resultado = "Intervalo (75,100]";
        } else {
            resultado = "Fora de intervalo";
        }

        System.out.println(resultado);
    }

    public void exercicio7() {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(x == 0 && y == 0) {
            System.out.println("Origem");
        }else if(x > 0 && y > 0) {
            System.out.println("Q1");
        } else if(x > 0 && y < 0) {
            System.out.println("Q4");
        } else if(y > 0 && x < 0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q3");
        }
    }

    public void exercicio8() {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto = 0;

        if(salario > 4500) {
            imposto += (salario - 4500)  * 0.28;
            salario -= (salario - 4500);
        }
        if(salario > 3000) {
            imposto += (salario - 3000) * 0.18;
            salario -= (salario - 3000);

        }
        if(salario > 2000) {
            imposto += (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f", imposto);
            salario -= (salario - 2000);
        } else {
            System.out.println("ISENTO");
        }

    }
}
