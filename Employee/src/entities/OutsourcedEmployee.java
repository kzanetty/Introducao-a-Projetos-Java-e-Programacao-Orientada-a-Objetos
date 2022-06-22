package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalExpense;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hoursWorked, Double valuePerHour, Double additionalExpense) {
        super(name, hoursWorked, valuePerHour);
        this.additionalExpense = additionalExpense;
    }

    public Double getAdditionalExpense() {
        return additionalExpense;
    }

    public void setAdditionalExpense(Double additionalExpense) {
        this.additionalExpense = additionalExpense;
    }

    @Override
    public double totalPayment() {
        return super.totalPayment() +(additionalExpense * 1.1);
    }
}
