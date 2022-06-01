package entities;

import entities.Enum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;

    List<HourContract> list = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> getList() {
        return list;
    }

    public void addContract(HourContract contract) {
        list.add(contract);
    }

    public void removeContract(HourContract contract) {
        list.remove(contract);
    }

    public double income(String dateSplit) {
        String[] split = dateSplit.split(" ");
        int day = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int year = Integer.parseInt(split[2]);

        double totalIncome = baseSalary;
        for (HourContract x : getList()) {
            String p = dayAndMonthAndYear(x.getDate());
            String[] m = p.split(" ");
            int dayScop = Integer.parseInt(m[0]);
            int monthScop = Integer.parseInt(m[1]);
            int yearScop = Integer.parseInt(m[2]);

            if (monthScop == month && yearScop == year) {
                totalIncome += x.totalValue();
            }
        }
        return totalIncome;
    }

    public static String dayAndMonthAndYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);

        return day + " " + month + " " + year;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Level: " + level + ", BaseSalary: " + baseSalary
                + ", Department: " + department;
    }
}
