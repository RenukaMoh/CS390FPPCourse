package lesson7.framesevents;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This just shows how to create a text panel with label.
 *
 */
public class TextPanel extends JFrame {
	
	private JPanel textPanel; // Main or Top Panel
	private JPanel topText; // Text Field Panel
	private JPanel bottomText; // Label field Panel
	private JTextField text; 
	private JLabel label;
	
	public TextPanel() {
		initializeWindow();
		textPanel = new JPanel();
		defineTextPanel();
		// Main or Top Panel with BorderLayout
		textPanel.setLayout(new BorderLayout());
		// TextField Panel added to the Main Panel in North
		textPanel.add(topText, BorderLayout.NORTH);
		// LabelField Panel added to the Main Panel in Center
		textPanel.add(bottomText, BorderLayout.CENTER);
		// Add main Panel to the JFrame
		getContentPane().add(textPanel);
		pack();
		centerFrameOnDesktop(this);
	}
	private void defineTextPanel() {
		
		topText = new JPanel();
		bottomText = new JPanel();
		// TextField Panel with FlowLayout of Left Alignment, hgap=5, vgap=0
		topText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		// LabelField Panel with FlowLayout of Left Alignment hgap=5, vgap=0
		bottomText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));		
		
		text = new JTextField(10);
		label = new JLabel("My Text");
		label.setFont(makeSmallFont(label.getFont()));
		// Add components to the respective Panel
		topText.add(text);
		bottomText.add(label);
	}
	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");		
		setResizable(false);
	}
	public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize()-2));
    }

	
	public static void centerFrameOnDesktop(Component f) {
	        final int SHIFT_AMOUNT = 0;
	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        int height = toolkit.getScreenSize().height;
	        int width  = toolkit.getScreenSize().width;
	        int frameHeight = f.getSize().height;
	        int frameWidth  = f.getSize().width;
	        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
	    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				TextPanel tp = new TextPanel();
				tp.setVisible(true);
			}
		});
	}
	
	void showMessage(String message){
		JOptionPane.showMessageDialog(this,         									          
		          message,
		          "Error", 
		          JOptionPane.ERROR_MESSAGE); //could also be INFORMATION_MESSAGE
	}
	
	
	
	private static final long serialVersionUID = 3618976789175941431L;
}
	