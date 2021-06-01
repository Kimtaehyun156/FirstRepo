package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A02_CRUD {
	
	
	static {
		try {
			Class.forName(DBConnecter.driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url=null;
	
	static Connection getConnection(String id, String password) {
		try {
			return DriverManager.getConnection(DBConnecter.url,DBConnecter.id,DBConnecter.password);
		} catch (SQLException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		/*
		 	# JDBC���� SELECT �� ResultSet�� ��ȯ�Ѵ�
		 	- �׿� DML(INSERT , UPDATE , DELETE )�� ����� ���� ��������ȯ�Ѵ� 
		 	
		 	SELECT�� PreparedStatement�� executeQuery()�޼��带 ����ϰ� 
		 	�������� executeUpdate() �޼��带 ����Ѵ� 
		 */

		String sql ="INSERT INTO fruits(fid ,fname,fcolor) VALUES(fruits_seq3.nextval,'Orange','Orange')";
		String sql2 ="SELECT * FROM fruits ORDER BY fid";
		
		try(
				Connection conn = DBConnecter.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		){
			// INSERT , UPDATE ,DELETE 
			for(int i =0; i<10; ++i) {
				int rows = pstmt.executeUpdate();
				System.out.println(rows + " row(s) update");
				System.out.println("����");
				
			}
			
			// SELECT 
			ResultSet rs = pstmt2.executeQuery();
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\n",
						rs.getInt(1),rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
