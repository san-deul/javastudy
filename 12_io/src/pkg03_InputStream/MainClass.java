package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import pkg02_OutputStream.Employee;

public class MainClass {

  /*
   * java.io.FileInputStream
   * 1. 바이트 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) byte[]
   * */
  
  /*
   * java.io.BufferedInputStream
   * 1. 버퍼링을 지원하는 바이트 입력 스트림이다.
   * 2. 보조스트림으로 메인스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   */
  
  
  /*
   * java.io.DataInputStream
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조스트림으로 메인스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다. (String, int 읽어들이는 메소드가 다 따로있음)
   * 
   */
  
  /*
   * java.io.ObjectInputStream
   * 1. 객체로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조스트림으로 메인스트림과 함께 사용해야 한다.
   * 3. 읽은 객체는 Object 타입으로 반환되므로 객체 타입으로 캐스팅해서 사용한다.
   *     -> IOException과 ClassNotFoundException 예외 발생할 수 있다.
   *     -> IO와 Class 얘네는 부모자식 사이 아님, 그렇기에 순서 딱히 상관없음, 처리 따로
   *      
   */
  
  
  
  

  public static void method1() {
    //연습용
    // int단위로 읽어들임
    
    
    File dir = new File("\\storage");
    // 디렉터리가 없으면 그냥 오류인거임..읽어들일 데이터 없으니까
    File file = new File(dir, "sample1.dat");
    
    // 파일 입력 스트림 선언
    FileInputStream in = null;
    
    try {
      //파일 입력 스트림 생성
      in = new FileInputStream(file);
      // ↑ 경로나 파일이름이 잘못됬으면 여기서 예외가 발생할거임
      // FileNotFoundException 예외 발생
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()]; //배열의 크기= 파일의 크기
      // 오류뜨는이유 .. file.length의 반환값이 long이라....
      // List<Byte> <-이것도 가능햠
      
      int idx = 0; 
      
      // 읽을 단위 (int 변수로 1바이트씩 읽는다.)
      int c;
      
      // 읽기
      // c = in.read(); // 하나 읽어라..읽은거 int로 가져와라
      //read메소드가 발생시킨 예외는 fileNot~~가 처리하지 못함
      
      //  b[0] = c;  1byte 에 4btye짜리 집어넣는 꼴
      // b[0] = (byte)c;
      
      
      // 읽기
      while(true) {
        c = in.read(); // 하나 읽어봐
        if(c == -1) {
          break;
        }
        b[idx++] = (byte)c;
        
      }/* 확인1
      for(int i = 0; i<b.length; i++) {
        System.out.println((char)b[i]);
      }*/
      //확인2
      System.out.println(new String(b));
      
     // 파일 입력 스트림 닫기
      in.close();
      
    } catch (FileNotFoundException e) {
      System.out.println("파일의 경로를 확인하세요.");
    } catch(IOException e) {
      System.out.println("입출력 예외가 발생했습니다.");
    }
    
  }
  
  public static void method2() { // byte단위로 읽어오기..여러개씩
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.dat");
    
    
    // 파일 입력 스트림 선언
    FileInputStream in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileInputStream(file);
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];
      
      // 읽을 단위(byte[] 배열로 읽는다.)
      byte[] bytes = new byte[5]; //5개바이트씩 읽음
      
      // 읽기
     //  System.out.println(in.read(bytes)); //실제로읽어들인 바이트의 반환개수 반환할거임..
                                          // 5byte일수도있고 더 작을수도있고
      //읽기
      //int readByte = in.read(bytes); //
      //System.arraycopy(bytes, 0, b, 0, readByte);
      
      /*
      for(int i=0;i<b.length;i++) {
        System.out.println(b[i]);
      } // 5개정도는 0이 아님..배열복사햇으니까 나머지는 초기화 0값
      */
      
      int idx = 0; 
      while(true) { 
        
        int readByte = in.read(bytes); //1.읽어와
        
        if(readByte == -1) { //2.없으면 끝내
          break;
        }
        System.arraycopy(bytes, 0, b, idx, readByte); // b에 담아...
        idx += bytes.length;      // idx += readByte ;  <-readbyte에 5 담겨있어서 동일한 결과값 나옴
      }
      
      // 확인
      System.out.println(new String(b)); // String값 확인할거임
      
      //파일 입력 스트림 닫기
      in.close();
          
    } catch (FileNotFoundException e) {
       System.out.println(file.getPath() + "파일이 존재하지 않습니다"); //getPath : 경로와이름
    } catch (IOException e) {
      System.out.println("입출력 오류가 발생했습니다.");
    }
    
  }
  
  public static void method3() {
    
    
    File dir = new File("\\storage");
    File file = new File(dir,"sample3.dat");
    
    // 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    try {
      
      // 버퍼 입력 스트림 생성
       in = new BufferedInputStream(new FileInputStream(file));
      
       byte[] b = new byte[(int) file.length()];
       byte[] bytes = new byte[5];
       
       int idx = 0;
       int readByte = 0;
       while ( (readByte = in.read(bytes)) != -1  ) {
        
        // int readByte = in.read(bytes); <- while문(무한루프)안에서 계속 변수 선언함...ㅋ 불필요
       
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length;
        
       }
       System.out.println(new String(b)); 
       in.close();

    } catch (IOException e) { // FileNot얘가 IO자식이라...
      
      e.printStackTrace();
      
    }
    
    
  }
  
  public static void method4() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample4.dat");
    
    // 데이터 입력 스트림 선언
    DataInputStream in = null;
    
    try {
      
      // 데이터 입력 스트림 생성
      in = new DataInputStream(new FileInputStream(file));
      
      // 입력
      String name = in.readUTF();        // 출력시 out.writeUTF(name) 사용 , 한글포함된 txt파일은 UTF처리
      
      int age = in.readInt();               // 출력시 out.writeInt(age) 사용
      double height = in.readDouble();      // 출력시 out.writeDouble(height) 사용
      boolean isAdult = in.readBoolean();   // 출력시 out.writeBoolean(isAdult) 사용
      char gender = in.readChar();          // 출력시 out.writechar(gender) 사용
      
      // 확인
      
      System.out.println(name);
      System.out.println(age);
      System.out.println(height);
      System.out.println(isAdult);
      System.out.println(gender);
      
      // 데이터 입력 스트림 닫기
      in.close();
      
    } catch (Exception e) {
      
      e.printStackTrace();
    
    }
    
  
  
  }
  
  public static void method5() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample5.dat");
    
    // 객체 입력 스트림 선언
    ObjectInputStream in = null;
    
    
    try {
      
      
      // 객체 입력 스트림 생성
      in = new ObjectInputStream(new FileInputStream(file));
      
      // 객체 입력
      Employee emp1 = (Employee)in.readObject();
      List<Employee> empList = (List<Employee>)in.readObject();

      
      System.out.println(emp1);
      System.out.println(empList.get(0));
      System.out.println(empList.get(1));
      
      // 객체 입력 스트림 닫기
      in.close();
      
    } catch (IOException | ClassNotFoundException e) {
    
      e.printStackTrace();
    
    }
    
  
  
  
  }
  
  public static void main(String[] args) {
    method5();
  }
  

}
