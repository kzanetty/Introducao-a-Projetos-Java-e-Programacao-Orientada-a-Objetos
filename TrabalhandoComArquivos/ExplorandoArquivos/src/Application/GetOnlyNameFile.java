package Application;

import java.io.File;

public class GetOnlyNameFile {
    public static void main(String[] args) {

        String srtPath = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\textoOne.txt";

        File path = new File(srtPath);

        System.out.println("getName: " + path.getName());
        //vai me retorar apenas o nome do arquivo, e não o caminho completo.

        System.out.println("getParent: " + path.getParent());
        //Vai me retornar apenas o caminho do arquivo, mas não vai me retorar o nome no arquivo.

        System.out.println("getPath: " + path.getPath());
        //Vai me retornar o caminho comleto.
    }
}
