package practice01_byte_copy;

public class MainClass {

  public static void main(String[] args) {
    
    // 6190 6186 걍 5byte씩 다 옮겨버림
    MyFileUtils.fileCopy("\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
     MyFileUtils.fileCopy("\\storage\\LICENSE","\\GDJ77\\LICENSE");

    

  }

}
