package practice03_BankAccount.copy;

public class BankException extends Exception {

  // Deposit 이랑 Withdrawal 을 아우르는 부모 BankException.. 두번 선언하지 않기 위함
  
  // field
  private int errorCode;
  
  //constructor
  public BankException( int errorCode) {
    
    this.errorCode = errorCode;
    
  }
public BankException(String message, int errorCode) {
    
    super(message);
    this.errorCode = errorCode;
    
  }
  
  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  
  
  
}
