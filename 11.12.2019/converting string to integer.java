
package string.to.integer;

public class StringToInteger {

    public static void main(String[] args) {
        //asigning a value to a variable s1
        String s1="1234";
        //integer.valueof is used to convert the string to integer
        // use parseint method also to convert the string to integer
        int s=Integer.valueOf(s1);
        System.out.println("Actual string:"+s1);
        System.out.println("converted string:"+s);
        
    }
    
}
