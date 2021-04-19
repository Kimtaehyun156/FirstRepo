package Study;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {

	/*
	 * 			 # Comparator
	 * 			 - 구현하면 두 객체의 크기를 비교할때 사용하는 클래스가 되는 인터페이스 
	 * 			 - 객체간의 크기를 정할 때 사용된다 
	 * 			 
	 * 
	 */
	public static void main(String[] args) {
		String str1 = "yes";
		String str2 = new String("yes");
		
		System.out.println(str1== str2);
		System.out.println(str1.equals(str2));
		
		
		Grape podo1 = new Grape().setGno("P0D01588");
		Grape podo2 = new Grape().setGno("P0D01588");
		
		System.out.println(podo1 == podo2);
		System.out.println(podo1.equals(podo2));
		
		
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for(int i =0; i< 10; ++i) {
			grapes.addLast(new Grape()
					.setGno(String.format("Podo%04d",(int)(Math.random()*1000)))
					.setLocation((int)(Math.random()*Grape.LOCATIONS))
					.setFruit((int)(Math.random()*11+30)));
			
			System.out.println(grapes.getLast());
		}
		
		//포도는 무엇을 기준으로 정렬해줄까 
		Collections.sort(grapes, new 포도분류기_포도알맹이_오름차순());
		
		System.out.println("알맹이 오름차순 정렬후 ");
		
		for( Grape grape : grapes) {
			System.out.println(grape);
		}
		
		
		// 연습 1: 포도 알맹이 기준 내림차순 정렬해보기
		Collections.sort(grapes, new 포도분류기_포도알맹이_내림차순());
		
		System.out.println("알맹이 내림차순 정렬후 ");
		
		for( Grape grape : grapes) {
			System.out.println(grape);
		}
		
		// 연습 2: 포도 gno 기준 내림차순 정렬해보기 
		System.out.println(" 포도 gno 기준 내림차순 정렬후 ");
		Collections.sort(grapes, new 포도분류기_gno기준_내림차순());
		for( Grape grape : grapes) {
			System.out.println(grape);	
		}
		
		// 강사님  포도분류기_GNO기준_내림차순
		System.out.println(" 강사님  포도분류기_GNO기준_내림차순");
		Collections.sort(grapes, new 포도분류기_GNO기준_내림차순());
		for( Grape grape : grapes) {
			System.out.println(grape);	
		}
	}
	
	
}

class 포도분류기_gno기준_내림차순 implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		int resultO1 = 0 ;
		int resultO2 = 0 ;
		
		for(int i =4; i < o1.gno.length(); ++i) {
			if(i == 5) {
				resultO1 += o1.gno.charAt(i)*1000;
			}else if( i == 6) {
				resultO1 += o1.gno.charAt(i)*100;
			}else if( i == 7) {
				resultO1 += o1.gno.charAt(i)*10;
			}else {
				resultO1 += o1.gno.charAt(i);
			}
		}
		for(int i =4; i < o2.gno.length(); ++i) {
			if(i == 5) {
				resultO2 += o2.gno.charAt(i)*1000;
			}else if( i == 6) {
				resultO2 += o2.gno.charAt(i)*100;
			}else if( i == 7) {
				resultO2 += o2.gno.charAt(i)*10;
			}else {
				resultO2 += o2.gno.charAt(i);
			}
		}
		// 문자열의 알파벳순서비교는 이미 String 클래스 compareTo메서드에 구현이 되어있다 
		// return o1.gno.compareTo(02.gno)* -1;
//		if(o1.gno.compareTo(o2.gno) > o2.gno.compareTo(o1.gno)) {
//		if(o1.gno.charAt(o1.gno.length())  > o2.gno.charAt(o2.gno.length()) ) {
		if(resultO1> resultO2) {	
			return -1;
		}else if(o1.gno.equals(o2.gno)){
			return 0;			
		}else {
			return 1;
		}
	}
}

class 포도분류기_GNO기준_내림차순 implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		String gno1 =o1.gno;
		String gno2 =o2.gno;
		
		int min_len = Math.min(gno1.length(), gno2.length());
		
		for(int i=0; i< o1.gno.length(); ++i) {
			if(gno1.charAt(i) > gno2.charAt(i)) {
				return -1;
			}else if(gno1.charAt(i)< gno2.charAt(i)) {
				return 1;
			}
		}
		if(gno1.length() == gno2.length()) {
			return 0;
		}else if(gno1.length() > gno2.length()) {
			return -1;
		}else {
			return 1;
		}
	}
}

class 포도분류기_포도알맹이_오름차순 implements Comparator<Grape>{
	@Override
	/*	
	 * 		# comparator의 규칙 
	 *  	- compare 메서드의 리턴값이 1이면 o1과 o2의 순서를 바꾼다
	 *  	- compare 메서드의 리턴값이 0이면 같은 크기로 취급한다 
	 *  	- compare 메서드의 리턴값이 -1이면 o1과 o2의 순서를 그대로 유지한다  
	 */
	
	public int compare(Grape o1, Grape o2) {
		if(o1.fruit <o2.fruit) {
			return -1;
		}else if( o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;
		}
		
	}
}

class 포도분류기_포도알맹이_내림차순 implements Comparator<Grape>{
	@Override
	/*	
	 * 		# comparator의 규칙 
	 *  	- compare 메서드의 리턴값이 1이면 o1과 o2의 순서를 바꾼다
	 *  	- compare 메서드의 리턴값이 0이면 같은 크기로 취급한다 
	 *  	- compare 메서드의 리턴값이 -1이면 o1과 o2의 순서를 그대로 유지한다  
	 */
	
	public int compare(Grape o1, Grape o2) {
		if(o1.fruit <o2.fruit) {
			return 1;
		}else if( o1.fruit == o2.fruit) {
			return 0;
		}else {
			return -1;
		}
		
	}
}


class Grape{
	private static String[] locationNames ={"말레이시아", "칠레","싱가포르","브라질","호주"};
	public static int LOCATIONS = locationNames.length;
	
	
	String gno;
	int location;
	int fruit;
	
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		location = location_id;
		return this;
	}
	
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	/*
	 *		# equals()
	 *		- Object 메서드
	 *		- 같은 객체인지 비교할때 어떤 동작으로 구분해야 하는지를 구현해놓은 메서드 
	 *		- 원래 기본동작은 주소값 비교였다 
	 * */
	@Override
	public boolean equals(Object obj) {
		return this.gno == ((Grape)obj).gno;
	}
	
	public boolean equals(Grape grape) {
		return this.gno == grape.gno;
	}

	/*		#toString()
	 *		모든 객체에 포함되어있는 메서드 (Object메서드)
	 *		- 이 인스턴스를 문자열로 표현한다면?을 구현한 메서드이다 
	 *		- System.out.println()은 사실 전달한 인스턴스의 toString()메서드를 호출하는 메서드이다
	 *		  메서드의 결과를 콘솔에 출력하는 메서드이다  
	 *		- Object 클래스의 toString() 기본동작은 "클래스명@주소값" 이다
	 */
	
	@Override
	public String toString() {
		return this.gno + "/" + this.fruit + "/" + locationNames[location] +"(" +location+ ")" ;
	}
	
}