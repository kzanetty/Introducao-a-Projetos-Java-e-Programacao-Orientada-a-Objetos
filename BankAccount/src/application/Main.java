package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Number account: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Deposit? ");
        char choose = sc.next().charAt(0);
        if(choose == 'y' || choose == 'Y'){
            System.out.println("amount to be deposited: ");
            double amount = sc.nextDouble();
            account = new Account(number, name, amount);
        } else{
            account = new Account(number, name);
        }
        System.out.println(account);

        System.out.println("inform the quantity to be deposited: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated: " + account);

        System.out.println("Inform the quantity to be withdraw: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated: " + account);



        sc.close();
    }
}
