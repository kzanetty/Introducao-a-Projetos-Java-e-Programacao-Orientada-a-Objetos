package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ListNames.txt";

        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                list.add(new Employee(name, salary));
                line = br.readLine();
            }

            Collections.sort(list);
            for(Employee names : list){
                System.out.println(names);
            }

        } catch (FileNotFoundException e) {
            System.out.println("error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
