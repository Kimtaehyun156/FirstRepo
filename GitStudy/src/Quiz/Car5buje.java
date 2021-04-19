package Quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;

public class Car5buje {

	/*
	 * �������� ����ȣ �������� 
	 * �� : 1 , 6 
	 * ȭ : 2 , 7 
	 * �� : 3 , 8 
	 * �� : 4 , 9 
	 * �� : 5 , 0 
	 * �������� / �����,���Ƶ��� , ���� ��
	 * 
	 * ������( MONDAY 1) 
	 * ȭ����(TUESDAY 2 ) 
	 * ������ (WEDNESDAY 3) 
	 * ����� (THURSDAY 4) 
	 * �ݿ��� (FRIDAY 5) 
	 * ����� (SATURDAY 6) 
	 * �Ͽ��� (SUNDAY 7)
	 */

	public static void CreateCar() {
		Car car1 = new Car();
		LocalDate today = LocalDate.now();
		// LocalDate today = LocalDate.of(2021, 04, 20);
		DayOfWeek dow = today.getDayOfWeek();

		if (dow.equals(DayOfWeek.MONDAY)) { // ������
			if (car1.LastNum % 10 != 1) {
				if (car1.LastNum % 10 != 6) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("����")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}

		} else if (dow.equals(DayOfWeek.TUESDAY)) { // ȭ����
			if (car1.LastNum % 10 != 2) {
				if (car1.LastNum % 10 != 7) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("����")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		}else if (dow.equals(DayOfWeek.WEDNESDAY)) { // ������
			if (car1.LastNum % 10 != 3) {
				if (car1.LastNum % 10 != 8) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("����")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		} else if (dow.equals(DayOfWeek.THURSDAY)) { // �����
			if (car1.LastNum % 10 != 4) {
				if (car1.LastNum % 10 != 9) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("����")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		} else if (dow.equals(DayOfWeek.FRIDAY)) { // �ݿ���
			if (car1.LastNum % 10 != 5) {
				if (car1.LastNum % 10 != 0) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("����")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < 200; ++i) {
			CreateCar();
		}
	}
}

class Car {
	String[] cenName = { "��", "��", "��", "��", "��", "��", "��" };

	String area; // ����
	int firstNum; // ���ڹ�ȣ
	String centerName = "";
	int LastNum; // ���ڹ�ȣ
	int babyInthecar;
	String checkBaby = "";
	String cartype = "";
	int LightCarCheck;
	int Disabled;
	String DisabledCheck = "";

	public Car() {
		this.firstNum = (int) (Math.random() * 99) + 1;
		this.centerName = cenName[(int) (Math.random() * 6)];
		this.LastNum = (int) (Math.random() * 9999) + 1;
		this.babyInthecar = (int) (Math.random() * 2);
		this.LightCarCheck = (int) (Math.random() * 4);
		this.Disabled = (int) (Math.random() * 2);

		if (LightCarCheck == 0) {
			this.cartype = "����";
		} else if (LightCarCheck == 1) {
			this.cartype = "������";
		} else if (LightCarCheck == 2) {
			this.cartype = "������";
		} else if (LightCarCheck == 3) {
			this.cartype = "������";
		}

		this.DisabledCheck = Disabled == 1 ? "�������" : "���������";
		this.checkBaby = babyInthecar == 1 ? "���Ƶ�������" : "���ƹ̵�������";
	}

}