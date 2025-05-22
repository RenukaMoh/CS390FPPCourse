package lesson7.framesevents;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandlingDemo extends JFrame {
	 JButton button1,button2,button3;
	 JLabel label;
	public static void main(String[] args) {
		EventHandlingDemo ob = new EventHandlingDemo();

	}
	public EventHandlingDemo() {
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		  button1=new JButton("First ");
	      add(button1);
	      
	      button2=new JButton("Second");
	      add(button2);
	      
	      button3=new JButton("Third");
	      add(button3);
	     
	      label = new JLabel("");
	      add(label);
	     // Anonymous Implementation using Lambda
	      button1.addActionListener( e -> label.setText("Button1 Clicked"));
	    
	     // Anonymous Implementation
	     button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Button2 Clicked");
		}
    });
	      // Inner class ActionListener Implementation
	 button3.addActionListener(new ButtonListener());     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);
	        setTitle("Event Handling");
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Button3 Clicked");
		}
	}
}
