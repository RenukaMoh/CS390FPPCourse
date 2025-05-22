//source code from the jdk
package lesson3.label2.constants;

public class Label  {
    String text;

    int alignment = LabelConstants.CENTER;
    public Label(String text, int alignment)  {
			this.text = text;
			setAlignment(alignment);
    }
    public int getAlignment() {
			return alignment;
    }
    public String getText() {
		return text;
    }

    public void setAlignment(int alignment) {
			switch (alignment) {
	  			case LabelConstants.LEFT:
	  			case LabelConstants.CENTER:
	  			case LabelConstants.RIGHT:
	    			this.alignment = alignment;
 	    			return;
			}
			throw new IllegalArgumentException("improper alignment: " +
                                               alignment);
    }
    
    public void setText(String text) {
	    	if (text != this.text && (this.text == null ||
				      !this.text.equals(text))) {
	        		this.text = text;

	  }
    }  
    
    //Label class
    public static void main(String[] args)  {
    	Label label = new Label("Hi", 1);
     	Label label1 = new Label("Hi there!", LabelConstants.LEFT);
    //	Label label2 = new Label("text", 17);
    	
    }
}
