package application;

import entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.println("Checkin: ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Checkout: ");
        Date checkout = sdf.parse(sc.next());

        Reservation res = null;
        if (check(checkin, checkout)) {
            res = new Reservation(roomNumber, checkin, checkout);
            System.out.println(res);
        } else {
            System.out.println("Dates invalid.");
            while (res == null) {
                System.out.println("== try again ==");
                System.out.println("Checkin: ");
                checkin = sdf.parse(sc.next());
                System.out.println("Checkout: ");
                checkout = sdf.parse(sc.next());
                if (check(checkin, checkout)) {
                    res = new Reservation(roomNumber, checkin, checkout);
                    System.out.println(res);
                }
            }
        }

        System.out.println("-----------------------------");
        System.out.println("=== Update reservation ===");
        System.out.println("New checkin: ");
        checkin = sdf.parse(sc.next());
        System.out.println("new checkout: ");
        checkout = sdf.parse(sc.next());
        if (check(checkin, checkout)) {
            res.setCheckin(checkin);
            res.setCheckout(checkout);
            System.out.println(res);
        } else {
            System.out.println("Update reservation fail.");
        }

        sc.close();
    }


    public static boolean check(Date checkin, Date checkout) {
        if (checkin.before(new Date()) || checkout.before(checkin)) {
            return false;
        } else {
            return true;
        }
    }

}
