package entities;

public class OrderItens {

    private String name;
    private int quantity;
    private double price;

    private Product product;

    public OrderItens(Product product){
        this.name = product.getName();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double valueTotalOrderItens(){
        return price* quantity;
    }
}
