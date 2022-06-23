package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public void updatedPrice(){
        setPrice(getPrice()+customsFee);
    }

    @Override
    public String tagPrice() {
        updatedPrice();
        return "Name: " + getName() + " - Total price: $" + getPrice() + " - Custom fee: $" + String.format("%.2f",customsFee);
    }
}
