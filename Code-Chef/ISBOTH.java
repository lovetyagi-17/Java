import java.util.Scanner;
import java.lang.*;

public class ISBOTH {
    public static void main(String[] args) throws java.lang.Exception {
        String result = BOTH(11);
        System.out.println(result);
    }

    static String BOTH(int x) {
        try {
            if(x % 5 == 0 && x % 11 == 0) {
                return "BOTH";
            } else if(x % 5 == 0) {
                return "ONE";
            } else {
                return "NONE";
            }
        } catch(Exception e) {
            return "Error";
        }
    }
}
