package bitlab.askar.Module2.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


//
//        int n = in.nextInt();
//        System.out.println(fib(5));
//        System.out.println(fib(10));


        // 0 1 1 2 3 5 8 13 21

        // 13 = 8 + 5
        // 8 = 3 + 5 -> // 3 = 2 + 1 | 5 = 2 + 3
        // 5 = 2 + 3
        //



        int count = 30, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i) {

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }


        System.out.println(num2);



    }


    public static int fib(int n){

        // n = 5
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if (n==2){
            return 1;
        }

        return fib(n-1) + fib( n - 2);
    }
}
