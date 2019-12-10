// Inheritence : It inherits the features of another class
package inheritance;
 //base class
class Car
{  
    public int gear; 
    public int speed; 
          
   //contains one constructor
    public Car(int gear, int speed) 
    { //this (keyword) is a reference variable it refers to current object
        this.gear = gear; 
        this.speed = speed; 
    } 
          
 // decrement operator is used to reduce the speed of the car
    public void Brake(int decrement) 
    { 
        speed =speed- decrement; 
    } 
    // increment operator is used to increase the speed of the car      
    public void speedUp(int increment) 
    { 
        speed =speed + increment; 
    } 
     //which returns the string object which is car
    public String toString()  
    { 
        return("number of gears are "+gear 
                +"\n"
                + "speed of car is "+speed); 
    }  
} 
  
// the class bike extending the car (derived class)
class Bike extends Car 
{ //sub class
    public int seatHeight; 
  //subclass
    public Bike(int gear,int speed, 
                        int startHeight) 
    { // super class is a reference variable refers to immediate parent class
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
 //overriding the string to get more information about the car
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
  
public class Inheritance
{ //Main class
    public static void main(String args[])  
    { 
          //creating the object for the derived class
        Bike b = new Bike(3, 100, 25); 
        //printing the object
        System.out.println(b.toString()); 
              
    } 
} 
