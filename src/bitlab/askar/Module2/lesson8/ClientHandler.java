package bitlab.askar.Module2.lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler extends Thread{

    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }


    @Override
    public void run() {
        try {
            Scanner in = new Scanner(System.in);
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
