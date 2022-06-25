package Application;

import java.io.File;
import java.util.Scanner;

public class ConsultFilesAndFoldersInsideFolders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\ExplorandoArquivos
        System.out.println("Inform a folder path: ");
        String strFolder = sc.nextLine();

        File path = new File(strFolder);

        File[] files = path.listFiles();
        System.out.println("Files: ");
        for(File file : files){
            System.out.println(file);
        }

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File file : folders){
            System.out.println(file);
        }

        sc.close();
    }
}
