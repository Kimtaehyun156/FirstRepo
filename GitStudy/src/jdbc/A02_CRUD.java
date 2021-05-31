package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
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
		
		Connection conn = DBConnecter.getConnection(DBConnecter.id,DBConnecter.password);
		
		if( conn != null) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
