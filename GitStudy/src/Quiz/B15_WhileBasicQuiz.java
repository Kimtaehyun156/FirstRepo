package Quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 * while���� �̿��Ͽ�
		 * 
		 * 1. 1���� 100������ 3�ǹ���� ���� 2. 200���� 1���� ��� 3. continue�� �̿��Ͽ� 300~ 500 ������ 7�� �����
		 * ��� 4. 1���� 200������ ������ 2�ǹ���� �ƴϰ� 3�ǹ�����ƴ� ���ڵ��� ����
		 */

		// 1. 1���� 100������ 3�ǹ���� ����

		int i = 0;
		int sum = 0;
		while (i++ <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1�� : 1���� 100������ 3�ǹ���� ������ : " + sum + "�Դϴ�");

		System.out.println("=========================================================");

		// 2. 200���� 1���� ���
		System.out.println("2�� : 200���� 1���� ���");
		i = 200;
		while (i > 0) {
			System.out.print(i + "\t");
			i--;
		}
		System.out.println();
		System.out.println("=========================================================");

		// 3. continue�� �̿��Ͽ� 300 ~ 500 ������ 7�� ����� ���
		i = 299;
		System.out.println("3�� : coutinue�� �̿��Ͽ� 300���� 500 ������ 7�ǹ��");
		while (i++ <= 500) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("=========================================================");

		// 4. 1���� 200������ ������ 2�ǹ���� �ƴϰ� 3�ǹ���� �ƴ� ���ڵ��� ����
		i = 1;
		int sum2 = 0;
		System.out.println("4�� :1���� 200������ ������ 2�ǹ���� �ƴϰ� 3�ǹ�����ƴ� ���ڵ��� ����");
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum2 += i;
				// System.out.println(i); //üũ��
			}
			i++;
		}
		System.out.println("2�ǹ���� �ƴϰ� 3�ǹ�����ƴ� ���ڵ��� ������ :" + sum2);

	}

}
