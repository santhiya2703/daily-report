
package reverse;

import java.util.Scanner;


public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int reverse = 0;
        Scanner sc=new Scanner(System.in);
        //getting the input from the user
        System.out.println("enter a number");
        n=sc.nextInt();
        // it checks till n not equal to zero
        while(n>0){
            int digit=n%10;
            reverse=reverse *10+digit;
            n/=10;
            
        }
        //printing the reversed number
        System.out.println("reversed num"+reverse);
    }
    
}
