package solo;

public class MainClass {

  public static void main(String[] args) {
    Employee emp = new Employee(1, "기본1");
    
    
   //emp.info();
   
   
   Regular reg = new Regular(2, "기본5", 5000 );
   
   
   reg.info();
   emp.info();
   
  }

}
