package pkg01_java_net;
// [★ 2교시]
import java.net.MalformedURLException;
import java.net.URL;

public class Class02_URL {

  public static void main(String[] args) {

    try {
      
      URL url = new URL("https://www.example.com:9090/webtoon/list?page=1&id=100#memo");
      
      System.out.println(url.getProtocol()); //https:
      System.out.println(url.getHost()); //www..`
      System.out.println(url.getPort()); //
      System.out.println(url.getPath()); //
      System.out.println(url.getQuery());
      System.out.println(url.getFile()); //path + query
      System.out.println(url.getRef());
      
      
      
      // url.openConnection() url접속
      // url.openStream() 
      
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    
    
    
    
  }

}
