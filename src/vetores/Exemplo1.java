package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        double[] array = new double[arraySize];

        for(int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum =  0;

        for(int i = 0; i < arraySize; i++) {
            sum += array[i];
        }

        double average = sum / arraySize;

        System.out.printf("Average height: %.2f\n", average);



        scanner.close();
    }
}
