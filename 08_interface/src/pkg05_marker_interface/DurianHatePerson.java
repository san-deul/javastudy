package pkg05_marker_interface;


public class DurianHatePerson {
  
  /*
  public void eat(Food food) { //두리안을 안 먹어도 일단 받긴함... 근데 안 받고싶어
    if(food instanceof Durian) {
      return;
    }
    food.eat();
  }
  */
  public void eat(Eatable eatable) {
    ((Food) eatable).eat();
  }
  
  
  
}
