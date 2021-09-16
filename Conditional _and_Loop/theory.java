
public class theory {
    public static void main(String[] args) {
        /*
            Syntax of If-Statement
            if(boolean expression T or F) {
                // body
            } else {
                // Do this
            }
        */

        int salary = 2450;
        // if( salary > 5000){
        //     salary += 1000;
        // } else{
        //     salary += 500;
        // }
        // System.out.println(salary);

        /* Multiple If-Else */
        if(salary > 5000) {
            salary += 1000;
        } else if(salary > 2000) {
            salary += 500;
        } else {
            salary += 1;
        }
        System.out.println(salary);
    }
}
