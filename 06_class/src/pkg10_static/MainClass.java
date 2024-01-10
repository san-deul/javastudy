package pkg10_static;

public class MainClass {

  public static void main(String[] args) {

    // 클래스 멤버 호출 : 클래스.멤버
    System.out.println(Calculator.maker); // 필드호출
    
    /*
    int num = Integer.parseInt("100");
    System.out.println(num);
    */ 
    
    Calculator.add(1, 3); // 메소드호출
    
    
    
    
  }

}
