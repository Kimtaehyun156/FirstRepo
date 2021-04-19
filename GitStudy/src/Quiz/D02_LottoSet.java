package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D02_LottoSet {

	/*
	 * 1부터 45사이의 중복없는 랜덤숫자 7개로 이루어진 HashSet을 생성하는 메서드를 작성 반환하는 메서드 작성후 테스트해보기
	 * 
	 */

	public static void main(String[] args) {

		// 그냥 보이드로 출력 info
		System.out.println("그냥출력");
		info();

		// HashSet 타입의 리턴받아서 출력 info2
		HashSet<Integer> lottoNum3 = new HashSet<>();
		lottoNum3 = (HashSet<Integer>) info2();
		System.out.println("HashSet 타입의 리턴 출력");
		System.out.println(lottoNum3);

		// ArrayList로 정렬해서 출력 info4
		System.out.println("Array출력");
		System.out.println(info4());

		// 그냥 배열로 출력 info3
		System.out.println("그냥 배열로 출력");
		System.out.println(Arrays.toString(info3()));
		
		//그냥 배열로출력 (강사님 풀이용)
		System.out.println("강사님 풀이용 배열로 출력");
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
	 * 1부터 45사이의 중복없는 랜덤숫자 7개로 이루어진 HashSet을 생성하는 메서드를 작성 반환하는 메서드 작성후 테스트해보기
	 */

}
