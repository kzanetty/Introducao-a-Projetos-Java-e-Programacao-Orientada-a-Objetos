package entities;

public final class BusinessAccount extends Account{

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
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 3;
    }

    @Override
    public String toString(){
        return super.toString() + " - loan limit: " + loanLimite;
    }
}
