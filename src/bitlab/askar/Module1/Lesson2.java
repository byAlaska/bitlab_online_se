package bitlab.askar.Module1;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println(max(2,3,5));

        System.out.println();

    }


    public static int max(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }


    public static int max(int a,int b, int c){
        if (a>b){

            if (c>a){
                return c;
            }
            return a;
        }else {
            if (c>b){
                return c;
            }
            return b;
        }
    }


    public static int max(int []array){
        return 0;
    }


    public static int max(double a, double b){
        return 0;
    }


}