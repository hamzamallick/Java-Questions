package Assignment_3;

public class Questions {

    static void main(String[] args) {
        factors(100);

    }

    //Q->Input a number and print all the factors of that number (use loops).
    static void factors(int n){
        for (int i = 1; i <= n; i++) {

            if (n%i==0){
                System.out.println(i+" ");
            }

        }
    }



}


