package pkg04_checked;

import java.net.MalformedURLException;
import java.net.URL;


public class MainClass {

  public static void main(String[] args) {

    // checked exception : try - catch와 같은 예외처리 코드가 없으면 동작하지 않는 예외이다.
    // try catch 가 없으면 오류가 뜬다..동작 안해....해줘
    
   // java.net.URL url = new java.net.URL("https://www.google.com/"); //import 해줘서 생략가능..
    
    
    try {
      URL url = new URL("https://www.google.com/"); 
    }catch(MalformedURLException e) {
      System.out.println("잘못된 URL입니다.");
    }

    
    
    
    
    
  }

}
