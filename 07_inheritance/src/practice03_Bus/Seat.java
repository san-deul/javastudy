package practice03_Bus;

public class Seat extends Bus {
  
 private Person person;
  
 public void fill(Person person) {
    this.person = person;
    
    //여성이 앉았는지
    
  }
 
 public void whoami() {
   person.whoami();
 }
 
}
