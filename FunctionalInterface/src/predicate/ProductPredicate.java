package predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<ProductEntitiePredicate> {
    @Override
    public boolean test(ProductEntitiePredicate product) {
        return product.getPrice() > 1000.0;
    }
}
