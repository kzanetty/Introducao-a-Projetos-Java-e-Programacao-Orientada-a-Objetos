package predicate;

public class ProductEntitiePredicate {

    private String name;
    private Double price;

    public ProductEntitiePredicate(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean test(ProductEntitiePredicate product){
        return product.getPrice() < 1000.0;
    }

    @Override
    public String toString(){
        return "Name: " + name + " - Price: $" + price;
    }
}
