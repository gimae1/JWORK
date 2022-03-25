package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAOSpring boardDAO;

	
	public BoardServiceImpl() {
	
	}
	
	public void insertBoard(BoardVO vo) {
//		//p182-183
		if(vo.getSeq() == 0) {
			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다");
		}
		//p242
		boardDAO.insertBoard(vo);//100번 글 등록 성공
		boardDAO.insertBoard(vo);//exception발생
	}
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {

		boardDAO.deleteBoard(vo);
	}
	public BoardVO getBoard(BoardVO vo) {

		return boardDAO.getBoard(vo);
	}
	public int getTotal() {
		
		return boardDAO.getTotal();
	}
	public List<BoardVO> getBoardList(BoardVO vo) {

		return boardDAO.getBoardList(vo);
	}
}
