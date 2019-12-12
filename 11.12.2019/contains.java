
package contains;

import java.util.Scanner;


public class Contains {

    
    public static void main(String[] args) {
        //initializing the variable
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s1=sc.nextLine();
        System.out.println("contains");
        s2=sc.nextLine();
        // checking the string s1 contains s2 or not
        if(s2.contains("ing")){
            System.out.println("true");
       
        }
        else{
            System.out.println("false");
    }
    
}
}
