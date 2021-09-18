import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // non perametarized function call.
        String message = greet();
        System.out.println(message);

        // Perametarized function call.
        String response = greet1("DevOps");
        System.out.println(response);

        // user input as permetere.
        Scanner input = new Scanner(System.in);
        String role =  input.next();
        String result = greet1(role);
        System.out.println(result);
    }

    // non perametarized function.
    static String greet() {
        String greeting = "Hello. How's Java?";
        return greeting;
    }

    // perametarized function 
    static String greet1(String role) {
        String message = "Hello " + role;
        return message;
    }
}
