package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        Product[] products = new Product[arraySize];

        for(int i = 0; i < products.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();

            Product product = new Product(name, price);

            products[i] = product;
        }

        double average = 0;

        for(int i = 0; i < products.length; i++) {
            average += products[i].getPrice() / products.length;
        }

        System.out.printf("Average price: %.2f\n", average);

        scanner.close();
    }

}


