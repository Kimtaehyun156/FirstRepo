package Quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 * while문을 이용하여
		 * 
		 * 1. 1부터 100까지의 3의배수의 총합 2. 200부터 1까지 출력 3. continue를 이용하여 300~ 500 사이의 7의 배수만
		 * 출력 4. 1부터 200까지의 숫자중 2의배수도 아니고 3의배수도아닌 숫자들의 총합
		 */

		// 1. 1부터 100까지의 3의배수의 총합

		int i = 0;
		int sum = 0;
		while (i++ <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1번 : 1부터 100까지의 3의배수의 총합은 : " + sum + "입니다");

		System.out.println("=========================================================");

		// 2. 200부터 1까지 출력
		System.out.println("2번 : 200부터 1까지 출력");
		i = 200;
		while (i > 0) {
			System.out.print(i + "\t");
			i--;
		}
		System.out.println();
		System.out.println("=========================================================");

		// 3. continue를 이용하여 300 ~ 500 사이의 7의 배수만 출력
		i = 299;
		System.out.println("3번 : coutinue를 이용하여 300에서 500 사이의 7의배수");
		while (i++ <= 500) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("=========================================================");

		// 4. 1부터 200까지의 숫자중 2의배수도 아니고 3의배수도 아닌 숫자들의 총합
		i = 1;
		int sum2 = 0;
		System.out.println("4번 :1부터 200까지의 숫자중 2의배수도 아니고 3의배수도아닌 숫자들의 총합");
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum2 += i;
				// System.out.println(i); //체크용
			}
			i++;
		}
		System.out.println("2의배수도 아니고 3의배수도아닌 숫자들의 총합은 :" + sum2);

	}

}
