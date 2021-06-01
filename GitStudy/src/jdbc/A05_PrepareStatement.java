package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_PrepareStatement {
	
	public static void main(String[] args) {
		
		//사용자로부터 입력받아 3개의 값을 입력받아  INSERT한다고 가정 
		String fname = "Kiwi";
		String fcolor = "Purple";
		
		//보안 취약점 (SQL Injection) 
		//String sql = "INSERT INTO efruits VALUES(fruit_seq3.nextval," +fname+"," + fcolor+")";
		
		
		// PrepareStatement에 준비시킬 쿼리문에 변수가 필요하다면 변수자리는 ?로 채운다 
		String sql = "INSERT INTO fruits VALUES(fruits_seq3.nextval ,? ,?)";
		
		ConnectionPool pool = new ConnectionPool(10);
		
		try(
				Connection conn = pool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			)
		{
			// 다음과 같이 ?를 채울수 있다 
			pstmt.setString(1,  fname);
			pstmt.setString(2,  fcolor);
			
			// 
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
