package bitlab.askar.Module2.lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        File file = new File("test2.txt");
        ArrayList<Product> products = new ArrayList<>();
        if (file.exists()){
             products = read();
        }

        while (true){
            System.out.println("[1] to add");
            System.out.println("[2] to list");
            System.out.println("[0] to exit");

            int choice = in.nextInt();

            if (choice==1){
                String name = in.next();
                int price = in.nextInt();

                Product product = new Product(name,price);
                products.add(product);
                write(products);
            }else if (choice==2){
                System.out.println(products);
            }else {
                break;
            }
        }



    }

    public static void write(ArrayList<Product> products){
        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test2.txt"));
            outputStream.writeObject(products);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static ArrayList<Product> read(){

        ArrayList<Product >products = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test2.txt"));
            products = (ArrayList<Product>)inputStream.readObject();
            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return products;
    }
}
