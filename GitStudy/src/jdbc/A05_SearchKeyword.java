package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.model.Employee;

public class A05_SearchKeyword {
	
	/*
	 	first_name에 사용자가 입력한 내용이 포함되어있는 모든사원을 조회해보세요 
	 	(단 , 검색어는 두글자 이상이어야 하고 두글자 이상이 아니라면 예외가 발생해야 함)
	 */
	
	public static void main(String[] args) {
		
		System.out.println("검색할문자 두글자이상 입력해주세요 ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ConnectionPool pool = new ConnectionPool(5);
		
		
		if( str.length() <2) {
			try {
				Exception e = new Exception("두글자 이하 입력헀음");
				throw e;				
			}catch (Exception e) {
				System.out.println(" 두글자 이상만 입력해주세요!!");
				e.printStackTrace();
			}
		}
		
		String sql = "SELECT * FROM employees WHERE first_name LIKE ? ";
		
		try(
				JdbcConnection jconn = pool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			)
		{
			pstmt.setString(1,String.format("%%%s%%", str));
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//System.out.println(rs.getString("first_name"));
				System.out.printf("%-10d%-15s%-15s%-10d\n" ,
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary")	
					);
			}
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
