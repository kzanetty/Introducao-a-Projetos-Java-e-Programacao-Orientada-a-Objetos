package Application;

import model.entities.Product;
import model.util.ManipulateFiles;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        String pathRead = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ListProducts.txt";
        String pathWrite = "C:\\ProjectsJAVA\\Projects\\TrabalhandoComArquivos\\Textos\\ValueTotalProducts.txt";

        List<Product> prod = ManipulateFiles.listProducts(pathRead);
        ManipulateFiles.writeList(prod, pathWrite);

        System.out.println("Program finish - Successful.");
    }
}
