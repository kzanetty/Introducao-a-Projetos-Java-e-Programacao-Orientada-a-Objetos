package application;

import entitie.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ExamplesOfStream.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email =fields[1];
                double salary = Double.parseDouble(fields[2]);
               list.add(new Employee(name, email, salary));
               line = br.readLine();
            }

            System.out.print("Choose a value: $");
            double value = sc.nextDouble();

            List<String> listEmailsPriceGreaterThanValue = list.stream().filter(x -> x.getSalary() > value).map(Employee::getEmail)
                    .sorted((s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase())).collect(Collectors.toList());
            listEmailsPriceGreaterThanValue.forEach(System.out::println);

            char charChoose = 'L';
            double sumEmployeesWithFirstCharacterSuch = list.stream().filter(x -> x.getName().charAt(0) == charChoose).map(Employee::getSalary).reduce(0.0, Double::sum);
            System.out.println("Sum of the employees starting with " + charChoose +" character: $"+ sumEmployeesWithFirstCharacterSuch);
            for(Employee emp: list){
                if(emp.getName().charAt(0) == charChoose){
                    System.out.println(emp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException: " + e.getMessage());
        } finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
