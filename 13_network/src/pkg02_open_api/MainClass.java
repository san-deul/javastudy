package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

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
      
      /*
       * 
       *  JSONObject -> { } 객체 처리용
          JSONArray ->[ ] 배열 처리용 
          
          JSONObject  obj = { key: value }
          value 가 int인 경우 obj.getInt( key )
          value 가 String인 경우 obj.getString(key)
          value 가 { } 객체인 경우 obj.getJSONObject(key)
          value 가 [ ] 배열인 경우 obj.getJSONArray(key)
          
          String responseData = sb.toString();
          JSONObject obj = new JSONObject(responseData);
          obj.getString("resultCode") == "00"
          obj.getString("resultMsg") == "NORMAL_CODE"
          
          
          obj.getJSONObject("items").getJSONArray("item")
       * 
       */
      
      JSONObject obj = new JSONObject(sb.toString()) ;
      JSONArray items = obj.getJSONObject("items").getJSONArray("item");
      System.out.println(items.length());
      
      //메소드 호출 여러번 하기 위해서 초기화 목록에 가져다놓음
      for(int i = 0,length = items.length(); i < length; i++) {
        Map<String, Object> map = items.getJSONObject(i).toMap();
        System.out.println(map.get("occrrnc_dt") + ":" + map.get("dth_dnv_cnt"));
      }
      
      in.close();
      con.disconnect();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }

}
