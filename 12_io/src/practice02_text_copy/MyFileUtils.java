package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
    
    // BufferedReader : File src 읽는 역할
    // BufferedWriter : File dest 만드는 역할
    
    try(BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
      
      char[] cbuf = new char[256];
      int readChar = 0 ; //읽은 글자수..실제읽은 글자수
      // in.read(cbuf) - > out.write(cbuf) .... read로 읽은 걸 write로 보냄
      while((readChar = in.read(cbuf)) != -1 ) {
        out.write(cbuf, 0, readChar); // 정해진 글자(몇글자)만 보내라... chbuf,0  배열의 첫번째글자부터 raadChar까지만 보내라
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
    
    
    // 복사본을 만드는 버퍼 출력 스트림 선언
    
    
    
    
  }
  
  public static void fileMove(File src, File dest) {
    
    fileCopy(src,dest);
    src.delete();
    
  }
  
}
