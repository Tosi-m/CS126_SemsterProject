import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LoginWindow {

  private JFrame frame;
  private JTextField usernameTextField;
  private JTextField pinTextField;
  private JButton loginButton;

  public LoginWindow() {
    frame = new JFrame("Login Window");
    frame.setLayout(null);
	frame.setLocationRelativeTo(null);
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel usernameLabel = new JLabel("Username:");
    usernameLabel.setLocation(40, 25);
    usernameLabel.setSize(100, 25);
    frame.add(usernameLabel);

    usernameTextField = new JTextField();
    usernameTextField.setLocation(140, 25);
    usernameTextField.setSize(200, 25);
    frame.add(usernameTextField);

    JLabel pinLabel = new JLabel("Pin:");
    pinLabel.setLocation(40, 75);
    pinLabel.setSize(100, 25);
    frame.add(pinLabel);

    pinTextField = new JTextField();
    pinTextField.setLocation(140, 75);
    pinTextField.setSize(200, 25);
    frame.add(pinTextField);

    loginButton = new JButton("Login");
    loginButton.setLocation(185, 115);
    loginButton.setSize(100, 25);
    loginButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String username = usernameTextField.getText();
        String pin = pinTextField.getText();

        if (username.equals("admin") && pin.equals("1234")) {
          new Window2().setVisible(true);
        } else {
          JOptionPane.showMessageDialog(null, "Invalid username or pin");
        }
      }
    });
    frame.add(loginButton);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new LoginWindow().frame.setVisible(true);
      }
    });
  }
}

class Window2 extends JFrame {

  public Window2() {
    setTitle("Welcome!");
    setSize(400, 300);
    setLocationRelativeTo(null);
    //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JLabel welcomeLabel = new JLabel("Welcome to the application!");
    welcomeLabel.setLocation(100, 100);
    welcomeLabel.setSize(200, 25);
    add(welcomeLabel);

    JButton exitButton = new JButton("Exit");
    exitButton.setLocation(100, 150);
	exitButton.setSize(75, 35);
    exitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    add(exitButton);
	getContentPane().setLayout(null); //enforces absolute layout
    setVisible(true);
  }
}