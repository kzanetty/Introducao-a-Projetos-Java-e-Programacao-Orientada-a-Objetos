package function;

import java.util.function.Function;

public class ProductFunction implements Function<ProductEntitieFunction, ProductEntitieFunction> {

    @Override
    public ProductEntitieFunction apply(ProductEntitieFunction prod) {
        return new ProductEntitieFunction(prod.getName().toUpperCase(), prod.getPrice());
    }

}
