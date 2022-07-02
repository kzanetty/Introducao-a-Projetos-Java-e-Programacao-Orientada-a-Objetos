package application;

import entities.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        Map<Candidate, Integer> candidates = new HashMap<>();
        Candidate cand;

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\VoteCountElection.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int number = Integer.parseInt(fields[1]);
                cand = new Candidate(name, number);
                int numberOfVotes = Integer.parseInt(fields[2]);

                if (candidates.containsKey(cand)) {
                    int sum = candidates.get(cand);
                    candidates.put(cand, (sum + numberOfVotes));
                } else {
                    candidates.put(cand, numberOfVotes);
                }

                line = br.readLine();
            }
            for (Candidate keys : candidates.keySet()) {
                System.out.println(keys + " - total votes: " + candidates.get(keys));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
