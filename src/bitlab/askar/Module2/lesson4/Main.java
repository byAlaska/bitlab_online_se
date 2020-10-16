package bitlab.askar.Module2.lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        ArrayList<String> products = read();

        while (true){

            System.out.println("[1] to write product");
            System.out.println("[2] to read product");
            System.out.println("[0] to exit");
            int choice = in.nextInt();

            if (choice==1){
                System.out.println();
                String product = in.next();
                products.add(product);
                write(products);
            }else if (choice==2){
                products = read();
                for (String s:products){
                    System.out.println(s);
                }
            }else{
                break;
            }
        }
    }


    public static void write(ArrayList<String> products){
        try {

            BufferedWriter bf = new BufferedWriter(new FileWriter("test.txt"));

            for (String s:products){
                bf.write(s+ "\n");
            }
            bf.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static ArrayList<String> read(){
        ArrayList<String > products = new ArrayList<>();

        try {

            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));

            String message;
            while ((message = bf.readLine())!=null){

                products.add(message);
            }
            bf.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

}