package exercicioFilesProgram;

import exercicioFiles.entities.Product;

import java.io.*;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = "D:\\junio\\bala.csv";




        System.out.println("Digite o nome do produto: ");

        String produto = sc.nextLine();
        System.out.println("Digite o preco do produto: ");
        Double price = sc.nextDouble();
        System.out.println("Digite a quantidade do produto");
        int quantidade = sc.nextInt();

        Product product = new Product(produto, price, quantidade);
        String Strings = String.valueOf(product);

        String[] lines = new String[Integer.parseInt(Strings)];

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))){

            for (String line : lines){
                bw.write(line);

            }

            boolean success = new File(strPath + "\\out").mkdir();
            System.out.println("Directory created successfully: " + success);


        }
        catch (IOException e ){
             e.printStackTrace();


        }catch (NumberFormatException e ){
            System.out.println("error: :(");

        }
    }
}
