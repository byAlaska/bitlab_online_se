package bitlab.askar.Module2.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        try {
            doSmth(in.nextInt(),in.nextInt());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Hello");
    }



    public static void doSmth(int x, int y) throws MyException{

        if (y==0){
            throw new MyException();
        }else {
            System.out.println(x/y);
        }

    }
}
