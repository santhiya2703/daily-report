import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
//initializing the variables
   JPanel p ;
   JLabel user, pass, m;
   JTextField userName;
   JPasswordField password_text;
   JButton submit, cancel;
//login method()
   Login() {

      // Username Label
      //jlabel is used to display an text ,image or an icon
      user = new JLabel();
      user.setText("User Name :");
      userName = new JTextField();

      // Password Label
      //textfield is used for editing or we can enter something
      pass = new JLabel();
      pass.setText("Password :");
       JPasswordField password = new JPasswordField();

      // Submit

      submit = new JButton("SUBMIT");

      p = new JPanel(new GridLayout(3, 1));
      p.add(user);
      p.add(userName);
      p.add(pass);
      p.add(password);

      m = new JLabel();
      p.add(m);
      p.add(submit);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Adding listners to the components
      submit.addActionListener(this);
      add(p, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
   }
//main method
   public static void main(String[] args) {
      new Login();
   }

   
   public void actionPerformed(ActionEvent ae) {
      String u = userName.getText();
      String password = password_text.getText();
      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
         m.setText(" Hello " + userName + "");
      } else {
         m.setText(" Invalid user.. ");
      }
   }
}
