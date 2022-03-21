package com.springbook.biz.user.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

//DAO(Data Access Object)
//@Repository("userDAO")
public class UserDAO {
	//JDBC 관련 변수
	private Connection conn=null;
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	//SQL 명령어들
	private final String USER_GET = "select * from users where id=? and password=?;";
	private final String USER_DELETE = "delete from users where id=?;";
	private final String USER_INSERT = "insert into users values(?,?,?,?);";
	private final String USER_LIST = "select * from users order by name desc;";
	private final String USER_UPDATE = "update users set password=?  where id=?;";
	private final String USER_GETONE = "select * from users where id=? and password=? ;";
	
	
	//CRUD 기능의 메소드 구현
	//회원등록
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		System.out.println("===> JDBC로 getUser() 기능 처리");
		try { 
			
		conn = JDBCUtil.getConnection();
		stmt = conn.prepareStatement(USER_GET);
		stmt.setString(1, vo.getId());
		stmt.setString(2, vo.getPassword());
		rs = stmt.executeQuery();
		if(rs.next()) {
			user = new UserVO();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			user.setRole(rs.getString("role"));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close( rs, stmt, conn);
		}
		return user;
	}
	public UserVO getoneUser(UserVO vo) {
		UserVO user = null;
		System.out.println("===> JDBC로 getoneUser() 기능 처리");
		try { 
			
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GETONE);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close( rs, stmt, conn);
		}
		return user;
	}
	public void deleteUser(UserVO vo) {
		System.out.println("===> JDBC로 deleteUser() 기능 처리");
		try { 
			
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_DELETE);
			stmt.setString(1, vo.getId());
			
			stmt.executeUpdate();
			
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn);
			}
	}
	public void updateUser(UserVO vo) {
		System.out.println("===> JDBC로 updateUser() 기능 처리");
		try { 
			
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_UPDATE);
			stmt.setString(1, vo.getPassword());
			stmt.setString(2, vo.getId());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void insertUser(UserVO vo) {
		System.out.println("===> JDBC로 insertUser() 기능 처리");
		try { 
			
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("===> JDBC로 getUserList() 기능 처리");
		List<UserVO> userList = new ArrayList<UserVO>();
		try { 
		conn = JDBCUtil.getConnection();
		stmt = conn.prepareStatement(USER_LIST);
	
		rs = stmt.executeQuery();
		while(rs.next()) {
			UserVO user = new UserVO();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			user.setRole(rs.getString("role"));
			userList.add(user);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close( rs, stmt, conn);
		}
		return userList;
	}


}
