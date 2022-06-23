package entities;

public class FiscalPerson extends Person{

    private Double medicalExpenses;

    public FiscalPerson(){
        super();
    }

    public FiscalPerson(String name, Double annualIncome, Double medicalExpenses) {
        super(name, annualIncome);
        this.medicalExpenses = medicalExpenses;
    }

    public Double getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(Double medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    @Override
    public double taxPaid() {
        if(getAnnualIncome() < 20000){
            return (getAnnualIncome() * 0.15) - (medicalExpenses * 0.5);
        } else {
            return (getAnnualIncome() * 0.25) - (medicalExpenses * 0.5);
        }
    }

    @Override
    public String toString(){
        return super.toString() + " - Tax paid: $" + taxPaid();
    }
}
