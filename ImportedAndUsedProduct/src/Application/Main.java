package Application;

import entities.ImportedProduct;
import entities.UsedProduct;
import entities.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Product p = new Product("Watch", 1499.98);
        Product p1 = new ImportedProduct("Notbook", 7998.98, 620.32);
        Product p2 = new UsedProduct("Car", 40000.0, new Date());

        System.out.println(p.tagPrice());
        System.out.println(p1.tagPrice());
        System.out.println(p2.tagPrice());

    }
}
