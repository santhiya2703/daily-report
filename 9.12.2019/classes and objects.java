// Class Declaration
public class dog{
    // Instance Variables
    String breed;
    String size;
    int age;
    String color;

  
    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
    

    public static void main(String[] args) {
        //object creation
       dog b = new dog();
       b.breed="Maltese";
       b.size="Small";
        b.age=2;
        b.color="white";
        System.out.println(b.getInfo());
    }
}
