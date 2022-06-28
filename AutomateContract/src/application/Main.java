package application;

import model.entities.Contract;
import model.services.GenerateContract;
import model.services.PayPal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Number contract: ");
        int numberContract = sc.nextInt();
        System.out.print("Start contract: ");
        Date startContract = sdf.parse(sc.next());
        System.out.print("Value contract: ");
        double valueContract = sc.nextDouble();
        System.out.print("Number of installments: ");
        int numberInstallments = sc.nextInt();
        Contract contract = new Contract(numberContract, startContract, valueContract, numberInstallments);

        GenerateContract generateContract = new GenerateContract(contract, new PayPal());

        System.out.println(generateContract);




        sc.close();
    }
}
