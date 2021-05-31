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
		 	# JDBC에서 SELECT 는 ResultSet을 반환한다
		 	- 그외 DML(INSERT , UPDATE , DELETE )은 적용된 행의 갯수를반환한다 
		 	
		 	SELECT는 PreparedStatement이 executeQuery()메서드를 사용하고 
		 	나머지는 executeUpdate() 메서드를 사용한다 
		 */
		
		Connection conn = DBConnecter.getConnection(DBConnecter.id,DBConnecter.password);
		
		if( conn != null) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
	}
}
