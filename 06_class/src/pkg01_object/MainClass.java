package pkg01_object;

public class MainClass {

  public static void main(String[] args) {

    
    // 객체 선언
    
    Calculator calculator;
    //Calculator Calculator <이거안됨
    //타입       객체이름

    
    
    // 객체 생성
    calculator = new Calculator();
    
    
    /* 클래스에 저장된 것들(필드 and 메소드 :멤버) 을 사용하기 위해서는 
    객체필요*/
    
    // 객체를 이용해서 클래스의 멤버(필드, 메소드)를 사용할 수 있다
    // 객체.멤버
    
    calculator.number = 100;
    System.out.println(calculator.number);
    
    calculator.method();
    
  }

}
