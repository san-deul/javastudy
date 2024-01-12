package pkg01_extends;

// 부모는 오직 only one 부모 둘 X....다중상속 불가

//부모자식 만드는법: class 자식 extends 부모{ }
// class 서브 extends 슈퍼 {}


//수업시간 중 슈퍼는 < 부모를 얘기하는 거임

//★자식클래스 : 서브클래스


public class Ev extends Car{
//extends car을 함으로써 부모 메소드 다 가져온거임  
// 호출 가능한 메소드는 부모(3)+자식(1)
//부모의 private feild의 경우, 상속 X
// protected는 자식 클래스의 접근 허용
  
  
  public void charge() {
    
    //System.out.println(model); //부모의 private 에는 접근 불가
    System.out.println(maker);   // 부모의 protected에는 접근 가능
    System.out.println("충전");
  
  }
  
}
