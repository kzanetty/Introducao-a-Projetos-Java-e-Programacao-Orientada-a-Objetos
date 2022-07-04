package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyResolution {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ProductsPipeline.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                list.add(new Product(name, price));
                line =br.readLine();
            }

            System.out.println("Average: $" + calculateAvg(list) + "\n");
            for(Product prod: listWithFilter(list)){
                System.out.println(prod);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException: " + e.getMessage());
        }
    }

    public static double calculateAvg(List<Product> list) {
        if(list == null) {
            throw new IllegalStateException("List must be not empty.");
        }
        return list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y)/list.size();
    }

    public static List<Product> listWithFilter(List<Product> list){
        List<Product> prodList = list.stream().filter( x -> x.getPrice() < calculateAvg(list)).collect(Collectors.toList());
        prodList.sort((x, y) -> -x.getPrice().compareTo(y.getPrice()) );
        return prodList;
    }
}
