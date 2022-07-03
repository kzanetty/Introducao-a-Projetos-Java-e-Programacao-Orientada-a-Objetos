package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainInterfaceFuncionalConsumer {
    public static void main(String[] args) {


        List<ProductEntitiesConsumer> list = new ArrayList<>();

        list.add(new ProductEntitiesConsumer("Tv", 350.0));
        list.add(new ProductEntitiesConsumer("Car", 1250.04));
        list.add(new ProductEntitiesConsumer("Phone", 1000.20));
        list.add(new ProductEntitiesConsumer("Computer", 831.0));

        Consumer<ProductEntitiesConsumer> prod = (p1) -> p1.setPrice(p1.getPrice() * 1.1);

//        list.forEach(ProductEntitiesConsumer::acceptNonStatic);
//        list.forEach(ProductEntitiesConsumer::acceptStatic);
//        list.forEach(x -> x.setPrice(x.getPrice() * 1.1));
//        list.forEach(new ProductConsumer());
//        list.forEach(prod);
        //isso não ira me retornar nada, é um void.
        // eu defini que todos os meus preços serão aumentados em 10%.

        list.forEach(System.out::println);


    }
}
