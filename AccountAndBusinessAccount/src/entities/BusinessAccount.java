package entities;

public class BusinessAccount extends Account{

    private Double loanLimite;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount){
        if(amount <= loanLimite){
            deposit(amount);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Number: " + getNumber() + "\n");
        sb.append("Holder: " + getHolder() + "\n");
        sb.append("Balance: " + getBalance() + "\n");
        sb.append("loan limit: " + loanLimite);
        return sb.toString();
    }

}
