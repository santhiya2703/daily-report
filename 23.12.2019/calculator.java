import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
   private static JTextField inputBox;

   Calculator(){}
   public static void main(String[] args) {
      createframe();
   }

   private static void createframe() {          
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(200, 200);            
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Calculator c = new Calculator();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints b = new GridBagConstraints();
      panel.setLayout(layout);
       
      inputBox = new JTextField(10);        
      inputBox.setEditable(false);

      JButton b0 = new JButton("0");
      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");

      JButton Plus = new JButton("+");
      JButton Minus = new JButton("-");
      JButton Divide = new JButton("/");
      JButton Multiply = new JButton("*");
      JButton Clear = new JButton("C");
      JButton Dot = new JButton(".");
      JButton Equals = new JButton("=");

      b1.addActionListener(c);
      b2.addActionListener(c);
      b3.addActionListener(c);
      b4.addActionListener(c);
      b5.addActionListener(c);
      b6.addActionListener(c);
      b7.addActionListener(c);
      b8.addActionListener(c);
      b9.addActionListener(c);
      b0.addActionListener(c);
      
      

      Plus.addActionListener(c);
      Minus.addActionListener(c);
      Divide.addActionListener(c);
      Multiply.addActionListener(c);
      Clear.addActionListener(c);
      Dot.addActionListener(c);
      Equals.addActionListener(c);

      b.fill = GridBagConstraints.HORIZONTAL;
      b.gridx = 0; 
      b.gridy = 0; 
      panel.add(b1, b);        
      b.gridx = 1; 
      b.gridy = 0; 
      panel.add(b2, b);
      b.gridx = 2;
      b.gridy = 0; 
      panel.add(b3, b);
      b.gridx = 3; 
      b.gridy = 0; 
      panel.add(Plus, b);
      b.gridx = 0;
      b.gridy = 1;
      panel.add(b4, b);
      b.gridx = 1; 
      b.gridy = 1; 
      panel.add(b5, b);
      b.gridx = 2; 
      b.gridy = 1; 
      panel.add(b6, b);
      b.gridx = 3; 
      b.gridy = 1; 
      panel.add(Minus, b);
      b.gridx = 0; 
      b.gridy = 2; 
      panel.add(b7, b);
      b.gridx = 1; 
      b.gridy = 2; 
      panel.add(b8, b);
      b.gridx = 2; 
      b.gridy = 2; 
      panel.add(b9, b);
      b.gridx = 3; 
      b.gridy = 2; 
      panel.add(Divide, b);
      b.gridx = 0; 
      b.gridy = 3; 
      panel.add(Dot, b);
      b.gridx = 1; 
      b.gridy = 3; 
      panel.add(b0, b);
      b.gridx = 2; 
      b.gridy = 3; 
      panel.add(Clear, b);
      b.gridx = 3; 
      b.gridy = 3; 
      panel.add(Multiply, b);
      b.gridwidth = 3;

      b.gridx = 0; 
      b.gridy = 4;
      panel.add(inputBox, b);        
      b.gridx = 3; 
      b.gridy = 4; 
      panel.add(Equals, b);
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
       switch (command.charAt(0)) {
           case 'C':
               inputBox.setText("");
               break;
           case '=':
               inputBox.setText(calculate_maths(inputBox.getText()));
               break;
           default:
               inputBox.setText(inputBox.getText() + command);
               break;
       }
   }
 
   public static String calculate_maths(String expression) {
      char[] arr = expression.toCharArray();
      String o1 = "";
      String o2 = "";
      String o = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(o.isEmpty()){
               o1 += arr[i];
            }else{
               o2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            o += arr[i];
         }
      }

       switch (o) {
           case "+":
               result = (Double.parseDouble(o1) + Double.parseDouble(o2));
               break;
           case "-":
               result = (Double.parseDouble(o1) - Double.parseDouble(o2));
               break;
           case "/":          
               result = (Double.parseDouble(o1) / Double.parseDouble(o2));
               break;
           case "*":
               result = (Double.parseDouble(o1) * Double.parseDouble(o2));
               break;
           default:
               return null;
       }
      return o1 + o + o2 + "=" +result;
   }    
}
