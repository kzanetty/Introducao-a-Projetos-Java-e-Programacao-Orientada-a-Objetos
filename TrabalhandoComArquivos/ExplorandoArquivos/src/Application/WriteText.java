package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "good afternoon", "good night"};
        String path = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\WriteText.txt";

        // se colocarmos apenas new FileWrite(path) ele ira criar/recriar a pasta.
        //se colocarsmo new FileWrite(path, true) ele ira adicionar conteudo ao arquivo.
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line); //adiciona esse conteudo no arquivo
                bw.newLine();   //devemos criar a quebra de linha manualmente, ela n ocorre de forma auto.
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Pronto.");
        }
    }
}
