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
  
  // 1. 메소드마다 try - catch 넣기
  // 2. 메소드 호출한 곳으로 예외 던지기
  
  public void deposit(long money) {

    try {
      if(money <= 0) {
        throw new RuntimeException(money+"원 입금 불가");
      }
      balance += money; 
    }catch(RuntimeException e){
      System.out.println(e.getMessage());
    }
  }
  
  public long withdrawal(long money) {
    
    long retValue = 0L;
    
    try {
      if(money <=0) {
        throw new RuntimeException(money+"원 출금불가");
      }
      if(money > balance) {
        throw new RuntimeException(money+"잔액부족");
      }
      balance -= money;
      retValue = money;
    }catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    return retValue;
   
  }
  
  public void transfer(BankAccount account, long money) {
    
    account.deposit(withdrawal(money));
    //입금,출금 이 각자 예외처리 하고있으니까, transfer는 안해도 됨
    
    
  }
  
  
}
