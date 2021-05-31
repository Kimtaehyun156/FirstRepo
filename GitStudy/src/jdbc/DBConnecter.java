package jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnecter {
	
	static String driverName;
	static String url ;
	static String id ; 
	static String password ;
	
	
	static {
		File file = new File("./data/text/DB.txt");
		try(Scanner scan = new Scanner(file)) {
			while(scan.hasNextLine()) {
				driverName =scan.nextLine();
				url =scan.nextLine();
				id  =scan.nextLine();
				password   =scan.nextLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static {
		try {
			Class.forName(driverName);
			System.out.println("드라이버 로드완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection(String id, String password) {
		try {
			return DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			return null;
		}
	}
	

	
}
