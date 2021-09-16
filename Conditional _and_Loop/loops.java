import java.util.Scanner;

/* Loops */
public class loops {
    public static void main(String[] args) {

        /* For-Loop : When Developer is aware with the termination, no further assistance of user is required for termination.     
            Syntax: for(initilisation; condition; increment/decrement)
                        //body
        */

        // Q: Print 1 to 5 number.
        /* 
            for (int num = 1; num < 6; num += 1){
                System.out.println(num);
            }
            System.out.println("Condition is not valid this Time!"); 
        */


        // Q: Print number from 1 to n.
        /*
            Scanner in = new Scanner(System.in);  // for user input
            int n = in.nextInt();

            for (int num = 0; num <= n; num+=1) {
                System.out.println(num);
            }
            System.out.println("You loop crossed condition value! So program is terminated.");
        */



        /* (when developer is not aware with loop termination(depends upon user further instruction) at that senario while loop.)
            While Loop: condition will check first then execution.
            Syntax: 
                Initialization
                while(condition) {
                    //body
                    Increment/Decrement
                }    
        */

         // Q: Print number from 1 to 5.(Using While loop)
         /*
            int num  = 1;
            while(num <=5){
                System.out.println(num);
                num+=1;
            }
         */


         // Do-While Loop: It will execute atleast once either condition matched or not because condition will check after one execution.
         /*
         Syntax: 
            initialization
            do {
                // body
            } while (condition)
         */

        // Q: Print number from 1 to 5.(Using Do-While loop)
        int num = 1;
        do{
            System.out.println(num);
            num+=1;
        } while(num <= 5);


    }
}
