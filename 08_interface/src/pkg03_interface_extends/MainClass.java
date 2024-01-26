package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();
    
    
    
    Computer computer = new SmartPhone();
    //computer.powerOn();
    //computer.game();
   // ((SmartPhone) computer).call();
    
    
    
    Phone phone = new SmartPhone();
    //phone.call();
    //((SmartPhone) phone).powerOn();
    //((SmartPhone) phone).game();
    
    
    SmartPhone smartPhone = new SmartPhone();
    //smartPhone.powerOn();
    //smartPhone.game();
    //smartPhone.call();
    
    
  }

}
