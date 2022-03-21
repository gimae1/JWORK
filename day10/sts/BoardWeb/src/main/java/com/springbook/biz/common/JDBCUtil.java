package com.springbook.biz.common;

import java.sql.*;


public class JDBCUtil {

//	private static Connection conn; 싱글톤은 객체 생성을 막아서 직접접근을 막아야 한다 
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mariadb://localhost:3306/swork","root","1111");
//			return DriverManager.getConnection(url,user,pw); url user pw 모두 string으로 만들어서 받아도 된다 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	public static void close(PreparedStatement stmt,Connection conn) {
		if(stmt != null) {
			
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
			
		}
		if(conn != null) {
			
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
			
		}
	
	}
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if(rs != null) {
			try {
			if(!rs.isClosed())rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				rs=null;
			}
		}
		if(stmt != null) {
			try {
				if(!stmt.isClosed())stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				stmt=null;
			}
		}
		if(conn != null) {
			try {
				if(!conn.isClosed())conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn=null;
			}
		}
		
	}
	
	
}
