package pkg04_Consumer;

import java.util.function.Consumer;

public class MainClass {

  /*
   *  java.uill.function.Consumer 
   *  
   *  1. 형식
   *  public interface Consumer<T> {
   *    void accept(T t);
   *  }
   *  
   * 2. 파라미터 O, 반환X,  형식의 accept() 메소드를 지원하는 함수형 인터페이스이다.
   * 
   *    
   */
  
  public static void method1() {
    Consumer<String> consumer = (name) -> System.out.println(name + "님");
    consumer.accept("tom");
  }
  
  public static void method2(Consumer<String> consumer) { //밑에서 보낸거 받음
    consumer.accept("tom");
  }
  
  public static void main(String[] args) {
    
    //method1();
    method2((name)-> System.out.println(name+"님")); //얘를 method2로 보냈고,
    
    
  }

}
