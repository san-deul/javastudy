package pkg01_one;

public class MainClass {

  public static void method1() {

    /*
     * 배열 1. 변수 여러개를 하나의 이름으로 관리하는 자료구조이다. 2. 각 변수 구분을 위해서 인덱스를 활용한다. 3. 구성 1) 배열이름
     * : 모든 변수의 대표이름 2) 배열길이 : 변수의 개수 3) 인덱스 : 변수를 구분하는 숫자(0부터 시작하는 정수값) 4) 배열요소 : 각
     * 변수를 의미(배열이름과 대괄호[]와 인덱스를 조합해서 사용)
     */

    /*
     * 배열의 선언과 생성 1. 배열 선언과 생성과정이 모두 필요하다. 2. 배열의 선언 1) int[] 배열이름 ★추천 2) int 배열이름[]
     * 
     * 3. 배열의 생성 new int[배열길이] //heap 이라는 영역에 메모리를 할당해줌
     * 
     * 4. 배열이 생성되면 배열의 모든 요소는 자동으로 초기화된다. (※ 변수는 자동초기화가 없음 . 에러남) -> 문자: 0, 실수: 0.0,
     * boolean: false, String :null ->없는값
     * 
     */

    // 배열선언
    int[] arr; // compile stack: arr[]
    // ------------------
    // 배열 생성
    arr = new int[3]; // runtime ,heap: 1. 2.3.

    // 배열요소(배열이름 +[인덱스]), 자동초기화 0
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

  }
  
  public static void method2() {
    
    /*
     * 배열 초기화
     * 1. 배열을 선언할 때 초기화 값들을 전달할 수 있다.
     * 2. 형식
     *    1) int[] 배열이름 =  new int[]{ 값1, 값2, 값3, ... }  // 메소드를 전달할땐 이거 사용
     *    2) int[] 배열이름 = { 값1, 값2, 값3, ... }
     * */

    // 배열 선언 및 초기화
      
    int[] arr = new int[] {10,20,30,40,50};   // new int[] 는 생략가능
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
    
    // 배열쓰려면 for문이 필수처럼 따라다님
    
    
  }
  
  public static void method3() {
    
    /*
     * 배열 길이
     * 1. 배열 요소의 개수를 의미한다.
     * 2. 배열이 생성된 이후에는 수정할 수 없다. 
     * 3. 배열 길이 필드값
     *    배열이름.length    <-배열길이 확인
     * */
    
    
    
    // 배열 선언 및 초기화
    int[] arr = {10,20,30,40,50};
  
    
    // 배열의 길이 확인
    System.out.println(arr.length);
  // ※ 메서드()<-기능, 필드<-값
    
    
    
    // 배열과 for
    // for(int i = 0; i <=4) <가능은하지만, 이렇게 쓰지마!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\
    // 관례니까 ↓ 이렇게 써!!!!!!!!!
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
      
    
  }
  
  
  
  public static void method4() {
   /*
    * 배열의 길이를 늘이는 방법
    * 1. 새로운 배열을 만든다.
    * 2. 기존 배열 요소를 모두 옮긴다.
    * 3. 새로운 배열의 참조값을 가져온다.
    * 
    * */

    int[] a = new int[] {10, 20, 30};
    
    int[] b = new int[10];

    for(int i = 0; i < a.length;i++) {
      b[i] = a[i];
      // 현재 b[i] = 10 20 30  0 0 0 0 0 0 0
      // 현재 a[i] = 10 20 30 
      // a[i]를 10 20 30 0 0 0 0 0 0 0 로 바꾸고싶음
    }

     a = b; // b를 a로 보냄
    
    for(int i =0; i< a.length;i++) {
      System.out.println(a[i]); // 10 20 30  0 0 0 0 0 0 0
    }
    
  }
  
  public static void method5() {
    
    // ★advanced for
    // for(변수 : 배열) {}
    
    int[] arr = new int[] {10,20,30,40,50};
    for(int number : arr) {
      System.out.println(number);
    }
  }
  
  public static void main(String[] args) {
    method5();
  }
  
  

  
  
  
  
  
  
}

















