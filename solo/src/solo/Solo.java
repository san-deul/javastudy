package solo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solo {
  
  
  public static void method1() {
/*
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd"); //참조값 뱉음
    System.out.println(sdf);
    String result =  sdf.format(date); // 잘뱉음
    System.out.println(result);
   
    */
    
    /*
    long timestamp = System.currentTimeMillis(); 
    System.out.println(timestamp);
    SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
    System.out.println(sdf.format(timestamp));
     */
    
    // String 을 이용한 문자열 연결 (+연산자로 )

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String result = "";
    
    
    long start = System.nanoTime();
    for(int i = 0; i < alphabet.length; i++) {
      result += alphabet[i];
    }
    long end =System.nanoTime();
    System.out.println(result);
    System.out.println("String의 + 연산자 :" + (end - start) + "ns");
  }
  


  public static void main(String[] args) {

    method1();
    
   
  }

}
