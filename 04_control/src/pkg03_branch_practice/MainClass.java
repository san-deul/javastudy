package pkg03_branch_practice;

public class MainClass {
  
public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 6;
    
    if(month < 0 || month >= 13  ) {
      System.out.println("잘못된 값입력");
    } else if( month <= 2 || month == 12 ) {
      System.out.println("겨울");
    } else if( 3 <= month && month <= 5 ) {
      System.out.println("봄");
    } else if(6 <= month  && month <= 8) {
      System.out.println("여름");
    } else if(9 <= month  && month < 12) {
      System.out.println("가을");
    }
    
    
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 70;  // 점수
    int grade = 5;   // 학년
    
    if(score >= 60) {
      if(grade <= 4 ) {
        System.out.println("합격");
      }else {
        System.out.println("불합격");
      }
    }else {
      System.out.println("불합격");
    }
    
    /*
    if( score >= 70) {
      if(grade < 0 || grade >6 ) {
        System.out.println("올바른 값입력");
      }else if(grade >= 4) {
        System.out.println("합격");
      }else {
        System.out.println();
      }
    }else {
     if(grade < 4) {
       System.out.println("합격");
     }else {
       System.out.println("");
     }
    }*/
    
  }
  
  public static void method3() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
   
    
    //System.out.println(weekName);
    
  }

  public static void main(String[] args) {
    method2();
  }

}
