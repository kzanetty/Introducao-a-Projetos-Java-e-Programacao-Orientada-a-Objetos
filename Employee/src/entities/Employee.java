package entities;

public class Employee {

    private String name;
    private Integer hoursWorked;
    private Double valuePerHour;

    public Employee(){
    }

    public Employee(String name, Integer hoursWorked, Double valuePerHour){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.valuePerHour = valuePerHour;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalPayment(){
        return hoursWorked * valuePerHour;
    }

    @Override
    public String toString(){
        return "Name: " + name + " - Total payment: $" + String.format("%.2f",totalPayment());
    }
}
