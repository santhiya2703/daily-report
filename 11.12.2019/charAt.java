
package charat;

import java.util.Scanner;


public class CharAt {
//main method
    public static void main(String[] args) {
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s1=sc.nextLine();
        
        char c;
        //CharAt returns the character at the given index value
        c=s1.charAt(7);
        System.out.println("character at the position in c"+ c);
        
        
    }
    
}
