package practice03_BankAccount.copy;

public class DepositException extends BankException{

  
  public DepositException( int errorCode) {
    super(errorCode);
  }
  public DepositException(String message, int errorCode) {
    super(message, errorCode);
  }

  //필드 없으니 getter, setter 등의 method필요 없어
  
 
  
  
}
