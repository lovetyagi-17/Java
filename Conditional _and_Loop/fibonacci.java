import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        // Q: Nth Fibonacci number.
        int first_fibo = 0;
        int second_fibo = 1;
        int count = 2;
        
        // Using For Loop
        /*
        for(count = 2; count <= input; count+=1) {
            int temp = first_fibo + second_fibo;
            first_fibo = second_fibo;
            second_fibo = temp;
        }
        System.out.println(second_fibo);
        */

        // Using While Loop
        while(count <= input) {

            /* 1st Way using while loop.*/
            int temp = second_fibo;
            second_fibo += first_fibo;
            first_fibo = temp;
            count += 1;

            /* 2nd way using while loop */
            // int temp = first_fibo + second_fibo;
            // first_fibo = second_fibo;
            // second_fibo = temp;
            // count += 1;
        }
        System.out.println(second_fibo);
    }
}
