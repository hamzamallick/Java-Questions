package Assignment_3;

import java.util.Arrays;

public class LeetCode {

    static void main(String[] args) {

//        System.out.println(result(234));
        int[] arr = {9, 9, 8, 9};
//        System.out.println(Arrays.toString(plusOne(arr)));

        System.out.println(climbStairs(10));


    }

    //Q->Subtract the Product and Sum of Digits of an Integer
    static int result(int n) {
        int sum = 0;
        int pro = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10;
        }
        return pro - sum;
    }


    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // If all digits were 9
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }


    static int climbStairs(int n) {

        int first = 1;
        int second = 1;

        for (int i = 0; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return first;

    }


}
