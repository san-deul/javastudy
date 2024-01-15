package pkg01_abstract;

public class Circle extends Shape{
  
  
  // field
  private double x;
  private double y;
  private double radius;
  
  // constructor
  public Circle() {
    // super();      -> shape(){ } 생성자 호출, 디폴트 생성자는 호출을 생략할 수 있다. 
  }

  public Circle(String name, double x, double y, double radius) {
    super(name); // Shape(String name) { } 생성자 호출하는 코드...이름을 받아와서 shape으로 호출?
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  // method
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  /*
   * Shape에서 abstract를 추가함으로써,
   * 추상메소드는 반드시!!! 오버라이드 해야 한다. 안하면 오류!!!
   * */
  

  @Override
  public double getArea() {
    //return super.getArea(); <-불필요해서 제거
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double getCircum() {
    return 2 * Math.PI * radius;
  }
  
  
  
  
}
