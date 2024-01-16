package practice03_BankAccount.copy;

import javax.management.RuntimeErrorException;

public class BankAccount {

  //field
  private String accNo;  // 계좌번호
  private long  balance;  // 잔액
 
  //
  

 //constructor ...default형식(parameter없는거)
  public BankAccount(){
  
  }
  
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }


  //method
  
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  
  public void deposit(long money) throws RuntimeException{
  
    try {
      if(money <= 0) {
        //catch 블록으로 던진다.
        throw new DepositException(1001);
      }
      
      balance += money; 
      
    } catch (DepositException e) { // DepositException e : 예외원인객체(cause)
      
      //얘는 try에없는 코드.. 메소드 호출한 곳으로 던짐
      //deposit메소드 호출한 곳으로 던진다.
      throw new RuntimeException(money+"원 입금불가", e); 
      
    }
  }
  
  

  public long withdrawal(long money) throws RuntimeException {
    
    try {
      if(money <=0) {
        throw new WithdrawalException(2001);
      }
      if(money > balance) {
        throw new WithdrawalException(2002);
      }
      
      balance -= money;
      
    } catch (WithdrawalException e) { // 예외 원인 객체
     
      String message = null;
      switch(e.getErrorCode()) {
      case 2001: 
        message = money + "원 출금불가";
        break;
      case 2002:
        message = "잔액 부족";
        break;
      }
      throw new RuntimeException(message, e);
    }
    
    return money;
    
  }
  
  public void transfer(BankAccount account, long money) throws RuntimeException {

    account.deposit(withdrawal(money));
    
  }
  
  
}
