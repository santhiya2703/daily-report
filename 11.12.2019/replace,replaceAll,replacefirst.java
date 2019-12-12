
package replace;

import java.util.Scanner;


public class Replace {


  
    public static void main(String[] args) {
        //initializing the variable
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s1=sc.nextLine();
        // replace() replaces every occurence of a character with new character
        System.out.println("replace :"+s1.replace("s", "a"));
        //replaceAll() replaces all the sequence of the character
        System.out.println("replace all"+s1.replaceAll("\\s", ""));
        //replacefirst() replace the first substring of the given string
        System.out.println("replace first"+s1.replaceFirst("n", "m"));
        
       
    }
    
}
