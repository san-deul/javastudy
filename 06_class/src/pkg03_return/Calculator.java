package pkg03_return;

public class Calculator {

  // 반환값 : 메소드 실행 결과값
  
  // void :반환값이 없음 

  // int 반환 메소드
  
  int method1() {
    return 10;
  }
  

//반환값이 2개일때, 배열이용해서 반환
  // int[] 반환 메소드..
  
  int[] method2() {
    
    //1.int[] arr = {10,20};
    //return arr;
    //2.
    return new int[] {10,20};
  }
  
  
   // Adder 타입 객체 반환 메소드
    Adder method3() {
      //두줄짜리:Adder adder = new Adder(); return adder;
      return new Adder();
    
    }
  
}
