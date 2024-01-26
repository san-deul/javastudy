package pkg01_abstract;

/*
 * 추상클래스
 * 1. 추상 메소드를 가지고 있는 클래스이다.
 * (abstract를 추가함으로써, Shape이 추상클래스가 됨)
 * 2. 추상 클래스는 객체 생성이 불가능하다.
 * Ex) Shape shape = new Shape(); 이제 이거 불가능...그전은 가능
 *    ->
 *    1) 익명 내부타입(Anonymous Inner Type)으로 생성할 수 있다.
 *    2) 익명 내부타입은 객체를 생성할 때 추상 메소드를 곧바로 오버라이드해서 만드는 것을 의미한다. 
 *    
 *    -->추가설명
 *    shape는 는 본문이 없는 추상메소드를 가지는 인터페이스이므로
 *    객체 생성이 불가능하지만,
 *    정말 객체 생성을 원한다면
 *    Shape shape = new Shape(){
 *      @override
 *      public void method();
 *    }
 *     바로 메소드를 오버라이드 해서 가지는 식으로 객체 생성 가능
 *     ※ but 메소드가 하나일 경우에만 가능함  
 *    
 *   
 * 3. 형식
 *    abstract class 클래스명{ }
 */
public abstract class Shape {

  // field
  private String name;
  
  
  // constructor
  public Shape() {

  }


  public Shape(String name) {
    super();
    this.name = name;
  }

  /*
  이름 확인 위한 getter
  이름 변경위함 setter
  */
  // method
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  /*
   *  추상 메소드
   * 1. 본문이 없는 메소드이다.(본문이 필요없는)
   * 2. 형식
   *    abstract 반환타입 메소드명(매개변수);
   * */
  
  // 넓이를 반환하는 메소드 - 
  public abstract double getArea();

  // 둘레 길이를 반환하는 메소드
  public abstract double getCircum();
  
  
  
}
