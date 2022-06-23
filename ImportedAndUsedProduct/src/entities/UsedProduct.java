package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date date;

    public UsedProduct(String name, Double price, Date date) {
        super(name, price);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String tagPrice() {
        return "Name: " + getName() + " - Price: $" + getPrice() + " - Manufacturing date: " + sdf.format(date);
    }
}
