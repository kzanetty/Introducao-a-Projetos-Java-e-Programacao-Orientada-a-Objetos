package consumer;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<ProductEntitiesConsumer> {

    @Override
    public void accept(ProductEntitiesConsumer prod) {
        prod.setPrice(prod.getPrice() * 1.1);
    }
}
