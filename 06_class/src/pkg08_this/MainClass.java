package pkg08_this;

public class MainClass {

  public static void main(String[] args) {
    
    Computer computer = new Computer(); // default생성자 사용
  
    System.out.println(computer);
    computer.showThis();
    
    System.out.println(computer.model);
    computer.showModel();


  }

}

// 여기선 this 못씀.. this가 MainClass가 되니까... 그러니까 computer만들었으니 이름(computer)을 이용해서 

