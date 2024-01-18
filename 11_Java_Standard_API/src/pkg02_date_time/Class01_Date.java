package pkg02_date_time;

import java.util.Date;

public class Class01_Date {

  public static void main(String[] args) {

    
    Date date1 = new Date(); // 오늘..지금
    System.out.println(date1);
    
    
    Date date2 = new Date(1000 * 60 * 60 * 24 * 30L); 
    //  1970년 1월 1일이 시작임 ...1970년 1월 31일
    
    System.out.println(date2);
  }

}
