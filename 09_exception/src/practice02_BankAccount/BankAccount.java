package practice02_BankAccount;

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
  
  
  public void deposit(long money) throws RuntimeException {
    
    if(money <= 0) {
      throw new RuntimeException(money+"원 입금불가");
    }
    balance += money; 
    
  }
  
  

  public long withdrawal(long money) throws RuntimeException {
    
    if(money <=0) {
     throw new RuntimeException(money + "원 출금 불가");
    }
    if(money > balance) {
      throw new RuntimeException("잔액부족");
    }
    
    balance -= money;
    return money;
    
  }
  
  public void transfer(BankAccount account, long money) throws RuntimeException{
    account.deposit(withdrawal(money));
    //위에서 던진것(deposit, withdrawal)들 받아야해서... 
  }
  
  
}
