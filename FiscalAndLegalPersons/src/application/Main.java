package application;

import entities.FiscalPerson;
import entities.LegalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.println("Number of taxpayers: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("== info about taxpayer "+(i+1)+" ==");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual income: ");
            double annualIncome = sc.nextDouble();
            System.out.println("Legal or Fiscal person: ");
            char ch = sc.next().charAt(0);
            if(ch == 'l' || ch == 'L'){
                System.out.println("Number of workers: ");
                int numberWorkers = sc.nextInt();
                list.add(new LegalPerson(name, annualIncome, numberWorkers));
            } else {
                System.out.println("Medical expenses: ");
                double medicalExpenses = sc.nextDouble();
                list.add(new FiscalPerson(name,annualIncome, medicalExpenses));
            }
        }

        for(Person persons : list){
            System.out.println(persons);
        }

        sc.close();
    }
}
