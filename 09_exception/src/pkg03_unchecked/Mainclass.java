package pkg03_unchecked;

public class Mainclass {

  public static void main(String[] args) {

    // unchecked exception : try - catch문이 없어도 동작하는 예외클래스로 RuntimeException을 의미한다.
    
    int mok = 5 / 0;
    System.out.println(mok);
    
    
    
  }

}
