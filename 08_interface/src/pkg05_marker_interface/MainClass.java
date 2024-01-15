package pkg05_marker_interface;

public class MainClass {
  
  
  public static void main(String[] args) {
    
    Person person = new Person();
    person.eat(new AppleMango());
    person.eat(new PineApple());
    person.eat(new Durian());
    
    DurianHatePerson durainHatePerson = new DurianHatePerson();
    durainHatePerson.eat(new AppleMango());
    durainHatePerson.eat(new PineApple());
   // -> durainHatePerson.eat(new Durian()); // 컴파일 오류 // Eatable이용함으로써 아예 안받음.
    
  }
  
  
  
}
