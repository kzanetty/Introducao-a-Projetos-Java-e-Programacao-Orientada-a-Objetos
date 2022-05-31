package application;

import util.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Array NxN.  N=");
        int sizeArray = sc.nextInt();
        int[][] array = new int[sizeArray][sizeArray];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Position (" + (i) + ", " + (j) + ") :");
                array[i][j] = sc.nextInt();
            }
        }
        Methods.dashBetween();

        List<Integer> listAvailableNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
                listAvailableNumbers.add(array[i][j]);
            }
            System.out.println();
        }
        Methods.dashBetween();

        System.out.println("Chose one of those numbers: ");
        for (int x : listAvailableNumbers) {
            System.out.print(x + "   ");
        }
        Methods.spacingInfomartion();
        System.out.print(" Selected: ");
        int numberSelect = sc.nextInt();
        Methods.dashBetween();

        if (Methods.validate(numberSelect, listAvailableNumbers)) {
            List<String> finalList = Methods.sides(numberSelect, array, sizeArray);
            for (String text : finalList) {
                System.out.println(text);
            }
        } else {
            System.out.println("Number invalid.");
        }
        sc.close();
    }
}

