package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        deposit(balance);
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }


    public void withdraw(double amount) throws DomainException {
        if(amount > withdrawLimit){
            throw new DomainException("Exceeded withdraw limit.");
        }
        if(amount > balance) {
            throw new DomainException("Exceeded balance");
        }
        this.balance -= amount;
    }

    @Override
    public String toString(){
        return "Number: " + number + " - Holder: " + holder
                + " - Balance: " + balance + " - Withdraw limit: " + withdrawLimit;
    }
}
