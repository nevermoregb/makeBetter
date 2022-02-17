package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcConnectUtil {
	
	private static JdbcConnectUtil instance = new JdbcConnectUtil();
	
	private static DataSource ds;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java.comp/env/jdbc/mysql");
			System.out.println("connection pool has created!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public JdbcConnectUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
}