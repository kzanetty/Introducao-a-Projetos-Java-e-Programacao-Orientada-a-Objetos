package application;

import model.entities.Record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        Set<Record> records = new HashSet<>();
        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\NameAndHour.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(" ");
                String name = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));
                records.add(new Record(name, date));
                line = br.readLine();
            }

            for(Record x : records) {
                System.out.println(x);
            }
            System.out.println("Size: " + records.size());

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}
