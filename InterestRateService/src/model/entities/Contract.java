package model.entities;

import model.services.InterestRateService;

public class Contract {

    private InterestRateService interestRateService;

    public Contract(InterestRateService interestRateService) {
        this.interestRateService = interestRateService;
    }

    public InterestRateService getInterestRateService() {
        return interestRateService;
    }

    public void setInterestRateService(InterestRateService interestRateService) {
        this.interestRateService = interestRateService;
    }

    public void generateContract(double amount, int month){
        System.out.println();
        System.out.println("Months: " + month);
        System.out.println("Interest rate: " + getInterestRateService().getInterestRate());
        System.out.println("Loan amount: " + amount);
        System.out.println("Total payment: " + String.format("%.2f",interestRateService.payment(amount, month)));
    }

}
