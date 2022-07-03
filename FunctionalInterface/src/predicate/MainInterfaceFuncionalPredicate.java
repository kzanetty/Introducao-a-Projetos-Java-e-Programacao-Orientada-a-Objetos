package predicate;

import java.util.ArrayList;
import java.util.List;

public class MainInterfaceFuncionalPredicate {
    public static void main(String[] args) {

        List<ProductEntitiePredicate> list = new ArrayList<>();

        list.add(new ProductEntitiePredicate("Tv", 350.0));
        list.add(new ProductEntitiePredicate("Car", 1250.04));
        list.add(new ProductEntitiePredicate("Phone", 1000.20));
        list.add(new ProductEntitiePredicate("Computer", 831.0));


        list.removeIf(x -> ProductEntitiePredicate.test(x));
//        list.removeIf(ProductEntitiePredicate::test);
//        list.removeIf(new ProductPredicate());
//        list.removeIf(x -> x.getPrice() < 1000.0);
        //O Predicate me retorna um boolean.

        for(ProductEntitiePredicate itens: list){
            System.out.println(itens);
        }
    }
}
