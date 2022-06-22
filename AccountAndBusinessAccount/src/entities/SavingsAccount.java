package entities;

public final class SavingsAccount extends Account{

    private Double interestRate;
    private Integer time;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate, Integer time) {
        super(number, holder, balance);
        this.interestRate = interestRate;
        this.time = time;
        updatedBalance(time);
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updatedBalance(int time){
        double p = 1 + interestRate/100;
        balance = balance * (Math.pow(p, time));
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
