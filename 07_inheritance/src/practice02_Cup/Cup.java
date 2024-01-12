package practice02_Cup;

public class Cup {

  private Coffee coffee;// 아메리카노랑 카페라떼 담을거임.. 그러기위해서 컵필요
  /*
  public static void main(String[] args) {
    Coffee coffee = new Americano(); //업캐스팅
    coffee.whoami(); // 커피타입이니까 커피의 whoami를 호출 .... 하지만 실행은 Americano가.......호출과 실행대상이 다르다(동적바인딩)
  }*/
  
  public void fill(Coffee coffee) { //Setter임
    this.coffee = coffee;
  }
  
  public void whoami() {
    coffee.whoami();
  }
  
  
}
