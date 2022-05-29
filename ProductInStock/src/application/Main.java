package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;

        System.out.println("Product information.");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        product = new Product(name, price, quantity);

        System.out.println("--------------------------");
        System.out.println(product);
        System.out.println("--------------------------");

        System.out.println("Do you want to make an addiction to stock, a withdraw from stock or do you want to do nothing?");
        System.out.println("Options: Addiction, Withdraw or Nothing");
        char choose = sc.next().charAt(0);
        switch (choose){
            case ('A'):
                System.out.print("Inform the quantity to be add in stock: ");
                int amount = sc.nextInt();
                product.additionToStock(amount);
                System.out.println("** Updated addiction in stock **");
                System.out.println(product);
                break;
            case ('W'):
                System.out.print("Inform the quantity to be withdraw from stock: ");
                amount = sc.nextInt();
                product.withdrawOfStock(amount);
                System.out.println("** Updated withdraw from stock **");
                System.out.println(product);
                break;
            case ('N'):
                System.out.println("See you later.");
                break;
            default:
                System.out.println("Information invalid.");
                break;
        }
        sc.close();
    }
}
