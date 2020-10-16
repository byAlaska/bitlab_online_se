package bitlab.askar.Module2.lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        Scanner in =new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 2020);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


            while (true){
                outputStream.writeObject(in.next());
                String responce  = (String)inputStream.readObject();
                System.out.println(responce);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
