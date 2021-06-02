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
	// �ϰ������� 
		return " �̸� : "+ super.getFirst_name() + "\n"+ " �Ի��� : " +super.getHire_date()+ "\n" +" �μ���ȣ : "+ super.getDepartment().getDepartment_id()+"\n" + 
				" �μ��̸� : " + super.getDepartment().getDepartment_name() +"\n"+" ���� : " + super.getLocation().getCity()+"\n";
	}

}
