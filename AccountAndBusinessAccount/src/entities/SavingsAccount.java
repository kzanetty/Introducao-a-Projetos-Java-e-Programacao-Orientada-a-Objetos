package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate, Integer time) {
        super(number, holder, balance);
        this.interestRate = interestRate;
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
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Number: " + getNumber() + "\n");
        sb.append("Holder: " + getHolder() + "\n");
        sb.append("Balance: " + getBalance() + "\n");
        sb.append("Interest rate: " + interestRate);
        return sb.toString();
    }
}
