package practice03_Bus;

public class Bus {
 
  private Seat[] seats;
  private int idx;
  
  public Bus(int seatCount) {
    seats = new Seat[seatCount];
  }
  
  //좌석 담기
  public void addSeat(Seat seat) {
    if( idx >= seats.length ) {
      System.out.println("사람이 다 찼습니다");
      return;
    }
    seats[idx++] = seat;
    System.out.println("현재 좌석:"+idx+"개, 앞으로"+(seats.length -idx)+"개 추가 가능");
  }
  
  // 좌석 확인
  public void whoami() {
    for(int i = 0; i< idx; i++) {
      seats[i].whoami();
    }
  }
  
}
