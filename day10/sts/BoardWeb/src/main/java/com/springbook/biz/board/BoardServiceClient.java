package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		//1.spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.spring 컨테이너로부터 BoardServiceImpl 객체를 lookup 한다.
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3.글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시제목");
		vo.setWriter("홍길동");
		vo.setContent("임시내용................");
		boardService.insertBoard(vo);
		
		
//		//3-1글 수정 기능 테스트 "update board set title=?, content=? where seq=?";
//		BoardVO vo = new BoardVO();
//		vo.setTitle("임시제목수정");
//		vo.setContent("임시내용수정................");
//		vo.setSeq(2);
//		boardService.updateBoard(vo);
		
//		//3-2글 삭제 기능 테스트"delete from board where seq=?";
//		BoardVO vo = new BoardVO();		
//		vo.setSeq(2);
//		boardService.deleteBoard(vo);
		
//		//3-3글 상세조회 기능 테스트"select * from board where seq=?";
//		BoardVO vo = new BoardVO();		
//		vo.setSeq(1);
//		boardService.getBoard(vo);
		
		//4.글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("--->"+board.toString());
		}
		//5.컨테이너 종료
		container.close();
		
	}
	
}
