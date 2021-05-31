package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_ConnectionPractice {

	
	/*
	 	사용자로부터 부서번호를 입력 받으면 
	 	해당 부서의 모든 사원들의 모든 정보를 조회해서 콘솔에 보기 좋게 출력해보세요 
	 */
	
	
	//static 블록 - 해당클래스가 한번이라도 언급되면 static 블록을 최초로 한번 실행한다 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	
	static Connection getConnection(String id, String password) {
		try {
			return DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		String sql = "SELECT * FROM employees WHERE department_id = " + 50;
			
		try (	Connection conn = getConnection("hr","1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
			System.out.println("EMPNO\t   FIRST_NAME\t     LAST_NAME");
			while(rs.next()) {
				System.out.printf("%-10d %-13s\t%s\n",rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
