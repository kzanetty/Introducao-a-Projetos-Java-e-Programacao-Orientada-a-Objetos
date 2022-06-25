package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithFrAndBfWrong {
    public static void main(String[] args) {

        //Classe criada com o intuido de entender o modo de abrir e fechar arquivos.
        // Não se apegar a esse exemplo pois ele é muito "extenso".

        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\textoOne.txt";
        FileReader fr = null;
        BufferedReader bf = null;

        try {
            fr = new FileReader(path);
            bf = new BufferedReader(fr);

            String line = bf.readLine();
            while(line != null) {
                System.out.println(line);
                line = bf.readLine();
            }


        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
