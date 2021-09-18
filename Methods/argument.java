import java.util.Scanner;

public class argument {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter num: ");
        // int x = input.nextInt();
        // System.out.print("Enter num2: ");
        // int y = input.nextInt();
        // int result = sum(x, y);
        int result = sum(10, 20);
        System.out.println(result);
    }

    // pass the value of no. when you are calling the method in main.(possivle using perametere.)
    static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
