import java.util.Scanner;

public class fruittype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        // switch(fruit) {
        //     case "Grapes" -> System.out.println("Sour Fruit");   java 14 switch case style using arrow function.
        //     case "Apple" -> System.out.println("Red Fruit");
        //     default -> System.out.println("Invalid Fruit!")
        // }

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits.");
                break;
            
            case "Orange":
                System.out.println("Sour fruit.");
                break;

            case "Grapes":
                System.out.println("Green fruit.");
                break;
        
            default:
                System.out.println("Enter Valid Fruit!");
        }
    }
}
