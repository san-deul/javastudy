package pkg02_generic_type;



//무엇이든 담을 수 있음
public class Container<T> { //T타입 저장용 컨테이너 박스

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  
  
}
