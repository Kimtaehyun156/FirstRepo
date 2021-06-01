package jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		try(BufferedReader in = new BufferedReader(new FileReader("./data/text/DB.txt"))) {
			driverName =in.readLine();
			url = in.readLine();
			id = in.readLine();
			password = in.readLine();
			System.out.println("[Info]Initilize static variables");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
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
	static Connection getConnection() {
		try {
			return DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			return null;
		}
	}
	
	

	
}
