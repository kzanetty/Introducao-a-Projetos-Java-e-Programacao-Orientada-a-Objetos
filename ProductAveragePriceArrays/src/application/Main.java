package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] product = new Product[n];

        for(int i=0; i<product.length; i++){
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            product[i] = new Product(name, price, quantity);
        }

        double average = Product.average(product);
        System.out.println(average);

        for(Product x: product){
            System.out.println(x);
        }

        sc.close();
    }
}
