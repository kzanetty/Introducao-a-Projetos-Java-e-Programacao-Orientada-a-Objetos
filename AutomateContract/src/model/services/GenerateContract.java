package model.services;

import model.entities.Contract;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GenerateContract {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Contract contract;
    private PaymentService paymentService;

    public GenerateContract() {
    }

    public GenerateContract(Contract contract, PaymentService paymentService) {
        this.contract = contract;
        this.paymentService = paymentService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public List<Double> totalInstallmentvalue() {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < contract.getNumberInstallment(); i++) {
            double valueInstallmentAndSimpleInterest = contract.installmentValue() + paymentService.monthlyInterest(contract.installmentValue(), (i + 1));
            list.add(valueInstallmentAndSimpleInterest + paymentService.paymentRate(valueInstallmentAndSimpleInterest, (i + 1)));
        }
        return list;
    }

    public List<Date> dates() {
        List<Date> list = new ArrayList<>();

        Calendar cal = Calendar.getInstance();
        cal.setTime(getContract().getStartContract());

        for (int i = 0; i < contract.getNumberInstallment(); i++) {
            cal.add(Calendar.MONTH, 1);
            list.add(cal.getTime());
        }
        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n");
        sb.append(contract);
        sb.append("installments: \n");
        for (int i = 0; i < contract.getNumberInstallment(); i++) {
            sb.append(" Installment " + (i + 1) + " - Due date: " + sdf.format(dates().get(i))
                    + " - Value: $" + String.format("%.2f", totalInstallmentvalue().get(i)) + "\n");
        }

        return sb.toString();
    }
}
