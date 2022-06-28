package model.services;

public class PayPal implements  PaymentService{

    @Override
    public double monthlyInterest(double amount, int i) {
        return (amount * 0.01) * i;
    }

    @Override
    public double paymentRate(double amount, int i) {
        return (amount + monthlyInterest(amount, i)) * 0.02;
    }
}
