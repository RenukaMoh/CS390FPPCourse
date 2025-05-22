package lesson7.dec2024demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class StudentLogin extends JFrame {
    private JTextField uname;
    private JPasswordField pwd;
    private JButton btn;
    private JPanel mypanel;

    public StudentLogin(){
        // Default visibility is false. You have enabled visibility true
        setVisible(true);
        // Terminates the Application when the frame is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");
        // Provide the frame width and height
        setSize(300, 400);
        // Make your screen center
        setLocationRelativeTo(null);
        setResizable(true);// If you wish
        // Add panel to your frame
        setContentPane(mypanel);
        // Anonymous Implementation
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String username =         uname.getText();
              char[] pwd1 =  pwd.getPassword();
                if (username.isEmpty() || pwd1.length==0) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("admin") && Arrays.equals(pwd1,"admin123".toCharArray())) {
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
    }


    public static void main(String[] args) {
                /*
        While it is not mandatory to use EventQueue.invokeLater,
        it is a best practice for all Swing applications to ensure
        thread safety and avoid potential concurrency issues.
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentLogin form = new StudentLogin();
            }
        });
    }

}

