package pkg01_java_net;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//[★3교시] 용어중요
public class Class03_HttpURLConnection {

  public static void main(String[] args) {

    String spec = "https://www.naver.com/"; // 접속가능한주소
    URL url = null; // url이 있어야 커넥션 얻어낼수있음
    HttpURLConnection con = null; // HttpURLConnection <-자식, URLCONNECTION <-부모

    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      
      /*
       * 접속 상태 확인(HTTP Response Code : 응답 코드)
       * 1. 200 : 정상 
       * 2. 4xx : 요청 문제 (클라이언트 문제)
       * 3. 5xx : 서버 문제
       */

      int responseCode = con.getResponseCode();
      if(responseCode == HttpURLConnection.HTTP_OK) {
        System.out.println("정상 접속");
      }else {
        System.out.println("접속 불가");
      }
      
      /*
       * Content-Type 
       * 1. 컨텐트 타입
       * 2. 종류
       *    1) 문서타입 : text/xxx
       *    2) 이미지타입 : img/xxx
            3) 데이터타입 : application/xxx
      */
      
      String contentType = con.getContentType();
      System.out.println(contentType);
      
      
      /*
       * 요청 메소드(Request Method, 요청 방법)
       * 1. GET   : 주소창(URL)을 이용한 요청. 기본 요청 방식
       * 2. POST  : 본문(Body)을 이용한 요청 ex)비밀번호
       */
      
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod);
      
      
      /*
       * 요청 헤더
       * 1. 요청 정보가 저장된다.
       * 2. 종류
       *    1) User-Agent       : 무엇으로 접속하였는지에 관한 정보
       *    2) Referer          : 이전 접속 주소 정보
       *    3) Content - Type   : 컨텐트 타입
       *    4) Content - Length : 컨텐트 크기 
       */
      
      /*
      Map<String, List<String>> requestHeader = con.getRequestProperties();
      for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
        System.out.println(entry.getKey() + ":" + entry.getValue());
      }
      */
      
       String userAgent = con.getRequestProperty("User-Agent");
       System.out.println(userAgent);
       String referer = con.getRequestProperty("Referer");
       System.out.println(referer);
       
       
      
    } catch (MalformedURLException e) { // Malformed는 url땜시
      e.printStackTrace();
    } catch(IOException e) { // IO는 커넥션 땜시... 부모자식일 경우 catch따로...따로안해주면 IO가 다 처리해서 자식까지 못 가기에..자식을 먼저!!!..
      e.printStackTrace();
    } finally { //접속해제 때문에
      if(con != null) // <-해줘야함, 주의!※
      con.disconnect();
    }
    
    
  }

}
