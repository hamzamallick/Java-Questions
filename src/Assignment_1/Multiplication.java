package Assignment_1;

import java.util.Scanner;

public class Multiplication {

    static void main(String[] args) {
        //Take a number as input and print the multiplication table for it.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i = 1; i <=10; i++){
            System.out.println(num*i);
        }
    }
}
