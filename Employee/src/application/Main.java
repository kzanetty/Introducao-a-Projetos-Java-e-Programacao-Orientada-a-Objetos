package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        System.out.println("Inform the quantity of employees: ");
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            System.out.println("=== Data About employee " + (i+1) + " ===");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: $");
            double valuePerHour = sc.nextDouble();

            System.out.print("You are a outsourced employee: ");
            char chr = sc.next().charAt(0);
            if(chr == 'y' || chr == 'Y'){
                System.out.print("Additional expenses: ");
                double additionalExpenses = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalExpenses));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        for(Employee workers: list){
            System.out.println(workers);
        }



        sc.close();
    }
}
