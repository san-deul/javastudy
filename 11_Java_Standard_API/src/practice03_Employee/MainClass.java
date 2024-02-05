package practice03_Employee;

public class MainClass {

  public static void main(String[] args) {

    Company company = new Company("samsung");
    //컴퍼니 회사를 컴퍼니 핸들러로 전달해서, 컴퍼니 핸들러가 관리할수 있도록할거임
    
   
    new CompanyHandler(company).manage();
    
    
    
  }

}
