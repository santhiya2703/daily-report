
package sampleprogram;

import java.util.Scanner;


public class Sampleprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum;
        //getting the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        n=sc.nextInt();
        // loop iterates upto n!=0
        // declaring sum=0
        for(sum=0;n!=0;n/=10){
            //if n=0 the loop will stop terminating and returns sum value
            sum=sum+n%10;
        }
        System.out.println("Sum of the digits are:"+sum);
        
        
        
    }
    
}
