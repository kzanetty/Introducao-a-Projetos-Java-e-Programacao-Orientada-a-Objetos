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

        Account acc1, acc2, acc3;

        int number, time;
        String holder;
        double balance, loanLimit, InterestRate;

        System.out.println("Basic account.");
        System.out.print("Number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        holder = sc.nextLine();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
        acc1 = new Account(number,holder,balance);
        System.out.println(acc1);


        System.out.println("Business account.");
        System.out.print("Number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        holder = sc.nextLine();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
        System.out.print("Loan limit: ");
        loanLimit = sc.nextDouble();
        acc2 = new BusinessAccount(number, holder, balance, loanLimit);
        System.out.println(acc2);


        System.out.println("Savings account.");
        System.out.print("Number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        holder = sc.nextLine();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
        System.out.print("Interest rate: ");
        InterestRate = sc.nextDouble();
        System.out.print("Time: ");
        time = sc.nextInt();
        acc3 = new SavingsAccount(number, holder, balance, InterestRate, time);

        System.out.println(acc3);
        sc.close();
    }
}
