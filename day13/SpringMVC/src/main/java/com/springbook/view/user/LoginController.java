package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
@Controller
public class LoginController{
		@RequestMapping(value="/login.do", method=RequestMethod.GET)
		public String loginView(@ModelAttribute("user")UserVO vo) {
			System.out.println("로그인 화면으로 이동");
			vo.setId("test");
			vo.setPassword("test");
			return "login.jsp";
		}
		
		@RequestMapping(value="/login.do", method=RequestMethod.POST)
		public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		UserVO user = userDAO.getUser(vo);
		System.out.println("로그인 인증 처리...");
		if(userDAO.getUser(vo) !=null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
			}
		else return "login.jsp";
		
		
		
		
		
		
		
//		//1. 사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//
//		HttpSession session = request.getSession();
//	
//		//2. DB 연동 처리
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
//		
//		
//		//3. 화면 네비게이션
//		ModelAndView mav = new ModelAndView();
//		if(user !=null){
//			session.setAttribute("userId", user.getId());
//			session.setAttribute("userName", user.getName());
//			mav.setViewName("redirect:getBoardList.do");
//		}else{
//			mav.setViewName("redirect:login.jsp");//리다이랙팅 방식. url 바뀜. spring 은 기본 방식이 fowarding 방식이지만 
//		}
//		return mav;
	}
}
