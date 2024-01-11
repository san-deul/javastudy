package practice07_Fighter;

public class Fighter {
  
  private String name;
  private int hp; 
  
 
  
  public Fighter() {
    
  }

  public Fighter(String name, int hp) {
    super();
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
  //method
  
  // hp 줄어들기
  public void minusHp(String name, int hp) {
    
      // hp가 줄어들지 않는 경우
      // hp가 0일때
      if(hp <= 0) {
        System.out.println("hp가 줄어들 수 없습니다");
        return;
      }
      
      // hp -= hp; -줄어든 hp를 어디에 담지?
  }
  
  
  
  
  
}
