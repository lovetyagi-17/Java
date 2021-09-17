package practice_loops;
import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class sumOfAllnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int value = in.nextInt();
            if(value == 0) {
                break;
            }
            sum = sum + value;
            System.out.println(sum);
        }
    }
}
