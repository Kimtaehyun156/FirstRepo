package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.model.Employee;

public class A05_SearchKeyword {
	
	/*
	 	first_name�� ����ڰ� �Է��� ������ ���ԵǾ��ִ� ������� ��ȸ�غ����� 
	 	(�� , �˻���� �α��� �̻��̾�� �ϰ� �α��� �̻��� �ƴ϶�� ���ܰ� �߻��ؾ� ��)
	 */
	
	public static void main(String[] args) {
		
		System.out.println("�˻��ҹ��� �α����̻� �Է����ּ��� ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ConnectionPool pool = new ConnectionPool(5);
		
		
		if( str.length() <2) {
			try {
				Exception e = new Exception("�α��� ���� �Է�����");
				throw e;				
			}catch (Exception e) {
				System.out.println(" �α��� �̻� �Է����ּ���!!");
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
