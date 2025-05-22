package lesson7.SwingDesigner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JLabel title;
    private JButton button;
    private JTextField name;
    private JPanel myPanel;

    public HelloForm(){
        setContentPane(myPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Welcome Screen");
        setLocationRelativeTo(null);
        setSize(300,400);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Due Anonymous implementation of Listener need to pass HelloForm.this instead of this
                JOptionPane.showMessageDialog(HelloForm.this, STR."Hello \{name.getText()}");
            }
        });
    }
    public static void main(String[] args) {
        new HelloForm();
    }
}
