package practice01_Square;

public class Square extends Rectangle {
  
  //파라미터 하나짜리
  public Square(int n) {
    //n이 너비이자 높이
    //n을 Recatangle의 width와 height로(필드) 보내는게목표
    
    
    // rectangle의 constructor에서 첫번째가 아니라 public Rectangle()두번째(인자가 두개 있는거)거 불러야함
    super(n,n);
    
   
    
  }
  
}
