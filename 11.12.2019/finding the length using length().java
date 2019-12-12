
package length;

import java.util.Scanner;


public class Length {

    public static void main(String[] args) {
        //Initializing the variable
        String s,s1;
        //getting the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        System.out.println("enter the another string");
        s1=sc.nextLine();
        //length() is used to find the length of the string
        int length=s.length();
        System.out.println("lenth of the string is:"+length);
        int l=s1.length();
        System.out.println("length of another String is"+l);
        
        
     
    }
    
}
