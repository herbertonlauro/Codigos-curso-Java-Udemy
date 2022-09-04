package curso_java;

import java.util.Scanner;

public class ExerciciosRepeticao {
    public void exercicio7() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int count = 1; count <= number; count++) {
            System.out.printf("%d %.0f %.0f %n", count, Math.pow(count, 2), Math.pow(count, 3));
        }
    }
}
