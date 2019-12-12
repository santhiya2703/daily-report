
package pkgstatic.variable;


public class StaticVariable {
    int a; //initialized to zero
    static int b;//initialized to zero only when class is loaded not for each object created.
    
    StaticVariable(){
        b++;//increment
    }
   public void showdata(){//method showdata
      System.out.println("value of a is:"+a);
      System.out.println("value of b is:"+b);
   }
   
    public static void main(String[] args) {
        StaticVariable s1=new StaticVariable();//object creation
        s1.showdata();
        StaticVariable s2=new StaticVariable();
        s2.showdata();
      
    }
    
}
