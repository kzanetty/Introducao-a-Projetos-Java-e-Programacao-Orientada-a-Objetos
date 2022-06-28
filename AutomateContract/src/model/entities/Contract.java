package model.entities;

import java.util.Date;
import java.util.List;

public class Contract {

    private Integer numberContract;
    private Date startContract;
    private double contractValue;
    private Integer numberInstallment;

    public Contract() {
    }

    public Contract(Integer numberContract, Date startContract, double contractValue, Integer numberInstallment) {
        this.numberContract = numberContract;
        this.startContract = startContract;
        this.contractValue = contractValue;
        this.numberInstallment = numberInstallment;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public Date getStartContract() {
        return startContract;
    }

    public void setStartContract(Date startContract) {
        this.startContract = startContract;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }

    public Integer getNumberInstallment() {
        return numberInstallment;
    }

    public void setNumberInstallment(Integer numberInstallment) {
        this.numberInstallment = numberInstallment;
    }

    public double installmentValue(){
        return contractValue / numberInstallment;
    }

    @Override
    public String toString(){
        return "Number contract: " + numberContract + " - Value contract: $" + contractValue
                + " - Number installments: " + numberInstallment + "\n";
    }
}
