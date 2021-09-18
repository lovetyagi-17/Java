package practice_loops;
import java.util.Scanner;

public class largestAmongAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        while(true) {
            int value = input.nextInt();
            if(value == 0) {
                return;
            } else {
                if(temp <= value) {
                    temp = value;
                }
            }
            System.out.println(temp + " : is largest");
        }
    }
}
