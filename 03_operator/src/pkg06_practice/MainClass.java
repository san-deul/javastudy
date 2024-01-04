package pkg06_practice;

public class MainClass {

  public static void method1() {
    
    int second = 90;
    int m = second / 60; // 1    분 -> 60초 = 1분
    int s = second % 60; // 30   초 -> 
    
    System.out.println("m="+ m);
    System.out.println("s="+ s);
    
  }
  
  public static void method2() {
    // x와 y의 값을 교환하기
    int x = 10;
    int y = 20;
    int temp;
    
    temp = x;
    x = y;
    y = temp;
    
    
    System.out.println("x="+ x);  // 20
    System.out.println("y="+ y);  // 10
  }
  
  public static void method3() {
    
    // 점수가 90점대이면 true 아니면 false
    int score = 90;
    
    // 90점 이상 그리고 100점 미만
    // 방법 1.
    boolean result1 = score >= 90 && score < 100;
    System.out.println(result1);

    // 방법 2.
    // 10으로 나눈 몫이 9인 수
    boolean result2 = (score / 10) == 9;
    System.out.println(result2);

  }
  
  public static void method4() {
    
    // 짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 0이 아닌 수
    int n = 0;
    String result = n % 2 == 0 ? "짝수" : "홀수";
    System.out.println(result);
    
    
  }
  
  
  public static void main(String[] args) {
    
    // 메인메서든 jvm이 실행... 그러나 jvm은 main메서드만 실행시킴
    // 나머지 main 메서드를 제외한 메서드는 인간이 실행시켜야함... 그러기에 main메서드 안에 메서드들을 넣어서 jvm이 실행시키도록해라
    
    //method1();
    //method2();
    //method3();
    //method4();

  }

}
