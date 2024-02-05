package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {

  /*
   * java.io.FileOutputStream
   * 1. 바이트 기반 파일 출력 스트림이다. ....바이트데이터를 파일로 보냄..
   * 2. 출력 단위 
   *    1) int      // int:4byte..이지만 1byte씩 내보냄?... -> 하나 내보낼때
   *    2) byte[]   // -> 여러개 내보낼때
   */
  
  /*
   * java.io.BufferedOutputStream (보조)
   * 1. 버퍼링을 지원하는 바이트 출력 스트림이다.
   * 2. 보조스트림으로 메인스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력속도가 향상된다.
   */
  
  /*
   * java.io.DataOutputStream (보조)
   * 1. 자바 변수 값을 그대로 출력하는 바이트 출력 스트림이다. 
   * 2. 보조스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입별로 전용 메소드가 존재한다.
    */
  
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림
   * 2. 보조스트림으로 메인스트림과 함께 사용해야한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다.(★필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   *    
   *    
   *    ※ 직렬화:객체를 -> 바이트화
   */
  
  
  
  public static void method1() {
    
    // 파일출력스트림: 파일만드는 거
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    // 디렉터리 지정
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample1.dat");
    
    // 파일 출력 스트림 선언 
    FileOutputStream out = null;
    // finally 에서 확인해주려고 , null 값을안해주면 쓰레기값이 되서
    // try에서도 사용하고 finally에서도 사용해주려고
    // 확인용
   
    // 3번에서부터는 안해줘도 됨...
    
    
    try {
      // 파일 출력 스트림 생성(무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터
      int c = 'A';
      //String 준비해서 byte 배열로 바꿔서
      String str = "pple";
      byte[] b = str.getBytes();
      
      //출력 ... 출력스트림:파일 내보내는 통로
      out.write(c);
      out.write(b);
      
      // 플러싱(선택) ..<출력 안될때..껴있는 데이터들 불어주는(?) 작업
      out.flush();
      
      
      
      // 확인
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");
      
      
    } catch (Exception e) {
      e.printStackTrace();   // catch블록 웬만하면 비워두지 말고 채워둘것.
    }
    finally {
      
      try {
        //파일 출력 스트림 닫기(종료)
        if(out!=null)
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
        
        
        
  }
  
  public static void method2() {
    //안녕하세요 반갑습니다 - > sample2.dat 파일로 보내기
    
    //추가 모드: 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample2.dat");
    
    // 파일 출력 스트림 선언 
    FileOutputStream out = null;
    
    try {
      // 파일 출력 스트림 생성(추가 모드)
      out = new FileOutputStream(file,true);
      
      // 출력할 데이터
      
      //String 준비해서 byte 배열로 바꿔서
      String str = "안녕하세요 반갑습니다\n";
      byte[] a = str.getBytes();
      
      //출력 ... 출력스트림:파일 내보내는 통로
      out.write(a);
      
      // 플러싱(선택) ..<출력 안될때..껴있는 데이터들 불어주는(?) 작업
      out.flush();
      
      
      // 확인
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");
      
    } catch (Exception e) {
      e.printStackTrace();   //catch블록 웬만하면 비워두지 말고 채워둘것.
    }
    finally {
      
      try {
        //파일 출력 스트림 닫기(종료)
        if(out!=null)
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file =new File(dir, "sample3.dat");
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file)); // Buffedred저거 추가하면 속도가 빨라짐
      
      // 출력할 데이터
      String str1 = "how do you do? nice to meet you\n";
      String str2 = "i'm fine thank you";
      
      // 출력
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");

    }catch(Exception e) {
      e.printStackTrace();
    } 
    
    
  }
  
  public static void method4() {
    File dir = new File("\\storage");
    if(!dir.exists() ) {
      dir.mkdirs();
    }
    File file = new File(dir,"sample4.dat");
  
    DataOutputStream out = null;
    
    try {
      //데이터 출력 스트림 생성
      out = new DataOutputStream(new FileOutputStream(file));
      
      //출력할 데이터
      String name = "홍길동";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20 );
      char gender = '남';
    
      //출력 
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
      
      
      // 데이터 출력 스트림 닫기
      out.close();
      //확인
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void method5() {
    /*직렬화 X*/
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample5.dat");
    //객체 출력 스트림 선언
    ObjectOutputStream out = null;
    
    try {
      // 객체 출력 스트림 생성
      out = new  ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 객체
      Employee employee = new Employee(1,"홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2,"홍길순"), new Employee(3,"홍순자"));
      
      // 객체 출력
      out.writeObject(employee);
      out.writeObject(employees);
      
      //객체 출력 스트림 닫기
      out.close();
      
      //확인
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    //NotSerialize 직렬화가 안됨 에러뜸
    
  }
  
  
  
  public static void main(String[] args) {
    
    method4();
    
  }
  
  
  public static void practice1() {
   
    // FileOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기(System.nanoTime());
    long start = System.nanoTime();
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir,"애국가1.dat");
    
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream(file,true);
      
      
      String str = "동해물과 백두산이\n";
      byte[] a = str.getBytes();
      
      out.write(a);
      out.flush();
      
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");

    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      try {
        if(out!=null)
        out.close();
      }catch (Exception e) {
         e.printStackTrace();
       }
    }
    
    long end = System.nanoTime();
    System.out.println(end - start + "ns");
  }

  public static void practice2() {
    
    
    long start = System.nanoTime();
    // BufferedOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "애국가2.dat");
    
    BufferedOutputStream out =null;
    
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      String str = "남산 위에 저 소나무 철갑을 두른 듯 \r\n"
          + "\r\n"
          + "바람 서리 불변함은 우리 기상일세 \r\n"
          + "\r\n"
          + "무궁화 삼천리 화려 강산 \r\n"
          + "\r\n"
          + "대한 사람 대한으로 길이 보전하세 \r\n";
      
      out.write(str.getBytes());
      out.close();
      System.out.println(file.length() + " 바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다");
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    long end = System.nanoTime();
    System.out.println(end - start + "ns");
  }
 
  
}
