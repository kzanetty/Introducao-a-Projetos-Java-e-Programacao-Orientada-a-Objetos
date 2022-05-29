package application;

import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        System.out.println("Enter with information about triangles.");

        System.out.println("Triangle X measurements:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        x = new Triangle(a, b, c);
        System.out.println("Triangle Y measurements:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        y = new Triangle(a, b, c);

        System.out.println("--------------");
        System.out.println("Area triangle x: " + String.format("%.3f", x.calculateArea()));
        System.out.println("Area triangle y: " + String.format("%.3f", y.calculateArea()));
        System.out.println("--------------");

        if( x.calculateArea() > y.calculateArea()){
            System.out.println("The triangle with the largest area is X. " + String.format("%.3f", x.calculateArea()));
        } else {
            System.out.println("The triangle with the largest area is Y. " + String.format("%.3f", y.calculateArea()));
        }

        sc.close();
    }

}
