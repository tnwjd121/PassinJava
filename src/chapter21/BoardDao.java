package chapter21;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	// array와 list를 사용하여 작성
	
	public List<Board> getBoardList() {
		
		List<Board> board = new ArrayList<Board>();
		Board bod1 = new Board("제목1", "내용1");
		Board bod2 = new Board("제목2", "내용2");
		Board bod3 = new Board("제목3", "내용3");
		
		board.add(bod1);
		board.add(bod2);
		board.add(bod3);
		
		return board;
	}

}
