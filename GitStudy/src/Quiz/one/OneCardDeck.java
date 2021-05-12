package Quiz.one;

import java.util.ArrayList;

public class OneCardDeck {
	
	ArrayList<Card> cards;
	
	public OneCardDeck() {
		
		cards = new ArrayList<>();
		
		// 하트 JOKER를 칼라조커  스페이드 JOKER 흑백조커 사용
		
		for(String rank : Card.RANKS) {
			for( Character suit : Card.SUITS) {
				if( suit.equals('◆') && rank.equals("JOKER")) {
					continue;
				}else if( suit.equals('♣') && rank.equals("JOKER")) {
					continue;
				}else {
					cards.add(new Card(suit,rank));					
				}
			}
		}
		
		System.out.println(cards);
	}
	
	public static void main(String[] args) {
		new OneCardDeck();
	}
}
