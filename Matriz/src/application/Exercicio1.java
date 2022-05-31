package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Array NxN.  N=");
        int sizeArray = sc.nextInt();

        int[][] array = new int[sizeArray][sizeArray];

        for(int i=0; i<array.length; i++){
            for(int j=0; j < array[i].length; j++){
                System.out.print("Position (" + (i)+", "+(j) + ") :");
                array[i][j] = sc.nextInt();
            }
        }

        List<Integer> listAvailableNumbers = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j < array[i].length; j++){
                System.out.print(array[i][j] + "  ");
                listAvailableNumbers.add(array[i][j]);
            }
        }

        System.out.println();
        System.out.println("------------");
        System.out.println("Choose one of these numbers: ");
        for(int x: listAvailableNumbers){
            System.out.print(x + " - ");
        }
        System.out.println();
        int numberSelect = sc.nextInt();
        System.out.println("--- try one ---");
        if(validate(numberSelect, listAvailableNumbers)){
            for(int i=0; i<array.length; i++){
                System.out.println();
                for(int j=0; j < array[i].length; j++){
                    if(array[i][j] == numberSelect){
                        if(i > 0){
                            System.out.println("Above: "+ array[i-1][j]);
                        }
                        if(j > 0){
                            System.out.println("Before: "+ array[i][j-1]);
                        }
                        if(i < (sizeArray-1)){
                            System.out.println("Below: "+ array[i+1][j]);
                        }
                        if(j < (sizeArray-1)){
                            System.out.println("After: "+array[i][j+1]);
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Number invalid.");
        }


        System.out.println("--- Try two ---");
        List<String> finalList = sides(numberSelect, array,sizeArray);
        for (String text: finalList){
            System.out.println(text);
        }

        sc.close();
    }
    public static boolean validate(int numberSelect, List<Integer> listAvailableNumbers){
        for(int x: listAvailableNumbers){
            if(x == numberSelect){
                return true;
            }
        }
        return false;
    }

    public static List sides(int numberSelect, int[][] array, int sizeArray){
        List<String> sides = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j < array[i].length; j++){
                if(array[i][j] == numberSelect){
                    if(i > 0){
                        sides.add("Above: "+ array[i-1][j]);
                    }
                    if(j > 0){
                        sides.add("Before: "+ array[i][j-1]);
                    }
                    if(i < (sizeArray-1)){
                        sides.add("Below: "+ array[i+1][j]);
                    }
                    if(j < (sizeArray-1)){
                        sides.add("After: "+array[i][j+1]);
                    }
                }
            }
        }
        return sides;
    }
}

