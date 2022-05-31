package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Matriz NxN.   N=");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        int[] diagonal = new int[n];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
               matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------------------");

        for(int i=0; i< matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
                if(i == j){
                    diagonal[i] = matriz[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("Main diagonal: ");
        for(int x: diagonal){
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("Main diagonal: ");
        for(int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + "  ");
        }

        sc.close();
    }
}
