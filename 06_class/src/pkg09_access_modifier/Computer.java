package pkg09_access_modifier;

public class Computer {

  // field ->같은 멤버안에서 모든 메소드가 공용으로 사용가능
  private String model;
  private int price;
  private Calculator calculator;
  
  
  public Computer(String model, int price, Calculator calculator) {
    
    this.model = model;
    this.price = price;
    this.calculator = calculator;
  }
  
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public int getPrice() {
    return price;
  }


  public void setPrice(int price) {
    this.price = price;
  }


  public Calculator getCalculator() {
    return calculator;
  }


  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }


  
  
  
 

  
 
  
  
  
  
}
