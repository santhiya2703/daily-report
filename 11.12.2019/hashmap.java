import java.util.HashMap; 
import java.util.Map; 
  
public class Hashmap { 
    public static void main(String[] args) 
    { 
        //hashmap() is the default constructor which creates the instance of the hashmap
        HashMap<String, Integer> map = new HashMap<>(); 
  
        print(map); 
        
        map.put("santhiya\n", 10); 
        map.put("soundarya\n", 30); 
        map.put("sushmitha\n", 20);
        map.put("pratheeba\n",40);
        
        //printing the size of the hashmap
        System.out.println("Size of map is:- "
                           + map.size()); 
  
        print(map); 
        if (map.containsKey("santhiya")) { 
            Integer a = map.get("santhiya"); 
            System.out.println("value for key"
                               + " \"santhiya\" is:- "
                               + a); 
        } 
        //clear is used to remove all the elements or mappings specified from the hashmap
        map.clear(); 
        print(map); 
    } 
  
    public static void print(Map<String, Integer> map) 
    { 
        if (map.isEmpty()) { 
            System.out.println("map is empty"); 
        } 
  
        else { 
            System.out.println(map); 
        } 
    }
}
