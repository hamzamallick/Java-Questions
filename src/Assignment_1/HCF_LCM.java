package Assignment_1;

import java.util.Scanner;

public class HCF_LCM {

    //Take 2 numbers as inputs and find their HCF and LCM.
    static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int hcf = 1;
//        System.out.println("Give two number for finding HCF and LCM");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int originalNum1 = num1;
//        int originalNum2 = num2;
//
//
//        // simple loop problem
//
////        for (int i = 1; i <= Math.min(num1, num2); i++) {
////            if (num1 % i == 0 && num2 % i == 0) {
////                hcf = i;
////
////            }
////
////        }
//
//
//        //Euclidean Algorithm
//        while (num2 != 0) {
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//
//        }
//
//
//        hcf = num1;
//        int lcm = (originalNum1 * originalNum2) / hcf;
//        System.out.println("LCM " + lcm);
//        System.out.println("HCF " + hcf);


        int[] arr = {432,6,276,2,721,724,4};

        System.out.println(findGCD(arr));




    }


    static int findGCD(int[] nums) {

        int minElement = nums[0];
        int maxElement = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (maxElement < nums[i]) {
                maxElement = nums[i];
            }
            if (minElement > nums[i]) {
                minElement = nums[i];
            }
        }

        while (minElement!= 0){
            int temp = minElement;
            minElement = maxElement % minElement;
            maxElement = temp;

        }

        return maxElement;

    }
}
