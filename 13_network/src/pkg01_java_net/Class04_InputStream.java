package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputStream {

  public static void method1() {

    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    // 구글 첫페이지를 스트림을 써서 받아올거임
    BufferedReader in = null;   //txt받아올거니까 reader씀
    
    
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection(); // 다운캐스팅 안하면 오류남
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + "접속 불가");
      }
      
      
      in = new BufferedReader(new InputStreamReader(con.getInputStream())) ; 
      // (속도향상 위해 buffer끼움(txt로 읽어주는 스트림으로 바꿔줌 리더( /네트워크 바이트스트림 읽어들임))
      
      String line = null; // 버퍼드리더로 인해 한줄로 읽을 수 있으므로
      StringBuilder builder = new StringBuilder(); // 한줄씩 모을거임
      
      while((line = in.readLine()) != null) { //null이 아니면
        builder.append(line).append("\n");  //읽어들인 것 추가하라
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null) {
        con.disconnect();
      }
    }
    
    
    
    
  }

  public static void method2() {
    
   // String spec = "https://ssl.pstatic.net/melona/libs/1482/1482864/7a75f9e4c96886c8aca9_20240124160331812.jpg";
   // \\storage\\banner.jpg
  
    
    String spec = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + " 접속 불가");
      }
      
      in = new BufferedInputStream(con.getInputStream());
      
      // 입력
      
      // 출력
      File dir = new File("\\storage");
      if(!dir.exists()) {
        dir.mkdirs();
      }
      File file = new File(dir, "google-logo.png");
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[10];
      int readByte = 0;
      while((readByte = in.read(b)) != -1) {
        out.write(b, 0, readByte);
      }
      
      out.close();
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
    
    
    
  
  }
  
  public static void main(String[] args) {
    method2();
  }
}
