import java.util.Scanner;

public class typecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* String word = "Hello";
           System.out.println(word.charAt(0));

           .trim() : To discard all blanck space.
           .charAt() : To get the character according to index mentioned in brackets.
        */

        char ch = in.next().trim().charAt(0); //in.nnext() to get char or string input
        // System.outH.println(ch);

        if(ch >= 'a' && ch<= 'z') {
            System.out.print(ch +  " is a LOWERCASE Character.");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a UPPERCASE Character.");
        } else {
            System.out.println("Something wrong!");
        }



    }
}
