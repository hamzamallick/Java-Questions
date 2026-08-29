package Assignment_1;

import java.util.Scanner;

public class Sum {

    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.\


    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {

            String value = in.next();

            if (value.equals("x") || value.equals("X")) {
                break;
            }

            int a = Integer.parseInt(value);
            sum = a + sum;
        }

        System.out.println(sum);


    }

    }