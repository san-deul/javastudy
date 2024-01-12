package pkg03_constructor;

/*
 * 자식 클래스의 생성자
 * 1. 반드시 부모클래스를 가장 먼저(코드순서) 생성해야한다. !! 자식클래스 생성 먼저 안돼
 *    -> 부모 클래스의 생성자를 호출해야 한다.
 * 2. 부모 클래스의 생성자를 호출하지 않는 경우
 *    JVM이 부모 클래스의 디폴트생성자를 자동으로 호출한다
 *     (..JVM이 자동으로 호출할 수 있는건 디폴트 생성자뿐,
 *     디폴트 생성자가 아니라면 자동 호출 불가   ) 
 * 3. 부모 클래스에 디폴트 형식의 생성자가 없는 경우에는
 *    개발자가 직접 부모 클래스의 생성자를 호출해야 한다.
 * 4. 부모 클래스 생성자를 호출하는 방식
 *    super()
 * */

// ★자식클래스 Student is a Person
public class Student extends Person{

  //field
  private String school;
  
  //constructor
  public Student() {
    super(null); // Person(null)....name받을 필요 없으니까
  }
  public Student(String name) {
    //name만 받아오는 거 없어서 만들어줌
    super(name);    // 부모클래스 불러옴...Person(name)
  }
  
  public Student(String name, String school) {
    super(name); // super호출 최우선 먼저!!!!!!!..Person(name)
    this.school = school;
   
  }
  
  //
  
  
  
  
  //method
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }
  
  
  
  
  
}
