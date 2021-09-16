import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        int number = in.nextInt();
        int count = 0;
        while(digit > 0) {
            int temp = digit % 10;
            if(temp == number) {
                count += 1;
            }
            digit /= 10;
        }
        System.out.println("Occurance of number " + number + " is: " + count);
    }
}
