package pkg04_override;

// ★ 자식

// 메소드 오버라이드
// 1.자식 클래스가 부모 클래스의 메소드를 다시 만드는 것
// 2. 메소드 앞에 @Override annotation을 추가한다. (필수는 아님...그러나 권장!!)
// 3. 똑같이(반환타입, 메소드명, 매개변수) 만들어야 한다.



public class WhiteMix extends Kanu{
  
//일반적으로 이렇게 코드.....  
  @Override // 오버라이드한 메소드라고 JVM에게 알려준다.(부가적으로 다른 개발자에게도 알려준다.)
  public void color() { //부모거(kanu)랑 똑같이 만들었음..
    System.out.println("커피색");
  }
// 자동화 기능 쓰셈..
 
  
}
