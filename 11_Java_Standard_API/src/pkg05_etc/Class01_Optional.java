package pkg05_etc;

import java.util.Optional;

public class Class01_Optional {

  public static void main(String[] args) {
   
    // Optional<T> : T 타입의 데이터를 감싸는 클래스
    
    // 1. null 값이 없는 데이터 -of
    String str1 = "사과";
    Optional<String> opt1 = Optional.of(str1); // 사과를 봉지로쌈
    System.out.println(opt1.get()); //가져와서 꺼내먹음?
    
    // 2. null 값이 있는 데이터 (배우는 목적) ★
    String str2 = null;
    Optional<String> opt2 = Optional.ofNullable(str2);
    System.out.println(opt2.orElse("바나나"));//없으면 바나나를 꺼내라.....
    
  }

}
