package application;

import entities.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService();

        System.out.print("Number of elements: ");
        int x = sc.nextInt();

        System.out.println("Type here: ");
        for(int i=0; i < x; i++) {
            ps.addValue(sc.nextInt());
        }

        System.out.println("First element: " + ps.findFirst());

        System.out.println("elements: ");
        ps.print();

        sc.close();
    }
}
