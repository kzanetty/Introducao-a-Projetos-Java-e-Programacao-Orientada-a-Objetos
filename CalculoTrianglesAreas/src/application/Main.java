package application;

import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter with information about triangles.");

        System.out.println("Triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        double areaX = x.calculateArea();
        System.out.println("Area x: " + String.format("%.2f", areaX));

        System.out.println("Triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaY = y.calculateArea();
        System.out.println("Area x: " + String.format("%.2f", areaY));

        if( areaX > areaY){
            System.out.printf("The triangle with the largest area is X. Area: %.2f%n", areaX);
        } else {
            System.out.printf("The triangle with the largest area is Y. Area: %.2f", areaY);
        }



        sc.close();
    }

}
