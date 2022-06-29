package application;

import model.entities.Contract;
import model.services.BrazilInterestService;
import model.services.InterestRateService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("interest rate: ");
        double interestRate = sc.nextDouble();

        Contract contract = new Contract(new BrazilInterestService(interestRate));

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        contract.generateContract(amount, months);

        sc.close();
    }
}
