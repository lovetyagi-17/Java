import java.util.Scanner;

public class factors {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner input = new Scanner(System.in) ;
		 try {
		    int x = input.nextInt();
            int count = 0;

            for(int i=1; i<=x; i++){
                if(x%i==0){
                   count++;
                }
            }
            System.out.println(count);

		    for(int i=1; i<=x; i++) {
		        if(x % i == 0){
                    System.out.print(i + " ");
		         }
		     }
		 } catch(Exception e){
		     return;
		 }
	}
}
