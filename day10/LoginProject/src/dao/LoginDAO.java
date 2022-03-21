package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vo.Member;
import static db.JdbcUtil.*;

public class LoginDAO {
	
	private static LoginDAO loginDAO;
	private Connection con;
	
	private LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static LoginDAO getInstance(){
		if(loginDAO == null){
			loginDAO = new LoginDAO();
		}
		return loginDAO;
	}
	
	public void setConnection(Connection con){
		this.con = con;
	}
	
	public Member selectLoginMember(String id, String passwd) {
		// TODO Auto-generated method stub
		Member loginMember = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement("SELECT * FROM member WHERE member_id = ? AND member_pw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			if(rs.next()){
				loginMember = new Member();


				loginMember.setMember_id(rs.getString("member_id"));
				loginMember.setMember_pw(rs.getString("member_pw"));
				loginMember.setMember_name(rs.getString("member_name"));
				loginMember.setMember_age(rs.getInt("member_age"));
				loginMember.setMember_gender(rs.getString("member_gender"));
				loginMember.setMember_email(rs.getString("member_email"));

//				loginMember.setNation(rs.getString("nation"));
//				loginMember.setAddr(rs.getString("addr"));				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return loginMember;
	}
	
}




