package practice03_Employee;

import java.util.Objects;

public class Employee {
  
  // field
  private int empNo;
  private String name;
  
  //constructor
  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public Employee(int empNo, String name) {
    super();
    this.empNo = empNo;
    this.name = name;
  }

  // method
  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  // 연봉계약
  // 시급계약
  
  public void info() {
    System.out.println("사원번호 : " + empNo);
    System.out.println("사원명 : " + name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empNo);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    /*if (getClass() != obj.getClass())
      return false; 
      클래스 비교 코드...다른클래스로 인식해서, 지움*/
    Employee other = (Employee) obj;
    return empNo == other.empNo;
  }
  //객체간 비교할 준비가 됨..
  
}
