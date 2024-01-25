package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {

    // https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15059126   <-참고
    
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("YPkXob1%2BbuAPgjUaMz5IbyEq7gptCtIResC6bhqJehna4WVrWs8pD6DygbP86mRE4uVHrPe9nXG45Vf4aa3%2FvA%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    // 변수랑 데이터 분리한이유... 나중에 수월한 인코딩 위해?
    
    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    
    
    BufferedReader in = null;
    
    
    try {
    
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK ) {
        throw new RuntimeException("API 요청 실패");
      }
      
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = in.readLine()) != null) {
        sb.append(line);
      }
      
      System.out.println(sb.toString());
      
      in.close();
      con.disconnect();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }

}
