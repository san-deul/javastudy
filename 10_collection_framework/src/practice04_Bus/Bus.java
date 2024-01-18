package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
 
  // field
  private List<Seat> seats;
  public static final int LIMIT = 25;
  private int numOfPerson; // 버스에 사람 몇명탔는지 ..
  
  
  
  // constructor
  public Bus() {
    seats = new ArrayList<Seat>(LIMIT);
    for(int i = 0; i < LIMIT; i++) { //의자채우는 for문..사람채우는거 아님
       seats.add(new Seat()); 
       // seat.get(i) = new Seat()이 아니라..저렇게....add메소드있으니까
    }
  }
  
  // method
  
  // 버스 타기(앞 자리부터 채우는 방식으로 앉기)
  public void on(Person person) throws RuntimeException{
    
    if(numOfPerson >= LIMIT) {
      throw new RuntimeException("만석입니다. 버스에 탈 수 없습니다.");
    }
    for(int i = 0; i < LIMIT; i++) {
      Seat seat = seats.get(i);//seats.get(i) = 의자... 각좌석 
      
      if(seat.getPerson() == null) {        
        seat.setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  // 버스 내리기
  public void off(int seatNo) throws RuntimeException {
    if(seatNo <= 0 || seatNo > LIMIT) {
      throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
    }
    seats.get(seatNo-1).setPerson(null);
    numOfPerson--;
  }
  
  // 버스 탑승 명단
  public void info() {
    System.out.println("===== 탑승자 목록 확인 =====");
    for(int i = 0; i < LIMIT; i++) {
      // 각 좌석에 앉아 있는 사람
      Person person = seats.get(i).getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
  }
  
}
