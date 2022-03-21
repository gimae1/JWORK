package com.springbook.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardVO;

public class UserServiceClient {

	public static void main(String[] args) {
		//1.Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("user/userContext.xml");
		
		//2.Spring 컨테이너로부터 USerServiceImpl 객체를 LOOkUP 한다
		UserService userService = (UserService) container.getBean("userService");
		
//		//3. 로그인 기능 테스트
//		UserVO vo = new UserVO();
//		vo.setId("test");
//		vo.setPassword("test1234");
//		UserVO user = userService.getUser(vo);
//		if(user !=null) {
//			System.out.println(user.getName() + "님 환영합니다");
//		}else {
//			System.out.println("로그인 실패");
//			
//		}
		
		
//		//1. insert  insert into users values(?,?,?,?);
//		UserVO vo = new UserVO();
//		vo.setId("hong");
//		vo.setPassword("hong1234");
//		vo.setName("홍길순");
//		vo.setRole("user");
//		userService.insertUser(vo);
		
//		//2.update id기준 "update users set password=?  where id=?;"
//		UserVO vo = new UserVO();
//		vo.setPassword("hong123");
//		vo.setId("hong");
//		userService.updateUser(vo);
		
//		//3. delete id 기준 delete from users where id=?
//		UserVO vo = new UserVO();
//		vo.setId("test");
//		userService.deleteUser(vo);
		
		//5. 선택한 아이디 정보만 보여주기 select * from users where id=?;
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test1234");
		UserVO user = userService.getoneUser(vo);
		if(user !=null) {System.out.println("사용자 확인이 완료되었습니다");
		System.out.println("--->"+user.toString()); }
		else {	System.out.println(" id/password 정보 불일치 ");	}
		
		//4. 전체목록 보여주기
//		UserVO vo1 = new UserVO();
//		 List<UserVO> userList = userService.getUserList(vo1);
//		 for(UserVO user1 : userList) { System.out.println("--->"+user1.toString()); }
		 
		
		
		
		//4. 컨테이너를 종료한다
		
		container.close();
				
	}

}
