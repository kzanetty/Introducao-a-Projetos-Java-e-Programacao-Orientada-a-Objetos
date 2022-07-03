package aMyFunction;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ServiceFilteredSum {

    public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
        List<Product> newList = list.stream().filter(criteria).collect(Collectors.toList());

        double sum = 0;
        for(Product prod: newList) {
            sum += prod.getPrice();
        }

        return sum;
    }
}
