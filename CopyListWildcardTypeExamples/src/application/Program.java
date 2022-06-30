package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1,2,3,4,5);
        List<Double> myDoubles = Arrays.asList(3.4, 5.7, 3.5, 1.2, 9.0);
        List<Object> objList = new ArrayList<>();

        print(myInts, objList);
        printOnScreen(objList);

        print(myDoubles, objList);
        printOnScreen(objList);
    }

    public static void print(List<? extends Number> source, List<? super Number> destiny) {
        for(Number element: source){
            destiny.add(element);
        }
    }

    public static void printOnScreen(List<?> list){
        System.out.print("[ ");
        for(Object element: list){
            System.out.print(element + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
