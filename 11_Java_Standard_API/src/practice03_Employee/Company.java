package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Company {

  //field
  private String name;//회사이름
  private List<Employee> employees; // 직원들 수 모름... 
  // new regular 와 new partime을 저장하기 위해서,Employee타입으로

  private Scanner sc;
  
  // construcotr
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
    sc = new Scanner(System.in);
  }

  
  
  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
  // 1. 고용
  public void hire(Employee employee) throws RuntimeException { //받는 정보가 new regular아니면 new partime인거임
    // 예외발생하는 경우 null이 넘어감 ___companyHandler참고
    // optional 쓰지 않음.... <?
    if(employee != null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다");
    }
    employees.add(employee);
    
  }
  
  // 2. 해고
  public void fire(int empNo) {
    
  }
  
  // 3. 조회
  public void search(int empNo) {
    
  }
  
  
  // 4. 전체조회 
  public void searchAll() throws RuntimeException{
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    //null값은 없을거임 hire에서 null이면 저장안되도록 막앗으니까
    System.out.println("전체 사원 명단");
    for(Employee employee : employees) {
      employee.info();
      System.out.println("___________________________");
    }
  }

}


// ※ company에서 발생하는 예외는 회피시킬거임