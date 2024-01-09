package pkg03_return;

public class MainClass {

  public static void main(String[] args) {

    // Calculator 타입의  calculator 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    calculator.method1(); // 반환값의 잘못된 호출이라고 볼 수 있음..그냥 10; 이 달랑 오는 거니까
   /*반환값이 있을시에는, 메소드의 호출만 있어선 안된다. 반환값을 사용하지 않았으니! 
    반환값을 사용할 수 있는 어떤 형태의 알파코드가 필요
    */
    
    //반환값의 호출 예시
    System.out.println(calculator.method1());
    System.out.println(calculator.method1() == 10 ? "십이다." : "십이아니다.");
    int a = calculator.method1();
    System.out.println(a); 
    
    
    
    // int[] 반환 받기
    //1.
    int[] arr = calculator.method2();
    for(int n : arr) {
      System.out.println(n);
    }
    
    //2.
    for(int n : calculator.method2()) {
      System.out.println(n);
    }
    
    
    
    // Adder 객체 반환 받기
    System.out.println(calculator.method3().add(1, 2, 3));
    //calculator.method3() 가 new Adder()로 바뀜
    
    
  }

}
