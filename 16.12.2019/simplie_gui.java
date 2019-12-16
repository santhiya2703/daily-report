
import javax.swing.*;
class userinteface{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First userinterface");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button); //the layer that is used to hold the objects
       // set visible ,if you set it to true ,it means that you want the thing to be visible
       //in your screen
       frame.setVisible(true);
    }
}
