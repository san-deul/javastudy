package practice02_Cup;

public class MainClass {

  public static void main(String[] args) {

    Cup cup1 = new Cup(); //빈컵
    cup1.fill(new Americano()); 
    
    Cup cup2 = new Cup(); //빈컵
    cup2.fill(new CafeLatte());
    
    
    Carrier carrier = new Carrier(2); //캐리어 두개짜리 준비
    carrier.addCup(cup1);
    carrier.addCup(cup2);
    
    
    //캐리어 정보 확인
    carrier.whoami();
    
    
    
  }

}
