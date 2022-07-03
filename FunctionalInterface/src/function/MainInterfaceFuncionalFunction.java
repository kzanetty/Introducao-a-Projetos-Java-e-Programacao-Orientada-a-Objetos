package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainInterfaceFuncionalFunction {
    public static void main(String[] args) {

        List<ProductEntitieFunction> list = new ArrayList<>();

        list.add(new ProductEntitieFunction("Tv", 350.0));
        list.add(new ProductEntitieFunction("Car", 1250.04));
        list.add(new ProductEntitieFunction("Phone", 1000.20));
        list.add(new ProductEntitieFunction("Computer", 831.0));


        Function<ProductEntitieFunction, ProductEntitieFunction> forNewProduct = (p) -> new ProductEntitieFunction(p.getName().toUpperCase(), p.getPrice() * 3);

//        List<ProductEntitieFunction> newList = list.stream().map(x -> new ProductEntitieFunction(x.getName().replace("T", "Z").replace('a', '7'), x.getPrice())).collect(Collectors.toList());
//        List<ProductEntitieFunction> newList = list.stream().map(new ProductFunction()).collect(Collectors.toList());
//        List<ProductEntitieFunction> newList = list.stream().map(ProductEntitieFunction::listForUpperCase).collect(Collectors.toList());
        List<ProductEntitieFunction> newList = list.stream().map(forNewProduct).collect(Collectors.toList());

        for (ProductEntitieFunction itens : list) {
            System.out.println(itens);
        }
        newList.forEach(System.out::println);
    }
}
