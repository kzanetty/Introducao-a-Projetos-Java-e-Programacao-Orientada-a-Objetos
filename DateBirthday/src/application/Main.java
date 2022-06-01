package application;

import util.Calculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("birthday: ");
        Date dateBirthday = sdf.parse(sc.nextLine());


        System.out.println("Age: " + Calculate.age(dateBirthday));
        System.out.println("Months alive: " + Calculate.monthsAlive(dateBirthday));
        System.out.println("Days alive: " + Calculate.daysAlive(dateBirthday));
        System.out.println("Hours alive: " + Calculate.hoursAlive(dateBirthday));


        System.out.println("Comparative date : ");
        Date comparativeDate = sdf.parse(sc.nextLine());
        System.out.println("New age: " + Calculate.comparativeTimeAge(comparativeDate, dateBirthday));
        sc.close();
    }
}
