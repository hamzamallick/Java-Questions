package Assignment_1;

import java.util.Scanner;

public class LeapYear {

    static void main(String[] args) {

        //Input a year and find whether it is a leap year or not.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year you want to check");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println("Not a leap year");
        }


    }
}
