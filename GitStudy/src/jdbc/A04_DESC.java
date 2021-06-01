package jdbc;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jdbc.model.Employee;

public class A04_DESC {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try(
				Connection conn =DBConnecter.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			// 가져온 데이터의 메타 데이터들을 보고싶을떄 
			ResultSetMetaData meta = rs.getMetaData();

			System.out.println("컬림이 몇개인가 ? : " + meta.getColumnCount()+ "개");
			
			for( int i= 1 , len = meta.getColumnCount(); i <= len; ++i) {
				System.out.println("================================================");
				System.out.println( i+ "번쨰 컬럼의 이름은 ? " +meta.getColumnLabel(i));
				System.out.println( i+ "번쨰 컬럼의 타입은 ? " +meta.getColumnTypeName(i));
				System.out.println( i+ "번쨰 컬럼의 크기는 ? " +meta.getPrecision(i));  // DATE 데이터는 크기가 0으로 나온다
				System.out.println( i+ "번쨰 컬럼의 크기는 ? " +meta.getColumnDisplaySize(i));  
			}
			
			
			
			//Employee e = new Employee();
			
//			Class<?> employee = Class.forName("jdbc.model.Employee");
//			
//			for( Method method : employee.getMethods()) {
//				System.out.println(method.getReturnType());
//			}
			
			while(rs.next()) {
				Employee e = new Employee(rs);
				System.out.println(e.getFirst_name());
				System.out.println(e.getLast_name());
			}
		
			
		}
	
	}
