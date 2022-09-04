package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class MaiorTriangulo {
    public void calcularMaiorTriangulo() {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        double xA = scanner.nextDouble();
        double xB = scanner.nextDouble();
        double xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        double yA = scanner.nextDouble();
        double yB = scanner.nextDouble();
        double yC = scanner.nextDouble();

        double x = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(x * (x - xA) * (x - xB) * (x - xC));

        double y = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(y * (y - yA) * (y - yB) * (y - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Larger area: X");
        }
        if (areaX < areaY) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("The areas are equal");
        }

        scanner.close();
    }
}
