package pkg07_polymorphism;

public class Person {

  
  public void powerOn(Elec elec) { //Elex elec = new Tv() 또는 Elec elec = new Raido();가능한 상황으로 세팅해놈
    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 
     * -> 전자제품이 추가될때마다 코드의 추가가 필요하므로 추천하지 않는다.
     * => 양 많아질수록 else if 늘어나니까 올바른 방법이 아님
     * 
    if(elec instanceof Tv) { //전달된 타입이 Tv라면
      ((Tv) elec).powerOn(); //Tv로 바꿔서 전원을 켜겠다
    }
    else if(elec instanceof Radio) {
      ((Radio) elec).powerOn();
    }
    
    */
    
    /*
     * 2.Elec 에 powerOn() 메소드를 추가하고 
     * Tv나 Radio가 오버라이드 하기
     * 하면 형변환할필요 없이
     * */
    
    elec.powerOn(); // 부모클래스에 powerOn 해.. 근데 그러면 부모크랠스에 오버라이딩 일어나니까
    
    
  }
  
  
}
