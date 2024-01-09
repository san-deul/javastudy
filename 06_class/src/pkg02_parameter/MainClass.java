package pkg02_parameter;

public class MainClass {

  public static void main(String[] args) {

    // 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    // 메소드 호출
    calculator.method1();
    //주는 곳 :인수,인자,arguments
    
    
    //main 만 jvm이 호출, 나머지 메소드는 내가호출
  
    int a = 10;
    calculator.method2(a);
  
    
    calculator.method3("hello world");
    
    
    calculator.method4(1.5, 1.2);
    
    
    calculator.method5(a);
    
    // 가변 인자
    //몇개를 주든 상관없는데, 타입은 같아야함!!!!
    calculator.method6(1);
    calculator.method6(1,2);
    calculator.method6(1,2,3);

   
    
    // 배열 인자
    /* 1.선언해서 넘기는 과정
    int[] arr= {10,20,30};
    calculator.method7(arr);
   */
    //2. 그냥 바로 넘기는 과정
    calculator.method7(new int[] {10,20,30});
    
    
    
    
    // 객체 인자
    // 1.Adder 타입의 adder객체를 전달
    // -객체 만들어져있으면, 직접 전달
    // Adder adder = new Adder();
    // calculator.method8(adder);
    
    // 2. Adder타입의 객체를 전달
    // -안만들어져있으면, new를 이용해서 전달
    calculator.method8(new Adder());
  }

}



















