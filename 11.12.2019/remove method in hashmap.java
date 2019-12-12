
package remove;

import java.util.HashMap;

public class Remove {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"orange");
        map.put(3,"mango");
        System.out.println("Size of the map"+map.size());
        //remove() used to remove the particular key value pair
       map.remove(1);
        System.out.println("after removing"+map.size());
        
     
    }
    
}
