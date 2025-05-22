package lesson6.slidecodes;

public class InclassEx2 {
	private int data = 10;   
    public static void main(String[] args) {    
    	InclassEx2 outer = new InclassEx2(); 
        outer.printVal(20);     
    }
    void printVal(int bound) {
    	if(data < bound) { 
    		//Notice Inner is not accessible outside if block
            class Inner {       
                public int getValue() {   
                	//bound = bound + 10;
                    return data;
                }
            }
            Inner inner = new Inner();
            System.out.println("Inside inner: " + inner.getValue());
        } else {
            System.out.println("Inside outer: " + (data - bound));
        }
    }
}
