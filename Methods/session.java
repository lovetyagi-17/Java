import java.util.Scanner;

public class session {
    public static void main(String[] args) {
        // Q: Take input of 2 no. from user and add them & print sum.
        sum();
        greet();
        int result = sum1(); // result of sum1() function returned to result var to show output.
        System.out.println("sum1 function result: " + result);

         /* 
            for (int i = 0; i <= 5; i+=1 ) {
            sum();
            } 
        */
        

    }
     // Functional Approach.
        /* Syntax: 
            Access Modifiers(we will look it in OOPS) return_type name(arguments) {
                // body
                return statement;
            }
        */
    /* 
        I used static with void sum(), the reason of that is main() function. 
        main is static type function so only static function is callble with main().
    */
    static void sum() {
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is : " + sum); 
    }

    // Function is void type so no return type is there. void is used in case of printing something.
    static void greet() {
        System.out.println("Hello Function!");
    }

    // if i want to return some value, so i will not use void, any other type(int, float etc.).
    static int sum1() {
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        return sum;
    }
}
