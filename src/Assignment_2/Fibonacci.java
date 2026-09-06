package Assignment_2;

import java.util.Scanner;

public class Fibonacci {

    //To calculate Fibonacci Series up to n numbers.
    // 0,1,1,2,3,5,8,13,21,34.... sum of previous two number

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
//            System.out.print( first+" " );
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(first);
    }
}
