package db.dao;

public class MainClass {

  public static void main(String[] args) {
    
    //UserDao 클래스의 getInstance 메소드 호출
    
    
    // 메소드 호출 방법
    // 1. 객체가 메소드를 부름 객체.메소드()... private때문에 못부름
    // 2. 클래스가 메소드를 부름 클래스.메소드() ... static이 있어야 함
    
    // static은 static만 부를 수있음
    // 클래스메소드 :static붙은거
    
    // ★ Dao는 싱글톤처리함!!!
    // UserDao.getInstance()
    
    // DB작업은 하나의 객체만 하도록.. (중간에 꼬일수 있으니까)
    
    
    
  }

}
