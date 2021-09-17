package practice_loops;
import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class sumOfAllnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int sum = 0;
            int value = input.nextInt();
            if(value == 0) {
                return;
            }
            sum += value; 
            System.out.println(sum);
        }
    }
}
