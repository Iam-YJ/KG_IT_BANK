package board.boardDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import board.boardDTO.BoardDTO;

public class BoardDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private static DataSource ds;
	
	private static BoardDAO instance;
	
	private BoardDAO(){
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	public static BoardDAO getInstance() {
		if(instance == null) {
			instance = new BoardDAO();
		}
		
		return instance;
	}
	
	public ArrayList<BoardDTO> makeList(ResultSet rs){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		try {
			while(rs.next()) {
				int seq = rs.getInt("seq");
				String id = idCut(rs.getString("id"));
				String name = rs.getString("name");
				String title = titleCut(rs.getString("title"));
				String content = rs.getString("content");
				String filename = rs.getString("filename");
				int hit = rs.getInt("hit");
				Date logtime = rs.getDate("logtime");
				BoardDTO dto = new BoardDTO(seq, id, name, title, content, filename, hit, logtime);
				
				list.add(dto);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(list.isEmpty()) {
			list = null;
		}else {
			list.trimToSize();
		}
		
		return list;
	}
	
	private String titleCut(String title) {
		if(title.length() >= 10) {
			return title.substring(0,10) + "...";
		}else {
			return title; 
		}
	}
	
	private String idCut(String id) {
		if(id.length() >= 4) {
			return id.substring(0,4) + "...";
		}else {
			return id; 
		}
	}
	
	public ArrayList<BoardDTO> getList(){
		String sql = "select * from board order by seq desc";
		ArrayList<BoardDTO> list = null;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			list = makeList(rs);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}


























