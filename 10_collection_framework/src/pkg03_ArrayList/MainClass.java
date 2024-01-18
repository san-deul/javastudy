package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  /*
   * ArrayList 클래스
   * 1. 배열리스트를 구현한 클래스이다.
   * 2. 실무에선 배열 대신 사용한다.
   * 3. 배열의 특징을 그대로 가지고 있다.
   *    1) 순서대로 데이터가 저장된다.
   *    2) 인덱스를 가지고 있다.
   */
  
  public static void method1() {
    
    // ArrayList 선언 ( 사용 가능 타입 : Collection<E> , List<E>, ArrayList<E>)
    List<Integer> numbers; // int[] numbers; 얘랑 같은 거
    
    // ArrayList 생성
    numbers = new ArrayList<Integer>(); // numbers = new int[10];
    
    // 요소 추가하기..54321
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    
    // 각 요소 가져오기
    System.out.println(numbers.get(0));   //5
    System.out.println(numbers.get(1));   //4
    System.out.println(numbers.get(2));   //3
    System.out.println(numbers.get(3));   //2
    System.out.println(numbers.get(4));   //1
    
  }
  
  public static void method2() {
    
    // ArrayList 선언 및 생성
    List<String> hobbies = new ArrayList<String>();
    
    // 요소 추가하기
    hobbies.add("게임"); 
    hobbies.add("영화"); 
    hobbies.add("수영"); 
    hobbies.add("ㅇㅇ"); 
    hobbies.add("dd"); 
    
    System.out.println(hobbies.size());
    
    //for문
    for(int i = 0, size = hobbies.size(); i < size; i++) { // i < hobbies.size() 하지 말것..
      System.out.println(hobbies.get(i)); 
    }
  }
  
  public static void method3() {
       
    //배열을 List로 바꾸기
    Integer[] arr = new Integer[] {10,20,30};
    
    //배열을 List로 바꿔서 반환하는 java.util asList 클래스의 asList
    List<Integer> numbers = Arrays.asList(arr);
    
    //주의사항
    // numbers는 길이를 변경할 수 없다. (추가, 삭제 불가)
    System.out.println(numbers.toString());    // <???????????????????????? 얘 뭐엿지?
    System.out.println(numbers); //toString 메소드 생략가능
    
  }
  
  public static void method4() {
    //arraylist를 List로 만듦
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄"); 
    seasons.add("여름"); 
    seasons.add("파인애플");
    seasons.add("피자"); 
    seasons.add("겨울"); 
    
    // 요소 수정..set
    seasons.set(2, "가을");
    
    // 요소 삭제..
    String removeItem = seasons.remove(3);
    System.out.println(removeItem);
    
    System.out.println(seasons);
    
    
    
  }
  
  
  public static void main(String[] args) {

    method4();
    
  }

}
