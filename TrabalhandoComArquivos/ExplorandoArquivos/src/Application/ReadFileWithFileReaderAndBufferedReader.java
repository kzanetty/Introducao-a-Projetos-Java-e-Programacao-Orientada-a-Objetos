package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithFileReaderAndBufferedReader {
    public static void main(String[] args) {

        //Forma correta de abrir um arquivo.

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\textoOne.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();

            while(line != null){
                System.out.println(line);
                line = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " +  e.getMessage());
        }
    }
}
