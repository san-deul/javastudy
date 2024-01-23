package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

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
  
  public static void main(String[] args) {
    method3();
  }
  

}
