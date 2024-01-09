package solo;

public class Solo {
  
  
  public static void method1() {

    //배열 a의 마지막 3개 요소를 배열 b의 값으로 수정하기
      int[] a = new int[] {10,20,30,0,0,0};
      int[] b = new int[] {40,50,60};
              
      a[3] = b[0] ;// 0을 기준으로 잡기
      a[4] = b[1];
      a[5] = b[2];
      
      for(int i=0;i<b.length;i++) {
        a[3+i] = b[i];
        
        System.out.println(a[i]);
      }
      
      for(int i =0;i<a.length;i++) {
     //   System.out.print("%3",a[i]);
      }
      
  }
  
  public static void method2() {

  }

  public static void main(String[] args) {

    method1();
    
   
  }

}
