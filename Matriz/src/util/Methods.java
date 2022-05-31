package util;

import java.util.ArrayList;
import java.util.List;

public class Methods {

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

    public static void spacingInfomartion(){
        System.out.print("\n");
    }

    public static void dashBetween(){
        System.out.println("----------------------------------------------------------");
    }

}
