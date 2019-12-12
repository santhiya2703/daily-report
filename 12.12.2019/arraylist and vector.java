
package array;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Array {

    public static void main(String[] args) {
        //arraylist implements the list interface
        ArrayList<String> al=new ArrayList<String>();
        al.add("happy birthdat");
        al.add("good morning");
        al.add("good evening");
        System.out.println("ArrayList are:"+al);
        
        //traversing an element 
         Iterator it = al.iterator(); 
         //it returns true if it has another token in its input
        while (it.hasNext()) 
            System.out.println(it.next()); 
        
        Vector<String> v=new Vector<String>();
        v.addElement("sad");
        v.addElement("happy");
        System.out.println("vector elements are: "+v);
        
        //for traversing an element enumeration is used
          Enumeration e = v.elements(); 
          // used to check ennumeration contains more elements
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement()); 
        
        
    }
    
}
