package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.model.Employee2;

public class A07_Join2 {
	
	public static void main(String[] args) {
		
		// 이름에 en이 들어가는 모든 사원의 이름 /부서번호 /부서명/도시를  모델을 이용해 
		// 저장한후 출력 
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "t250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		HikariDataSource ds = new HikariDataSource(config);
		
		
		String sql =  "SELECT first_name , department_id, department_name ,city FROM employees "
				+ "INNER JOIN departments USING ( department_id ) "
				+ "INNER JOIN locations USING ( location_id )  WHERE first_name LIKE ? ";
		String str = "en";
		try (
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = null;
			)
		{
			pstmt.setString(1,String.format("%%%s%%", str));
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Employee2 e = new Employee2(rs.getString("first_name"),rs.getInt("department_id"),rs.getString("department_name"),rs.getString("city"));
				
				System.out.println(e.toString());
			}
			
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
