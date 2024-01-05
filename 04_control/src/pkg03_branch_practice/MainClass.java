package pkg03_branch_practice;

public class MainClass {
  
public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 6;
    String season;
    
    int mod = month % 12;
    
    /*
    if( 3 <= month && month <= 5 ) {
      //System.out.println("봄");
      season = "봄";
    }  else if(6 <= month  && month <= 8) {
      season = "여름";
    } else if(9 <= month  && month <= 11) {
      season = "가을";
    } else {
      season = "겨울";
    }
    */
    
    
    if( mod <= 2 ) {
      //System.out.println("봄");
      season = "겨울";
    }  else if(mod <= 5) {
      season = "봄";
    } else if(mod <= 8) {
      season = "여름";
    } else {
      season = "가을";
    }
   
    System.out.println(season);
    
    
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60;  // 점수
    int grade = 5;   // 학년
    /*
    if(score >= 60) {
      if(grade <= 4 ) {
        System.out.println("합격");
      }else {
        System.out.println("불합격");
      }
    }else {
      System.out.println("불합격");
    }*/
    
    // 합격점수
    int pass = 0;
    if(grade >= 1 && grade <=3) {
      pass =60;
    }else if(grade >=4 && grade <=6) {
      pass = 70;
    }
    
    // 합격/불합격
    String result = null; // (아무것도 가르키지 않는 참조자료형의 초기값)
    if(score >= pass) {
      result = "합격";
    }else {
      result = "불합격";
    }
    
    System.out.println(result);
    
    
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
    int nDay = 5;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    // day의 nDay일 후
    day += nDay;
    
    // day를 7로 나눈 나머지
    int mod = day % 7;
    if(mod == 0) 
      weekName = "일";
    else if(mod == 1)
      weekName = "월";
    else if(mod == 2 )  
      weekName = "화";
    else if(mod == 3)
      weekName = "수";
    else if(mod == 4)
      weekName = "목";
    else if(mod ==5)
      weekName = "금";
    else
      weekName = "토";
    
    
    System.out.println(weekName);
    
  }

  public static void method4() {
  
  // 메뉴에 따른 가격
  // 아메리카노 : 1000 
  // 카페라떼   : 2000
  // 밀크티     : 3000
  // 기타       : 5000
  
  
  String order = "";
  int price = 0;
  
  switch(order) {
  case "아메리카노":
    price = 1000;
    break;
  case "카페라떼":
    price = 2000;
    break;
  case "밀크티":
    price = 3000;
    break;
  default:
    price = 5000;
  }
  
 System.out.println(price);
  
}

  public static void main(String[] args) {
    method4();
  }

}
