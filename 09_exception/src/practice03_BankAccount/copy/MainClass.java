package practice03_BankAccount.copy;

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
    
    try {
      account1.deposit(100000); // 10만원 입금 (성공)
      account1.deposit(-50000); // -5만원 입금 (실패)
      
      long money;
      money = account1.withdrawal(100000); // 10만원 출금(성공)
      
      System.out.println(money);          // 100000, 출금된 금액 출력
      
      money = account1.withdrawal(200000);     // 20만원 출금 (실패)
      System.out.println(money);               // 0(출금된 금액 출력)
      
      account1.transfer(account2, 50000);   // account1 -> account2, 50000원 이체(성공)
      account1.transfer(account2, 100000);   // account1 -> account2, 50000원 이체(실패)
      
    } catch (RuntimeException e) {

      // catch 블록의 RuntimeException e 로 전달되는 인자들
      // 1. catch (DepositException e) { throw new RuntimeException (money+"원 입금 불가",e);}
      // 2.  catch (WithdrawalException e) { throw new RuntimeException(money+"원 출금 불가",e);}
      // 2.  catch (WithdrawalException e) { throw new RuntimeException("잔액부족",e);}
      
      
      String message = e.getMessage();                  // 예외메시지 확인
      System.out.println(message);
      
      BankException cause = (BankException) e.getCause();
      System.out.println(cause.getClass().getName()); // 예외클래스 이름 확인
      System.out.println(cause.getErrorCode());       //에러코드 확인
      
      
    }
    


    
    
    
   
    
  }

}
