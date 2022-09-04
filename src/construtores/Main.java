package construtores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product("Mesa", 1873);

        product.addProducts(10);

        System.out.println(product.toString());

        scanner.close();
    }
}
