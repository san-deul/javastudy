package practice02_Watch;

public class Watch {

  private int hour;
  private int minute;
  private int second;
  
  //생성자
  public Watch() {
    
  }

  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }
  
  
  //method
  public void addHour(int hour) {
    if(hour<=0) {
      //System.out.println();
      return;
    }
    this.hour += hour;
    this.hour %= 24; // 0 ~ 23 사이 값을 가지게 된다.
    //System.out.println(hour+":");
   // return hour; ?
  }
  
  
  public void addMinute(int minute) {
    if(minute<=0) {
      return;
    }
    this.minute += minute;
    // this.hour+=(this.minute)/60 -> 이거 안돼.직접더하면 24시간 넘어가니까....
    addHour(this.minute / 60);
    this.minute %= 60;
  }

  public void addSecond(int second) {
    if(second<=0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }
  
  
  public void see() {
    System.out.println(String.format("%02d:%02d:%02d",hour, minute,second));
 
   
  }
 
  
 
  
  
}
