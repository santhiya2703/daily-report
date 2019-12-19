
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
class Split
{ 
    public static void main(String args[]) 
    { 
        String text = "s1a2n3t4h5i6y7a8"; 
  
        // Specifies the string pattern which is to be searched 
        String delimiter =  "\\d"; 
        Pattern pattern = Pattern.compile(delimiter, 
                                        Pattern.CASE_INSENSITIVE); 
  
        // Used to perform case insensitive search of the string 
        String[] result = pattern.split(text); 
  
  
        for (String temp: result) 
            System.out.println(temp); 
    } 
} 
