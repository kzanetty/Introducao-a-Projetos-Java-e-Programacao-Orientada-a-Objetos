package application;

import entities.Client;
import entities.Enum.OrderStatus;
import entities.Order;
import entities.OrderItens;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Data about client.");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birthday: ");
        Date birthday = sdf.parse(sc.next());
        Client client = new Client(name, email, birthday);

        Order order = new Order(new Date(), OrderStatus.valueOf("Processing"), client);

        jumpLine();
        System.out.println("Data about products.");
        System.out.print("Number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println("Product #"+(i+1));
            System.out.print("Name product: ");
            String nameProduct = sc.nextLine();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            System.out.print("Price: $");
            double priceProduct = sc.nextDouble();
            sc.nextLine();
            Product product = new Product(nameProduct, quantityProduct, priceProduct);
            OrderItens oi = new OrderItens(product);
            order.addOrderItens(oi);
        }

        jumpLine();
        System.out.println(order);

        sc.close();
    }

    public static void jumpLine(){
        System.out.print("\n");
    }
}
