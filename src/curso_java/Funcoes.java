package curso_java;

import java.util.Scanner;

public class Funcoes {
    public int maiorNumeroDeTres() {
        Scanner scanner = new Scanner(System.in);
        int number;
        Integer aux = null;

        for(int i = 0; i < 3; i++) {
            number = scanner.nextInt();
            if(aux == null || number > aux) {
                aux = number;
            }
        }
        return aux;
    }

    public static int maiorNumero(int a,int b,int c) {
        int aux = Integer.max(a,b);
        return Integer.max(aux, c);
    }

    public static void showResult(int valor) {
        System.out.println("O resultado é " + valor);
    }
}
