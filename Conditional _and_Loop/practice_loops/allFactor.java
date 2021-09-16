package practice_loops;
import java.util.Scanner;

// Input a number and print all the factors of that number (use loops).
public class allFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i <= number/2; i++) {
            if(number % i == 0) {
                count += 1;
            }
        }
        System.out.println(count + 1); // +1 is for number itself.
    }
}
