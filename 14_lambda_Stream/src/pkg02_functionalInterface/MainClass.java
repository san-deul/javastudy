package pkg02_functionalInterface;

public class MainClass {

  public static void main(String[] args) {

    // interface MyInterface1 { void method();}
    MyInterface1 my1 = () -> System.out.println("hello world");
    my1.method();
    
    // interface MyInterface2 {String method();}
   /*
    MyInterface2 my2 = () -> {
     return "hello world";
    };
    */
    MyInterface2 my2 = () -> "hello world";
    System.out.println("my2 :"+my2.method());
    
    // interface MyInterface3{ void method(String name);}
    MyInterface3 my3 = (name) -> System.out.println("my3:"+ name + "님");
    my3.method("산들");
    
    // interface MyInterface4 { String method(String name); }
    MyInterface4 my4 = (name) -> "my4 : "+name + "님";
    System.out.println(my4.method("산들"));
    
    
  }

}
