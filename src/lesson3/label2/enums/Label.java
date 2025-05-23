//source code from the jdk
package lesson3.label2.enums;

public class Label  {

    String text;
    Alignment alignment = Alignment.LEFT;
    public Label(String text, Alignment alignment)  {
			this.text = text;
			this.alignment = alignment; //no need to validate argument
    }
    public Alignment getAlignment() {
			return alignment;
    }
    public String getText() {
		return text;
    }

    public void setAlignment(Alignment alignment) {
    	this.alignment = alignment;
    }
    
    public void setText(String text) {
	    	if (text != this.text && (this.text == null ||
				      !this.text.equals(text))) {
	        		this.text = text;
	  }
    }  
    
    //Label class
    public static void main(String[] args)  {
    	
    	Label label = new Label("Hi there!", Alignment.LEFT);
    	Label label2 = new Label("text", Alignment.RIGHT);
    	label.setAlignment(Alignment.LEFT);
       // label.setAlignment(12);
    	//Can access instance variables that 
    	//are visible with "dot" notation
    	System.out.println("Alignment: " + label.alignment);
    	//Better to access data using getters
    	System.out.println("Alignment: " + label.getAlignment());
    	System.out.println("Text: " + label.getText());
    }
}
