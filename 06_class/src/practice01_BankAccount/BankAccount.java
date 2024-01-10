package practice01_BankAccount;

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
  /*
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  public void setBalance(long balance) {
    this.balance = balance; 
  }
  
  public String getAccNo() {
    return accNo;
  }
  
  public long getBalance() {
    return balance;
  }
  */
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
  
  
  public void deposit(long money) {
    
    if(money <= 0) {
      System.out.println(money+"원 입금 불가");
      return;
    }
    
    balance += money; 
    
  }
  
  

  public long withdrawal(long money) {
    
    if(money <=0) {
     System.out.println(money+"원 출금불가");
     return 0L;
    }
    if(money > balance) {
      System.out.println("잔액부족");
      return 0L;
    }
    
    balance -= money;
    return money;
    
  }
  
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    //long a = withdrawal(money);
    
    // 네 통장에 입금
    //account.deposit(a);
    
    account.deposit(withdrawal(money));
    
    
  }
  
  
}
