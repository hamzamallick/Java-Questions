package Assignment_2;

import java.util.Scanner;

public class Palindrome {

    //Q->To find out whether the given String is Palindrome or not.
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String pal = in.next();
        System.out.println(palindrome(pal));


    }


    static boolean palindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i<j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // move i forward
            i++;
            j--;
            // move j backward
        }
        return true;

    }
}
