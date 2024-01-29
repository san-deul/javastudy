package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainClass {
  
  /*
   * TALK_T 테이블에 1행씩 삽입하시오.
   * TALK_T 구조
   *     TALK_NO      NUMBER(PK)
   *     TALK_CONTENT VARCHAR2(1000 BYTE)- 인사말
   *     TALK_EDITOR  VARCHAR2(1000 BYTE)- 본인이름
   *     WRITEN_AT    TIMESTAMP ( * 현재 날짜/시간 : CURRENT_TIMESTAMP)
   *     TALK_SEQ 시퀀스 존재함
   *     
   *     DB 서버 환경
   *     192.168.0.214
   *     GD/1111
   */
  public static void method1() {
    
    // 사용자 프로퍼티 등록(jdbc.url, jdbc.user, jdbc.password)
    
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO TALK_T(TALK_NO,TALK_CONTENT,TALK_USER,WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, ?, ?, CURRENT_TIMESTAMP)";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("인사말 입력하세요>>");
      String content = sc.next();
      System.out.println("이름 입력하세요>>>");
      String editor = sc.next();      
      
      sc.close();
      
      ps.setString(1, content);
      ps.setString(2, editor);
      
      int result = ps.executeUpdate();
      System.out.println(result + "  행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
       e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }

    }
    
  }
  public static void main(String[] args) {

    method1();
    
  }

}
