package pkg01_try_catch;

import javax.management.RuntimeErrorException;

public class MainClass {

  
  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "12.3"; //정수쓰랫는데 실수썻어...예외 발생
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
    
  }
  
  public static void method2() {
    
    // 예외 처리 : try - catch
    
    try {
      
      String userInput = "12.3";
      int number = Integer.parseInt(userInput); // 예외가 발생하면 jvm이 던짐...
      
      System.out.println(number);
    
    } catch(NumberFormatException e) { //던져진 예외 catch가 받아서 e에 저장함

      //catch문 비워두지 말기
      System.out.println("정수만 입력하세요.");
    }
    
    
  }
  
  public static void method3() {
    
    String[] userInputs = {"10","20","1.5","2.5","30"};
    
    for(int i = 0; i<userInputs.length; i++) {
      try { //실행하고픈 코드
        
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
        
      }catch(NumberFormatException e) { //예외발생시
        
        System.out.println(userInputs[i] + "는 정수가 아닙니다.");
      }
    }
        
  }
  
  public static void method4() {
    
    
     //다중 catch 블록
      String[] userInputs = {"10","20","15","25","30"};
      
      try { 
        for(int i = 0; i < 6; i++) {
          
          int number = Integer.parseInt(userInputs[i]);    // userInputs[5] 가 없어서 예외발생
          System.out.println(number);
          
        }
      }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("사용할수 없는 인덱스가 사용되었습니다.");
      }catch(RuntimeException e) {// runtime얘가 부모라 얘에서 받음...밑에 array까지 안가 
        System.out.println("정수만 처리할 수 있습니다");
      }
      
      //해결책: 순서바꿔. 부모를 밑에다. 자식이 위로
      
  }
  
  
  public static void main(String[] args) {
    method4();
  }

}
