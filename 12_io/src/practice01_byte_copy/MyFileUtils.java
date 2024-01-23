package practice01_byte_copy;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileUtils {

  // 파일 복사 메소드
  public static void fileCopy(String src, String dest) {
    
    // 권장
    // src 로부터 읽은 데이터를 바이트 배열에 저장하고,
    // 바이트 배열에 있는 데이터를 파일 출력 스트림으로 보내는 방식
    
    // b에 담지않고 걍 출력...?
    
    
    // 원본 File 객체
    File srcFile = new File(src);
    
    // 복사본 File객체
    File destFile = new File(dest);
    
    // 원본을 읽는 버퍼링된 입력 스트림 선언
    BufferedInputStream in =null;
    
    // 복사본을 만드는 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    
    
    try {
      
      //원본을 읽는 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(srcFile));

      //복사본을 만드는 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(destFile));

      // 원본을 5바이트씩 읽어온다.
      byte[] bytes = new byte[5];
      
      // 원본을 끝까지 읽는다. 읽은 내용을 복사본으로 보낸다.
      
      int readByte = 0;
      
      while((readByte = in.read(bytes)) != -1) {
        out.write(bytes, 0, readByte); // 그냥 write하면 안돼.. 5byte씩 자르기때문에 통으로 건네줘서 크기가 안 맞아
        // ★ 0부터 readByte만큼만..읽어들인 만큼만 보내라... 
      }

      //버퍼 출력 스트림 닫기
      out.close();
      
      //버퍼 입력 스트림 닫기 ...  역순
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    
    }
    
    
    
  }
  
  
  // 파일 이동 메소드
  public static void fileMove(String src, String dest) {
      
   File srcFile = new File(src);
   File destFile = new File(dest);
   
   BufferedInputStream in = null;
   BufferedOutputStream out = null;
   
   
   try {
    
     in = new BufferedInputStream(new FileInputStream(srcFile));
     out = new BufferedOutputStream(new FileOutputStream(destFile));
         
     byte[] bytes = new byte[5];
     
     int readByte = 0;
     
     while((readByte = in.read(bytes)) != -1) {
       out.write(bytes, 0, readByte);
     }
     
     srcFile.delete(); // ? 
     
     out.close();
     in.close();
     
  } catch (IOException e) {
    
    e.printStackTrace();
    
  }
     
    
    
    
    
  }
  
  
}
