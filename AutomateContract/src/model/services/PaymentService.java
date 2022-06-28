package model.services;

public interface PaymentService {

    public double monthlyInterest(double amount, int i);

    public double paymentRate(double amount, int i);
}
