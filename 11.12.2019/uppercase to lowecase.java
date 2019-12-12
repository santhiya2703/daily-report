
package lowercase;


import java.util.Scanner;

public class Lowercase
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Character in Uppercase : ");
        //changing the uppercase to lower case
        ch = sc.next().charAt(0);
	//temp refers to temporary variable	
        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;
		
        System.out.print("Equivalent Character in Lowercase = " + ch);
    }
}
