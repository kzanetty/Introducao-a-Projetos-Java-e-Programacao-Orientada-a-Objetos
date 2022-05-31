package application;

import entities.Reservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Reservation[] reserv = new Reservation[10];

        System.out.print("Number students: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room(0 - 9): ");
            int room = sc.nextInt();
            reserv[room] = new Reservation(name, email, room);
        }

        for(Reservation x: reserv){
            if(x != null) {
                System.out.println(x);
            }
        }



        sc.close();
    }
}
