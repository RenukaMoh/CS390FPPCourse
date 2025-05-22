package lesson12.exceptionsdemo;

public class Below18AgeException extends Exception {
   public Below18AgeException(String msg){
      super(msg);
   }
    public Below18AgeException(){
        super();
    }

}
