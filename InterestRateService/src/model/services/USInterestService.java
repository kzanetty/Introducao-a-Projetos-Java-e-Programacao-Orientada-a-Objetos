package model.services;

public class USInterestService implements InterestRateService{

    private Double interestRate;

    public USInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
