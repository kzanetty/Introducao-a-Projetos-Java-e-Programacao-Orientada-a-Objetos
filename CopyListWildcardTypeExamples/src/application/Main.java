package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //principio get/put - covariância

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(6);

        List<? extends Number> list = intList; //aceita qualquer tipo de lista que seja uma subclasse de Number.


        Number x = list.get(1); // MAS PODEMOS ACESSAR(GET) OS ELEMENTOS.
//      list.add(7); NÃO PODEMOS ADICIONAR ELEMENTOS.

        System.out.println("Number in index 1 of the list: " +  x);
        System.out.println(" list list: " + list);

        System.out.println("-------------------------------");

        //principio get/put - Contravariancia

        List<Object> objList = new ArrayList<>();
        objList.add("Maria");
        objList.add("Bob");

        List<? super Number> myNums =objList;

        myNums.add(3);
        myNums.add(4.0);
        myNums.add(3.2f); // PODEMOS ADICIONAR ELEMENTOS(NUMBER) TRANQUILAMENTE

//        Number y = myNums.get(1); // NÃO PODEMOS ACESSAR(GET) OS ELEMENTOS.

        System.out.println("list myNums: " + myNums);


    }
}
