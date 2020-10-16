package bitlab.askar.Module2.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        ThreadGroup threadGroup = new ThreadGroup("first group");
        MyThread thread1 = new MyThread(threadGroup,"1");
        MyThread thread2 = new MyThread(threadGroup,"2");
        MyThread thread3 = new MyThread(threadGroup,"3");


        thread1.start();
        thread2.start();
        thread3.start();


        while (threadGroup.activeCount()>0){

        }


        System.out.println("MAIN IS FINISHED");


    }
}
