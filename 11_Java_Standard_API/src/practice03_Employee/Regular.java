package practice03_Employee;

public class Regular extends Employee {
  
  //field
  private int salary; // 기본급

  // constructor
  public Regular(int empNo, String name) {  //사번,이름 받아옴
    super(empNo, name);
  }

  public Regular(int empNo, String name, int salary) { //사번,이름,월급까지
    super(empNo, name);
    this.salary = salary;
  }

  // method
  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

 
  /*
  Employee emp = new Regular(1,"aaa");
  emp.setSalary(5000);
  emp.info(); ->이름,사번만 나옴...월급 안나옴
  그래서..regular에서 재정의할거야!!
  */
  @Override
  public void info() {
    super.info(); // 부모거 상속
    System.out.println("연봉 :" + salary);
  }
  
  
  
  
  
  
  
  
  
}
