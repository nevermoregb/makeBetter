package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
	private JdbcUtil ju;
	
	//삽입(C) insert into table 1 value 2
	public int insert(BoardVo vo) {
		Connection conn;
		PreparedStatement pstmt;
		String query = "insert into board (num, title, writer, content, regdate, cnt) values (0,?, ?, ?, default, 0)";
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			int int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//조회(R) select * from  table 
	
	//수정(U) update table set 1=2 where num=?
	
	//삭제(D) delete from table where num=1
}
