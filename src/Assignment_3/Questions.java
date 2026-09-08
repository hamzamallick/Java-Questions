package Assignment_3;

import java.util.Scanner;

public class Questions {



    static void main(String[] args) {

//        sum();
//        greatest();
//        System.out.println(greatest());

//        electricity();


//        factors(100);
        avg();

    }

    //Q->Input a number and print all the factors of that number (use loops).
    static void factors(int n){
        for (int i = 1; i <= n; i++) {

            if (n%i==0){
                System.out.println(i+" ");
            }

        }
    }

    //Q->Take integer inputs till the user enters 0 and print the sum of all numbers

    static void sum(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {

            int num = in.nextInt();

            if (num == 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println(sum);


    }

    //Q->Take integer inputs till the user enters 0 and print the largest number from all.
    static int greatest(){
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true){
            int num = in.nextInt();
            if (num==0){
                break;
            }
            if (num>max){
                max = num;
            }
        }
        return max;
    }

    //Q->Calculate Electricity Bill
    static void electricity(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the unit consumed");
        int unit = in.nextInt();
        System.out.println("Enter the charge per unit");
        int perUnit = in.nextInt();
        int bill = unit*perUnit;
        System.out.println("You bill is "+bill+" of "+unit+" unit");

    }

    //Q->Calculate Average Of N Numbers
    static void avg(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {

            int num = in.nextInt();

            if (num == 0) {
                break;
            }
            sum = sum + num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("No numbers were entered.");
        }


    }




}


