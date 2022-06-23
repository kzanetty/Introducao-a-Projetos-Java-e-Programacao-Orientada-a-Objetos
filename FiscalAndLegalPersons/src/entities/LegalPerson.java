package entities;

public class LegalPerson extends Person{

    private Integer numberWorkers;

    public LegalPerson(){
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberWorkers) {
        super(name, annualIncome);
        this.numberWorkers = numberWorkers;
    }

    public Integer getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(Integer numberWorkers) {
        this.numberWorkers = numberWorkers;
    }

    @Override
    public double taxPaid() {
        if(numberWorkers > 10){
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " - Tax paid: $" + taxPaid();
    }
}
