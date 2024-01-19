package practice03_Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

// 회사 처리기
public class CompanyHandler {

  //field
  private Scanner sc;
  private Company company;
  
  //constructor
  public CompanyHandler(Company company) {
    sc = new Scanner(System.in);
    this.company = company;
  }
  
  
  //method 
  
  // 사원 정보 입력
  private Employee getEmployee() throws InputMismatchException, RuntimeException { //사원자체니까 타입을 Employee로
    
    System.out.println("사원타입(1.정규 2.파트) 입력 >>>");
    String type = sc.next();
    
    System.out.println("사원번호 입력 >>> " );
    int empNo = sc.nextInt();
    System.out.println("사원명 입력 >>> ");
    String name = sc.next();
   
    
    switch(type) {
    case "1":
      System.out.println("연봉입력 >>>");
      return new Regular(empNo, name, sc.nextInt()); //return으로 끝나니 break없어도 됨
    case "2":
      System.out.println("시급 입력 >>>");
      return new PartTime(empNo, name, sc.nextInt());
    default:
      throw new RuntimeException("잘못된 사원타입입니다.");
      /*
      System.out.println();
      return null; // 리턴 안하겟다
      던져서 주석처리...*/
    }
  }
  
  
  // 사원 번호 입력
  // 사원 번호만 반환시킬거임
  private int getEmpNo() throws InputMismatchException {
    System.out.println("사원번호 입력 >>> " );
    return sc.nextInt();
  }
  
  
  // 회사 관리
  
  
  /*
  // getEmployee() ->컴패니의 hire()메소드에 저장시킬거임 
  // getEmpNo()를 전달받아서 ->fire에 전달하고싶어
  // getEmpno ->search()
  // 전체조회니까 입력 딱히 필요 없음searchAll메소드 호출하면됨
    
    //..위에 정보들은 company에 있어서, company를 필드로 잡아놓고 가공해야함
  */
  
  
  
  public void manage() {
    
    System.out.println("========== 사원관리 프로그램 시작=========");
    while(true) {
      
      try {
        System.out.println("\n1.고용 2.해고 3.조회 4.전체조회 0.프로그램종료 >>> ");
        String choice = sc.next();
        switch(choice) {
        
        case "1" : 
          company.hire(getEmployee()); 
          //company의 hire을 실행시켜서 getEmployee의 정보를 넘겨주겟당
          break;
        case "2" :
          company.fire(getEmpNo());
          break;
        case "3" :
          company.search(getEmpNo());
          break;
        case "4" :
          company.searchAll();
          break;
        case "0" :
          System.out.println("========== 사원관리 프로그램 종료 =========");
          //반환타입이 void인 메소드는 return으로 종료할 수 있다 
          return;
        default  :
          throw new RuntimeException("잘못된 입력입니다.");
        }
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      
    }
    
  }
  
}
