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
			// ������ �������� ��Ÿ �����͵��� ��������� 
			ResultSetMetaData meta = rs.getMetaData();

			System.out.println("�ø��� ��ΰ� ? : " + meta.getColumnCount()+ "��");
			
			for( int i= 1 , len = meta.getColumnCount(); i <= len; ++i) {
				System.out.println("================================================");
				System.out.println( i+ "���� �÷��� �̸��� ? " +meta.getColumnLabel(i));
				System.out.println( i+ "���� �÷��� Ÿ���� ? " +meta.getColumnTypeName(i));
				System.out.println( i+ "���� �÷��� ũ��� ? " +meta.getPrecision(i));  // DATE �����ʹ� ũ�Ⱑ 0���� ���´�
				System.out.println( i+ "���� �÷��� ũ��� ? " +meta.getColumnDisplaySize(i));  
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
