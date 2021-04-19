package Quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;

public class Car5buje {

	/*
	 * 출입제한 끝번호 가져오기 
	 * 월 : 1 , 6 
	 * 화 : 2 , 7 
	 * 수 : 3 , 8 
	 * 목 : 4 , 9 
	 * 금 : 5 , 0 
	 * 제외차량 / 장애인,유아동승 , 경차 등
	 * 
	 * 월요일( MONDAY 1) 
	 * 화요일(TUESDAY 2 ) 
	 * 수요일 (WEDNESDAY 3) 
	 * 목요일 (THURSDAY 4) 
	 * 금요일 (FRIDAY 5) 
	 * 토요일 (SATURDAY 6) 
	 * 일요일 (SUNDAY 7)
	 */

	public static void CreateCar() {
		Car car1 = new Car();
		LocalDate today = LocalDate.now();
		// LocalDate today = LocalDate.of(2021, 04, 20);
		DayOfWeek dow = today.getDayOfWeek();

		if (dow.equals(DayOfWeek.MONDAY)) { // 월요일
			if (car1.LastNum % 10 != 1) {
				if (car1.LastNum % 10 != 6) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("경차")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}

		} else if (dow.equals(DayOfWeek.TUESDAY)) { // 화요일
			if (car1.LastNum % 10 != 2) {
				if (car1.LastNum % 10 != 7) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("경차")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		}else if (dow.equals(DayOfWeek.WEDNESDAY)) { // 수요일
			if (car1.LastNum % 10 != 3) {
				if (car1.LastNum % 10 != 8) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("경차")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		} else if (dow.equals(DayOfWeek.THURSDAY)) { // 목요일
			if (car1.LastNum % 10 != 4) {
				if (car1.LastNum % 10 != 9) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("경차")) {
					System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
					System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
				}
			}
		} else if (dow.equals(DayOfWeek.FRIDAY)) { // 금요일
			if (car1.LastNum % 10 != 5) {
				if (car1.LastNum % 10 != 0) {
					if (car1.babyInthecar == 0) {
						if (car1.Disabled == 0) {
							System.out.printf("%02d%s  %04d ", car1.firstNum, car1.centerName, car1.LastNum);
							System.out.printf("[%5s]  [%7s]  [%3s]\n", car1.DisabledCheck, car1.checkBaby, car1.cartype);
						}
					}
				} else if (car1.babyInthecar == 1 || car1.Disabled == 1 || car1.cartype.equals("경차")) {
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
	String[] cenName = { "머", "라", "다", "고", "누", "가", "바" };

	String area; // 지역
	int firstNum; // 숫자번호
	String centerName = "";
	int LastNum; // 숫자번호
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
			this.cartype = "경차";
		} else if (LightCarCheck == 1) {
			this.cartype = "소형차";
		} else if (LightCarCheck == 2) {
			this.cartype = "중형차";
		} else if (LightCarCheck == 3) {
			this.cartype = "대형차";
		}

		this.DisabledCheck = Disabled == 1 ? "장애차량" : "비장애차량";
		this.checkBaby = babyInthecar == 1 ? "유아동승차량" : "유아미동승차량";
	}

}