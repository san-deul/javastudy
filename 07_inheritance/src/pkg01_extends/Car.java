package pkg01_extends;


// ★부모 클래스 : 슈퍼클래스
// 부모: 공통기능

public class Car {
  
  private String model; // private은 자식도 못본다.
  protected String maker; //protected는 자식에게 오픈한다.
  
  
  public void forward() {
    System.out.println("앞으로");
  }
  
  public void reverse() {
    System.out.println("뒤로");
  }
  
  public void stop() {
    System.out.println("멈춤");
  }

}
