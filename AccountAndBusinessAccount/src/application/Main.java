package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.println("Basic information.");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        var holder = sc.nextLine();
        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        System.out.println("Basic account, business account or savings account? (A, B or S)");
        char choose =sc.next().charAt(0);

        switch (choose){
            case ('A'):
                System.out.println("You choose a basic account.");
                account = new Account(number, holder, balance);
                break;
            case ('B'):
                System.out.println("You choose a business account.");
                System.out.println("Loan limit: ");
                double loanLimit = sc.nextDouble();
                account = new BusinessAccount(number,holder,balance,loanLimit);
                break;
            case ('S'):
                System.out.println("You choose a Saving Account.");
                System.out.println("Interest rate: ");
                double interestRate = sc.nextDouble();
                System.out.println("Time: ");
                int time = sc.nextInt();
                account = new SavingsAccount(number,holder,balance,interestRate, time);
                break;
            default:
                account = new Account();
                System.out.println("Value invalid. Pending fill!!");
        }

        System.out.println(account);

        sc.close();
    }
}
