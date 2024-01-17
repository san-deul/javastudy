package practice01_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    
    // boardService 생성
    BoardService boardService = new BoardService();
    //boardService.getBoardList();
    
    // boardservec에서 가져온 list를 다시 boardList에 담음
    List<BoardVo> boardList = boardService.getBoardList();    
    
    // toString활용하기
     for(int i = 0, size = boardList.size(); i < size; i++) {
       System.out.println(boardList.get(i));
     }
     
     // Getter활용하기
     
     for(int i = 0, size = boardList.size(); i < size; i++) {
       System.out.println("번호:"+boardList.get(i).getBoardNo());
       System.out.println("제목:"+boardList.get(i).getTitle());
       System.out.println("작성자:"+boardList.get(i).getWriter());
       System.out.println("작성일자:"+boardList.get(i).getCreatedAt());
       
     }
    
    
  }

}
