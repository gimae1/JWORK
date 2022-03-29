package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목","TITLE");
		conditionMap.put("내용","CONTENT");
		return conditionMap;
	}
//글 등록
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		System.out.println("글 등록 처리");
		
		
		//파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		System.out.println("isEmpty"+uploadFile.isEmpty());
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			System.out.println("fileName : "+uploadFile.getOriginalFilename());
			vo.setFileName(fileName);
			uploadFile.transferTo(new File("C:/swork/SpringFileUpload/src/main/webapp/img/"+fileName));
		}
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}
	
	
	
	//글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		
//			System.out.println("작성자 이름 : "+vo.getWriter());
//			System.out.println("번호 : "+vo.getSeq());
//			System.out.println("제목 : "+vo.getTitle());
//			System.out.println("작성자 : "+vo.getWriter());
//			System.out.println("내용 : "+vo.getContent());
//			System.out.println("등록일 : "+vo.getRegDate());
//			System.out.println("조회수 : "+vo.getCnt());
		
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}
	//글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	//글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo,Model model) {
		
		System.out.println("글 상세 조회 처리");
		model.addAttribute("board",boardService.getBoard(vo));//model정보 저장
		
		return "getBoard.jsp";
	}
		
	//글 목록 검색
//	public String getBoardList(@RequestParam(value="searchCondition",defaultValue="TITLE",required=false) String condition, @RequestParam(value="searchKeyword",defaultValue="",required=false) String keyword ,BoardVO vo, Model model) {
	@RequestMapping("/getBoardList.do")
	public String getBoardlist(BoardVO vo,Model model) {
		//null check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		System.out.println("글 목록 검색 처리");
//		System.out.println("검색 조건 : "+condition);
//		System.out.println("검색 단어 : "+keyword);
		model.addAttribute("boardList",boardService.getBoardList(vo)); //Model 정보 저장
		return "getBoardList.jsp";//view 이름 리턴
	
	}

	
	
	
}
