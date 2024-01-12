package practice02_Cup;

public class Carrier {
  
  private Cup[] cups;// 컵이 여러개일테니까
  private int idx;   // cups 배열의 인덱스
  
 //new Carrier(2): 2잔, new Carrier(4)4잔
  public Carrier(int cupCount) {
    cups = new Cup[cupCount]; //배열
  }
  
  // 컵 담기
  public void addCup(Cup cup) {
    if(idx >= cups.length) {
      System.out.println("캐리어가 가득찼습니다");
      return;
    }
    cups[idx++] = cup; // 전달된 컵
    System.out.println("현재 컵:"+idx+"개, 앞으로 "+ (cups.length -idx) +"개 추가 가능");
  }
  

  // 캐리어 확인 .. 캐리어에 담겨있는 컵을 하나씩 꺼내서 확인
  public void whoami() { //캐리어에 담겨있는 컵 보여줌
    for(int i = 0; i < idx;i++ ){//컵의 길이라면, 빈칸도 보여주니까 그래서 idx쓰는거
      cups[i].whoami();   //컵에 담겨있는 커피의종류를 반복문을 돌려서 보여주겠다. 
    }
    
  }
  
  
}
