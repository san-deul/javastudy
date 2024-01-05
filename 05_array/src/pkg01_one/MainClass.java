package pkg01_one;

public class MainClass {

  public static void method1() {
    
    /*
     * 배열
     * 1. 변수 여러개를 하나의 이름으로 관리하는 자료구조이다.
     * 2. 각 변수 구분을 위해서 인덱스를 활용한다.
     * 3. 구성
     *   1) 배열이름 : 모든 변수의 대표이름
     *   2) 배열길이 : 변수의 개수
     *   3) 인덱스   : 변수를 구분하는 숫자(0부터 시작하는 정수값)
     *   4) 배열요소 : 각 변수를 의미(배열이름과 대괄호[]와 인덱스를 조합해서 사용)
     * */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열 선언과 생성과정이 모두 필요하다.
     * 2. 배열의 선언
     *    1) int[] 배열이름  ★추천 
     *    2) int 배열이름[]
     *    
     * 3. 배열의 생성
     *    new int[배열길이]
     *    
     * 4. 배열이 생성되면 배열의 모든 요소는 자동으로 초기화된다.
     *    (※ 변수는 자동초기화가 없음 . 에러남)
     *  -> 문자: 0, 실수: 0.0, boolean: false,  String :null   ->없는값
     * */
    
    
    // 배열선언
    int[] arr; //compile stack:arr[]
    //------------------
    // 배열 생성
    arr = new int[3]; //runtime ,heap: 1. 2.3.
    
    // 배열요소(배열이름 +[인덱스]), 자동초기화 0
    System.out.println(arr[0]);    
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
    
    
    
  }
  
  
  public static void main(String[] args) {

    
    method1();

    
    
    
  }

}
