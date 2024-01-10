package pkg09_access_modifier;

/*
 * Getter 
 * 1. 클래스의 필드값을 외부로 반환하는 메소드이다.
 * 2. get + 필드명으로 메소드이름을 결정해야 한다. (예외 - boolean 타입은 is+필드명)
 * */

/*
 * Setter
 * 1. 외부로부터 전달된 값을 필드에 저장하는 메소드이다.
 * 2. set + 필드명으로 메소드이름을 결정해야 한다. 
 * */

public class MainClass {

  public static void main(String[] args) {

    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxybook" , 400, new Calculator()); // new Computer에서 Computer를 호출할수있는건, public이라
    
   // System.out.println(computer.model); //  불가능..필드는 private이니까
    
   //  computer.develop(); // 간적적으로 접근 가능
    
    
    
   // 필드로 값을 전달하는 메소드
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
   // 필드값을 가져오는 메소드
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    
    
    //calculator의 add()호출하기
    //System.out.println();
    
    computer.getCalculator().add();
    computer.getCalculator().add(1);
    computer.getCalculator().add(1,2);
    computer.getCalculator().add(1,2,3);
    
  }

}
