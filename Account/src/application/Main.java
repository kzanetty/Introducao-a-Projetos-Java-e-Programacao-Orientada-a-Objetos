package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.println(acc);

            System.out.println("=== Deposit ===");
            System.out.println("Value for deposit: ");
            double deposit = sc.nextDouble();
            acc.deposit(deposit);
            System.out.println(acc);

            System.out.println("=== Withdraw ===");
            System.out.println("Value for withdraw: ");
            double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.println(acc);
        } catch (DomainException e) {
            System.out.println("Error when performing the withdraw: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data try. Please, enter data compatible with the field.");
        }
        sc.close();
    }
}
