package aMyFunction;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 350.0));
        list.add(new Product("Car", 1250.04));
        list.add(new Product("Phone", 1000.20));
        list.add(new Product("Computer", 831.0));

        ServiceFilteredSum ps = new ServiceFilteredSum();

        double sum = ps.filteredSum(list, x ->x.getName().charAt(0) == 'C');

        for(Product prod: list){
            if(prod.getName().charAt(0) == 'C')
            System.out.println(prod);
        }
        System.out.println("Sum: $" + sum);
    }
}
