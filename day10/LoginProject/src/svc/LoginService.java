package svc;

import static db.JdbcUtil.*;
import java.sql.Connection;
import dao.LoginDAO;
import vo.Member;
public class LoginService {

	public Member getLoginMember(String member_id, String member_pw) {
		// TODO Auto-generated method stub
		LoginDAO loginDAO = LoginDAO.getInstance();
		Connection con = getConnection();
		loginDAO.setConnection(con);
		Member loginMember = loginDAO.selectLoginMember(member_id,member_pw);
		close(con);
		return loginMember;
	}
	
}








