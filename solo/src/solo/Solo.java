package solo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solo {
  
  
  public static void method1() {

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd");
    System.out.println(sdf);
    String result =  sdf.format(date);
    System.out.println(result);
   
    
    
  
  }
  
  public static void method2() {

  }

  public static void main(String[] args) {

    method1();
    
   
  }

}
