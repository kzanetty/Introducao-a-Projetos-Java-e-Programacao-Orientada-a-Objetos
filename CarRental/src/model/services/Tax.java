package model.services;

public class Tax {

    public static double calculateTax(double amount){
        if(amount > 100){
            return amount * 0.15;
        } else {
            return amount * 0.2;
        }
    }
}
