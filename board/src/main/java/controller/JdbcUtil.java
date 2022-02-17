package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {
	private static JdbcUtil instance = new JdbcUtil();
	private static DataSource ds;
	
	static {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java.comp/env/jdbc/mysql");
			System.out.println("커넥션 풀 생성완료!");
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public JdbcUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

}
