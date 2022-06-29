package model.entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name +", salary: " + salary;
    }

    @Override
    public int compareTo(Employee func) {
        return name.toLowerCase().compareTo(func.getName().toLowerCase());
        //return salary.compareTo(func.getSalary());
        // se colocarmos o - na frente do salary, vai ser do maior para o menor
    }
}
