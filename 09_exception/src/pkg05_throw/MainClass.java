package pkg05_throw;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * throw
     * 1. 직접 예외객체를 만들어서 던질때 사용한다.
     * 2. 자바가 자동으로 던지지 않는 예외들은 throw문으로 직접 던져야 한다.
     * */
    
    
    try {
      
      int score = -1; // 0 ~ 100
      char grade;
      
      if(score < 0 || score > 100) { //잘못된 점수니까, catch로 던질거임
        throw new RuntimeException();//인자
        // 1. 직접예외객체를 만들어서 던지는데, 보통 만들어진 객체 없으면 RuntimeException() 추천
        // 던지면 catch의 매개변수로 갈거임
      }
      
      if(score >= 90 )
        grade = 'A';
      else if(score >= 80)
        grade = 'B';
      else if(score >= 70)
        grade = 'c';
      else if(score >=60)
        grade = 'D';
      else
        grade ='F';
    
      System.out.println("점수: " + score + "점, 학점" + grade + "학점");
    
    }catch(Exception e) {// 매개변수..... Exception e = new RuntimeException(); <-말이 되니까 문제없는 코드...업캐스팅
      
      System.out.println("잘못된 점수입니다.");
      
    }
    
    
    
    
  }

}
