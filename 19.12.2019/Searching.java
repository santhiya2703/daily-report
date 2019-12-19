
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
class Reg_Exp
{ 
    public static void main(String args[]) 
    { 
        // Create a pattern to be searched 
        Pattern pattern = Pattern.compile("re*"); 
  
        // Search above pattern in  yhtghghhghjre
        Matcher m = pattern.matcher("yhtghghhghjre.rere"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); 
    } 
} 
