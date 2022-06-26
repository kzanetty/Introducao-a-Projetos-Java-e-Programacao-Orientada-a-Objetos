package application;

import model.entities.Client;
import model.entities.RentNote;
import model.enums.CarModel;
import model.services.CalculateRent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Data about client.");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            Client client = new Client(name, email);

            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Value per day: ");
            double valuePerDay = sc.nextDouble();
            System.out.print("Initial time: ");
            sc.nextLine();
            Date dateInit = sdf.parse(sc.nextLine());
            System.out.print("Final moment: ");
            Date dateFinal = sdf.parse(sc.nextLine());
            CalculateRent calcRent = new CalculateRent(valuePerHour, valuePerDay, dateInit, dateFinal);

            System.out.println("Choose your model of car: (HB20, FiatArgo, ChevroletOnix, VolkswagenGol, FiatMobi, ChevroletOnixPlus, RenaultKwid): ");
            String modelCar = sc.next();
            RentNote rentNote = new RentNote(client, CarModel.valueOf(modelCar), calcRent);

            System.out.println(rentNote);

        } catch (ParseException e){
            System.out.println("Error with date. " + e.getMessage());
        }


        sc.close();
    }
}
