package pkg05_upcasting;

public class MainClass {

  public static void main(String[] args) {

    /*
     * 업캐스팅
     * 1. 자식 타입의 객체를 부모 타입으로 바꿀 수 있다.
     * 2. 자동으로 변환된다.
     * 3. 부모가 가진 멤버만 호출할 수 있다.
     */
    
    // 부모 타입 선언
    Computer computer;
    
    // 자식 타입 생성
    computer = new Tablet();
    //->타입은 부모..실제론 자식

    
    
    
    
    // 별도의 타입 변환 없었음
    // 부모타입으로 변환되면 부모의 메소드만 호출 할 수 있다.
    // tablet거 호출 못해....computer.screentouch, portable 안 불려...
    computer.internet();
    computer.game();
    
    
    
    
    
  }

}
