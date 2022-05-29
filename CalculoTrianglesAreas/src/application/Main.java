package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with information about triangles.");
        System.out.println("Triangle alfa:");
        double sideAlfaA = sc.nextDouble();
        double sideAlfaB = sc.nextDouble();
        double sideAlfaC = sc.nextDouble();
        double areaAlfa = calculateArea(sideAlfaA, sideAlfaB, sideAlfaC);
        System.out.println("area alfa: " + String.format("%.2f", areaAlfa));

        System.out.println("Triangle beta:");
        double sideBetaA = sc.nextDouble();
        double sideBetaB = sc.nextDouble();
        double sideBetaC = sc.nextDouble();
        double areaBeta = calculateArea(sideBetaA, sideBetaB, sideBetaC);
        System.out.println("Area beta: " + String.format("%.2f", areaBeta));

        if( areaAlfa > areaBeta){
            System.out.printf("The triangle with the largest area is alfa. Area: %.2f%n", areaAlfa);
        } else {
            System.out.printf("The triangle with the largest area is beta. Area: %.2f", areaBeta);
        }


        sc.close();
    }

    public static double calculateArea(double a, double b, double c){
        double p, area;
        p = (a + b + c) / 2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
