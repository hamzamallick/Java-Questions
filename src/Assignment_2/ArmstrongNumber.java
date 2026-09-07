package Assignment_2;

import java.util.Scanner;

public class ArmstrongNumber {

    //Q-> To find Armstrong Number between two given number.
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number:");
        int start = in.nextInt();
        int end = in.nextInt();



        for (int i = start; i <= end; i++) {

            int original = i;
            int num = i;

            // checking the digit of the input
            int digits = 0;
            while (num > 0) {
                digits++;
                num = num / 10;
            }

            // calculating Armstrong
            num = i;
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                num = num / 10;
                sum = sum + (int) Math.pow(rem, digits);
            }

            if (sum == original){
                System.out.println(sum+" ");
            }




        }




    }

}
