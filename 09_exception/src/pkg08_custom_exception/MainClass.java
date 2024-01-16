package pkg08_custom_exception;

public class MainClass {

  public static void main(String[] args) {
    
    try {
      
      // Integer.parseInt("12.3"); <-자바가 던지는거
      throw new MyException("예외메시지", 1000);
      //Myexception 쓰려면 직접 만들어서 던져야함
      
      
    } catch (MyException e) {
      System.out.println(e.getMessage()); 
      System.out.println(e.getErrorCode());
    }
    
  }

}
