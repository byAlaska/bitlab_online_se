package bitlab.askar.Module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        try {

            ServerSocket server = new ServerSocket(2077);
            Socket socket = server.accept();
            System.out.println("Client connected");


            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());


            while (true){
                String responce = (String)inputStream.readObject();
                System.out.println(responce);

                if (responce.equals("hello")){
                    outputStream.writeObject("Hello My Client");
                }

                outputStream.writeObject(in.next());
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
