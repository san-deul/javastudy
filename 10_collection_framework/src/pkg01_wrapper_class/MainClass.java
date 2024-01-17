package pkg01_wrapper_class;

public class MainClass {

  public static void main(String[] args) {

    //Wrapper class:Wrpping한 거. 기본타입 8가지
    // Auto Boxing (기본 타입 값 -> Wrapper 타입) ..기본타입값을 Wrpper타입으로 감싼거
    
    Integer num = 10; // 타입이 Integer
    
    
    // Auto UnBoxing (Wrapper 타입 -> 기본 타입 값) 
    int iNum = num;
    
    
    System.out.println(iNum);
    
    
  }

}
