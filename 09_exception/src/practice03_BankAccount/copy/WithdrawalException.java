package practice03_BankAccount.copy;

public class WithdrawalException extends  BankException{

  public WithdrawalException( int errorCode) {
    super(errorCode);
  }
  public WithdrawalException(String message, int errorCode) {
    super(message, errorCode);
  }


 
  
}
