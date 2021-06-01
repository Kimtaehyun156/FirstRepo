package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_FileBasedHikariCP {

	
	// File Based 방식으로 HikariCP 구동해보기 
	/*
	// Examines both filesystem and classpath for .properties file
	HikariConfig config = new HikariConfig("/some/path/hikari.properties");
	HikariDataSource ds = new HikariDataSource(config);
	
	dataSourceClassName=org.postgresql.ds.PGSimpleDataSource
	dataSource.user=test
	dataSource.password=test
	dataSource.databaseName=mydb
	dataSource.portNumber=5432
	dataSource.serverName=localhost
	
	*/
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig("./data/text/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);
		

		String sql = "SELECT * FROM employees";

		try (
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				) 
		{
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
