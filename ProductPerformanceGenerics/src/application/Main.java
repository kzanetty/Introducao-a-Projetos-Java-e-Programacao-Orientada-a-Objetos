package application;

import model.entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ProductPerformance.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                list.add(new Product(name, price));
                line = br.readLine();
            }

            Collections.sort(list);
            for(Product prod: list){
                System.out.println(prod);
            }
            System.out.println("Most expensive: " + CalculationService.max(list));

        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException: " + e.getMessage());
        }
    }
}
