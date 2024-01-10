package practice01_BankAccount;

public class MainClass {

  public static void main(String[] args) {

    // 생성자
    BankAccount account1 = new BankAccount(); //default형식 생성자
    
    // Setter 
    account1.setAccNo("010987654321");
    account1.setBalance(100000);
    
    
    System.out.println(account1.getAccNo());
    System.out.println(account1.getBalance());
    
    
    
    
    
    
    
    // 생성자
    BankAccount account2 = new BankAccount("01012345678",50000); //인자값 2개 생성자
    
    //System.out.println(account2);
    
    
    //2./////////
    
    account1.deposit(100000); // 10만원 입금 (성공)
    account1.deposit(-50000); // -5만원 입금 (실패)
    
    
    
    long money;
    money = account1.withdrawal(100000) // 10만원 출금(성공)
    
    System.out.println(money);          // 100000, 출금된 금액 출력
    
    money = account1.withdrawal(200000);     // 20만원 출금 (실패)
    System.out.println(money);               // 0(출금된 금액 출력)
    
    
    
    //3.///////////////////
    account1.transfer(account2, 50000);   // account1 -> account2, 50000원 이체(성공)
    account1.transfer(account2, 100000);   // account1 -> account2, 50000원 이체(실패)

    */
    
    
    
   
    
  }

}
