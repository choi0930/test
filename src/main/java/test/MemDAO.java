package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemDAO() {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choidb?useUnicode=true&characterEncoding=utf8"
//					, "root", "1234");
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/choidb");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} //end MebDAO

	public void addMember(Member vo) {
		try {
			con = dataFactory.getConnection();
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			String tel = vo.getTel();
			String tel2 = vo.getTel2();
			String address = vo.getAddress();
			String query = "insert into member(id, pwd, name, email, tel, tel2, address) values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, tel);
			pstmt.setString(6, tel2);
			pstmt.setString(7, address);
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}
