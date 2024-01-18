package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
  /*
   * HashMap
   * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
   * 2. 구성
   *    1) Key    : 데이터 식별자, Set으로 구성되어 있다.(순서 없고 중복 없다)
   *    2) Value  : 데이터 자체
   *    3) Entry  : Key 와 Value 를 합쳐서 부르는 말이다.
   *    
   */
  
  public static void method1(){
    
    // Mutable 객체(값이 변할 수 있는 객체)
    
    // HashMap 선언 - key, value 타입 뭔지 다 정해야함.
    Map<String, Object> book;
    
    // HashMap 생성
    book = new HashMap<String, Object>();
    
    // Key, Value 추가(Entry 추가)
    book.put("title", "어린왕자");
    book.put("author", "생텍쥐베리");
    book.put("isBestSeller", true);
    book.put("price", 10000);
    
    
    // key를 이용해서 Value확인하기
    System.out.println("title: " + book.get("title"));
    System.out.println("author: " + book.get("author"));
    // System.out.println(book.get("isBestSeller") ? "베스트셀러" : "일반서적");
    // book.get("isBestSeller") ? "베스트셀러" : "일반서적" < 오류...타입이object니까...true,false를 담은 object일뿐,
    //boolean은 아님
    System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적");
    // 캐스팅해라 boolean으로
    System.out.println("price: " + book.get("price")+"원");
  }

  public static void method2() {
   
    // Immutable 객체 (값을 바꿀 수 없는 객체) - 값의 변조를 막기위함
    // 어디론가 전달할 ㄸㅐ immutable객체로 전달하면 안전
    
    // ※ 어떤 메소드의 호출결과를 Map으로 반환할때..쓰기 좋음
    Map<String, Object> map = Map.of("name", "홍길동");
    
    //값을 바꾸려는 시도........   안돼. 추가,삭제도 안돼!!!!!
   // map.put("age", 10);
    System.out.println(map.get("name"));
    
    
  }

  public static void method3() {
    
    // Key 는 Set으로 되어있다.
    
    
    
    Map<String, Object> map = Map.of("name","홍길동", "age", 10, "isMarried", false);
    
    Set<String> keys = map.keySet();
    
    
    for(String key : keys) {
      System.out.println(key + ":" + map.get(key));
    }
    
  }
  public static void method4() {
    
    // ★ 추천
    // Entry 전체를 Set 로 만들 수 있다.
    // Entry 를 일일이 분리해서 Set로 옮길 수 있다
    // iterable한 순환을 위해서
    
    Map<String, Object> map = Map.of("name","홍길동", "age", 10, "isMarried", false);
    
    Set<Entry<String, Object>> entrySet = map.entrySet();
    for(Entry<String, Object> entry : entrySet) {
      System.out.println(entry.getKey()+":"+entry.getValue());
    }
  }

  public static void method5() {
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    // 처음 입력되는 Key는 추가된다. .. 
    map.put("name", "홍길동");
    map.put("age", 10);
    map.put("isMarried", false);
    
    // 다시 입력되는 Key는 수정을 의미한다. ..한번사용된적있으면 수정
    map.put("age", 20);
    
    // 삭제
    map.remove("isMarried");
    
    System.out.println(map);
    
    
  }
  
  
  
  public static void main(String[] args) {
    method3();
  }

}
