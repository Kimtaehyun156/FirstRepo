package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A03_jdbcTransaction {

	public static void main(String[] args) {
		
		String sql = "UPDATE fruits SET fcolor= 'zzzz' WHERE fname='Orange'";
		try( 
				Connection conn = DBConnecter.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			)
		{
			// JDBC로 처음 연결을 생성하면 기본적으로 AutoCommit이 활성화되어있다 
			// 트랜잭션을 직접 제어하기 위해서는 자동 커밋을 비활성화를 해야한다 
			conn.setAutoCommit(false);
			
			int rows = pstmt.executeUpdate();
			System.out.println( rows + " 행이 업데이트되었습니다");
			
			if( rows %2 ==0) {
				conn.commit();
				System.out.println("커밋완료");
			} else {				
				conn.rollback();
				System.out.println("하려다가 취소되었습니다");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
