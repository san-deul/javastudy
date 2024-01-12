package practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {

    // punch() 메소드 만들기
    //fighter2.punch(fighter1, 20);
    //fighter2가 fighter1 에게 펀치를 날려서 20hp 가 줄어듦
    
    // Fighter1
    Fighter fighter1 = new Fighter("정찬성",100);
    
    // Fighter2
    Fighter fighter2 = new Fighter("김동현",100);
    
    
    //turn
    boolean myTurn = true;
    
    //keep fight until KO
    while(fighter1.isAlive() && fighter2.isAlive()) {
      if(myTurn) {
        fighter1.punch(fighter2,20);
      }else {
        fighter2.punch(fighter1, 10);
      }
   
      myTurn = !myTurn;
    }
     if(fighter1.isAlive()) {
       System.out.println(fighter1.getName()+"승리를 축하합니다");
     }else {
       System.out.println(fighter2.getName()+"승리를 축하합니다.");
     }
        
    
  }

}
