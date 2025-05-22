package lesson7.framesevents;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * This version of MyFrame illustrates some initialization, including
 * centering on the desktop and configuring window closing. It does
 * not add any components to the content pane.
 *
 */
public class MyFrame1 extends JFrame {

	public MyFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		setSize(320, 240); //pack is not a good choice here because there are no components yet
		//pack();
		centerFrameOnDesktop(this);
		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Get the height and width of Window Screen size
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		// Created JFrame height and Width
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		// Formula to know the x,y coordinates to display the Frame by centralizing 
		int xpos = (width - frameWidth) / 2;
		int ypos = (height - frameHeight) / 3;
		f.setLocation(xpos, ypos);
		
		//System.out.println("height = " + height);
		//System.out.println("width = " + width);
		System.out.println("Frame Height = " + frameHeight);
		System.out.println("Frame width = " + frameWidth);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				MyFrame1 mf = new MyFrame1();				
				mf.setVisible(true);
			}
		});
	}

	private static final long serialVersionUID = 3618976789175941431L;
}
