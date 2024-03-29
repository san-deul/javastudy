package pkg04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

  /*
   * java.io.FileWriter 
   * 1. 문자 기반의 파일 출력 스트림이다. 문자아니면 못보내..
   * 2. 출력 단위
   *    1) int <-char가 아니고 ,int인 이유는 ..읽어들이는 단위 eof정상표기 위해 등등
   *    2) char[]
   *    3) String
   */
  
  /*
   * java.io.BufferedWriter
   * 1. 버퍼링을 지원하는 문자 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   * 4. 줄 바꿈을 위한 newLine() 메소드가 있다.
   * */
  
  /*
   * java.io.PrintWriter
   * 1. print 메소드(print, println, printf)를 지원하는 문자 출력 스트림이다.
   * 2. 메인 스트림 또는 보조 스트림으로 사용할 수 있다.
   * 
   */
  
  
  public static void method1() {
    
    
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample1.txt");
    
    // 파일 출력 스트림 선언
    FileWriter out = null;
    
    try {
      
      // 파일 출력 스트림 생성, 생성모드(파일을 항상 새로 만든다.)
      out = new FileWriter(file);
      
      // 출력할 데이터
      int ch = '대';
      char[] chArr = {'한','민'};
      String str = "국";
      
      // 출력
      out.write(ch);
      out.write(chArr);
      out.write(str);
      
      // 파일 출력 스트림 닫기
      out.close();
      
    } catch (IOException e) {
      
      e.printStackTrace();
    
    }
    
    
  }
  
  public static void method2() {
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();      
    }
    File file = new File(dir, "sample2.txt");
    
    //버퍼 출력 스트림 선언
    BufferedWriter out = null;
    
    try {
      
      //버퍼 출력 스트림 생성, 추가 모드(파일이 없으면 새로 만들고 파일이 있으면 내용만 추가한다.)
      out = new BufferedWriter(new FileWriter(file,true));
      
      // 안녕하세요 
      // 반갑습니다
      
      // 출력
      out.write("안녕하세요");
      out.newLine();
      out.write("반갑습니다");
      out.newLine();
      out.write("나는 강산들이라고 합니다");
      out.newLine();
      out.write("너는?");
      out.newLine();
      
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir,"sample3.html");
  
    // PrintWriter 선언
    PrintWriter out = null;
    
    try {
      //  PrintWriter 생성 ... 다양한 생성을 지원함
      out = new PrintWriter(file);
      
      // 출력
      // out.println("안녕하세요"); //Printwrite 쓰고 있으니 write 쓰지마, 자동으로 줄바꿈이 가미된 println써
      // out.println("반갑습니다");
      out.println("<script>");
      out.println("alert('안녕');");
      out.println("</script>");
      
      // PrintWriter 닫기
      out.close();
      
    } catch (IOException e) { 
      e.printStackTrace();
    }
    
    
  }
  
  
  public static void main(String[] args) {

    method3();
    
  }

}
