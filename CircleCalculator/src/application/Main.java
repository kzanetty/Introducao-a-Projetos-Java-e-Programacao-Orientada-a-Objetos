package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Inform the radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.Circumference(radius);
        double v = Calculator.Volume(radius);

        System.out.println("Circumference: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("PI: " + Calculator.PI);



        sc.close();
    }
}
