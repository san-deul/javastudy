package pkg03_constructor;

//★부모
public class Person {

  //field
  private String name;
  
  // constructor
  public Person(String name) {
    super();
    this.name = name;
  }

  //method
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }
  
  
  
  
  
}
