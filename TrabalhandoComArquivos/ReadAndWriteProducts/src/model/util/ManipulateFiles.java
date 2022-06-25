package model.util;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulateFiles {

    public static List listProducts(String pathRead) {
        List<Product> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(pathRead))) {

            String line = bf.readLine();

            while (line != null) {
                String[] reads = line.split(",");
                String name = reads[0];
                double price = Double.parseDouble(reads[1]);
                int quantity = Integer.parseInt(reads[2]);
                list.add(new Product(name, price, quantity));
                line = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

    public static void writeList(List<Product> list, String pathWrite){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite, true))) {
            if (list != null) {
                for (Product prod : list) {
                    bw.write(prod.getName() + ",$" + String.valueOf(prod.totalValue()));
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
