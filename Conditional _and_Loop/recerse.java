import java.util.Scanner;

public class recerse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int answer = 0;
        while(input > 0) {
            // Method-1
            //    int temp = input % 10;
            //     input /= 10;
            //     System.out.print(temp);

        // Method-2
            int temp = input % 10;
            input /= 10;
            answer = answer * 10 + temp;
            }
            System.out.println(answer);
    }
}
