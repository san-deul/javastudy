package pkg07_constructor;

public class Computer {

  // field ->같은 멤버안에서 모든 메소드가 공용으로 사용가능
  String model;
  int price;
  Calculator calculator;
  
  // 생성자는 보통field와 method 사이에
  // 필드초기화를 위해 만들거임...생성자는!
  //constructor 생성자...이거있으니까 이제 default생성자 안쓸거임
  Computer(){
     System.out.println("Computer()");
  }
  
  Computer(String _model, int _price){
    model = _model;
    price = _price;
  }
  
  Computer(String _model, int _price, Calculator _calculator){
    model = _model;
    price = _price;
    calculator = _calculator;
  }
  
  
  // method
  void develop() {
    System.out.println(model+"이용해서 개발중");
  }
  
  void danggeun() {
    System.out.println(price / 100 * 60 + "원에 쿨거래");
  }
  
 
  
  
  
  
}
