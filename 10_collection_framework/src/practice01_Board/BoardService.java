package practice01_Board;

import java.util.ArrayList;
import java.util.List;

public class BoardService {

  //반환타입이 list boardVo가 여러개 들어가있는 리스트
  
  public List<BoardVo> getBoardList(){ //메소드
  
    List<BoardVo> boardList = new ArrayList<BoardVo>();
    //타입이 List인 boarList
    
    boardList.add(new BoardVo(1, "공지사항", "관리자", "20240101"));
    boardList.add(new BoardVo(2, "긴급공지", "마스터", "20240102"));
    boardList.add(new BoardVo(3, "반가워요", "나그네", "20240103"));
    
    return boardList;
    
    
  }
  
}
