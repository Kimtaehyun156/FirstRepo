package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D02_LottoSet {

	/*
	 * 1���� 45������ �ߺ����� �������� 7���� �̷���� HashSet�� �����ϴ� �޼��带 �ۼ� ��ȯ�ϴ� �޼��� �ۼ��� �׽�Ʈ�غ���
	 * 
	 */

	public static void main(String[] args) {

		// �׳� ���̵�� ��� info
		System.out.println("�׳����");
		info();

		// HashSet Ÿ���� ���Ϲ޾Ƽ� ��� info2
		HashSet<Integer> lottoNum3 = new HashSet<>();
		lottoNum3 = (HashSet<Integer>) info2();
		System.out.println("HashSet Ÿ���� ���� ���");
		System.out.println(lottoNum3);

		// ArrayList�� �����ؼ� ��� info4
		System.out.println("Array���");
		System.out.println(info4());

		// �׳� �迭�� ��� info3
		System.out.println("�׳� �迭�� ���");
		System.out.println(Arrays.toString(info3()));
		
		//�׳� �迭����� (����� Ǯ�̿�)
		System.out.println("����� Ǯ�̿� �迭�� ���");
		System.out.println(Arrays.toString(getLottArray()));
		
	}

	static void info() {
		HashSet<Integer> lottoNum = new HashSet<>();

		while (true) {
			lottoNum.add((int) (Math.random() * 45) + 1);
			if (lottoNum.size() == 7) {
				break;
			}
		}
		System.out.println(lottoNum);
	}

	public static HashSet<Integer> info2() {
		HashSet<Integer> lottoNum2 = new HashSet<>();
		while (true) {
			lottoNum2.add((int) (Math.random() * 45) + 1);
			if (lottoNum2.size() == 7) {
				break;
			}
		}
		return lottoNum2;
	}

	public static Integer[] info3() {
		HashSet<Integer> lottoNum2 = new HashSet<>();
		while (true) {
			lottoNum2.add((int) (Math.random() * 45) + 1);
			if (lottoNum2.size() == 7) {
				break;
			}
		}
		Integer[] arr = new Integer[lottoNum2.size()];
		lottoNum2.toArray(arr);
		return arr;
	}
	
	public static int[] getLottArray() {
		Integer[] lotto = info3();
		int[] result = new int[7];
		for(int i=0; i<7; ++i) {
			result[i] = lotto[i];
		}
		return result;
	}

	public static ArrayList<Integer> info4() {
		HashSet<Integer> lottoNum2 = new HashSet<>();
		while (true) {
			lottoNum2.add((int) (Math.random() * 45) + 1);
			if (lottoNum2.size() == 7) {
				break;
			}
		}
		ArrayList<Integer> list = new ArrayList<>(lottoNum2);
		Collections.sort(list);

		return list;
	}

	/*
	 * 1���� 45������ �ߺ����� �������� 7���� �̷���� HashSet�� �����ϴ� �޼��带 �ۼ� ��ȯ�ϴ� �޼��� �ۼ��� �׽�Ʈ�غ���
	 */

}
