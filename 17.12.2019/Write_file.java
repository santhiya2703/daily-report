package FileHandling;
 
// Import the FileWriter class
import java.io.FileWriter; 
 
// Import the IOException class to handle errors
import java.io.IOException; 
 
public class Write_File {
public static void main(String[] args) {
try {
FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
 // Writes this content into the specified file
myWriter.write(Java is the prominent programming language of the millenium!"); 
 
// Closing is necessary to retrieve the resources allocated
myWriter.close(); 
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}
