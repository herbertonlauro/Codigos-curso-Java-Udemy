package metodos_estaticos;

import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");

        double radius = scanner.nextDouble();

        double circunference = Calculator.circunference(radius);

        double volume = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", circunference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }


}
