package practice_loops;
import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class productandsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no.: ");
        int num = in.nextInt();
        int multiplyResult = 1;
        int sumResult = 0;
        while(num > 0) {
            int temp = num % 10;
            num /= 10;
            multiplyResult *= temp; 
            sumResult += temp;
        }
        // System.out.println("Multiply result is: " + multiplyResult);
        // System.out.println("SUM result is: " + sumResult);
        System.out.println(multiplyResult - sumResult);

    }
}
