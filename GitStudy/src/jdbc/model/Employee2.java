package jdbc.model;

import java.io.PrintStream;
import java.util.Date;

public class Employee2 extends Employee{


	private	String first_name;
	private String city;
	private int department_id;
	private String department_name;
	private Date hire_date;
	
	public Employee2(String first_name ,Date hire_date ,int department_id , String department_name , String city) {
		setFirst_name(first_name);	
		setHire_date(hire_date);
		setDepartment(new Department());
		setLocation(new Location());
		getDepartment().setDepartment_id(department_id);
		getDepartment().setDepartment_name(department_name);
		getLocation().setCity(city);
	}
		
	@Override
	public String toString() {
	// 하고싶은대로 
		return " 이름 : "+ super.getFirst_name() + "\n"+ " 입사일 : " +super.getHire_date()+ "\n" +" 부서번호 : "+ super.getDepartment().getDepartment_id()+"\n" + 
				" 부서이름 : " + super.getDepartment().getDepartment_name() +"\n"+" 지역 : " + super.getLocation().getCity()+"\n";
	}

}
