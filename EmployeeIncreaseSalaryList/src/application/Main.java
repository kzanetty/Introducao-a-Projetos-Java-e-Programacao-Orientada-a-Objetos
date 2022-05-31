package application;

import java.util.*;
import java.util.stream.Collectors;

import entities.Employees;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();
        System.out.print("Number of employees: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(verification(id, list)){
                System.out.print("Id already exist! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employees(id, name, salary));
        }

        for(Employees x: list){
            System.out.println(x);
        }

        System.out.println("Inform the id of the employee that you want increase the salary: ");
        int idIncrease = sc.nextInt();
        if(verification(idIncrease, list)){
            System.out.print("Enter the percentage you want to increase: %");
            double amount = sc.nextDouble();
            Main.select(list, idIncrease, amount);
        } else {
            System.out.println("Id invalid.");
        }

        for(Employees x: list){
            System.out.println(x);
        }



        sc.close();
    }
    public static boolean verification(int id, List<Employees> list){
        boolean result = false;
        for(Employees x : list){
            if(x.getId() == id){
                result = true;
            }
        }
        return result;
    }

    public static void select(List<Employees> list, int idIncrease, double amount){
        for (Employees x: list){
            if(x.getId() == idIncrease){
                x.increaseSalary(amount);
            }
        }
    }
}
