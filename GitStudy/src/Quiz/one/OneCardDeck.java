package Quiz.one;

import java.util.ArrayList;

public class OneCardDeck {
	
	ArrayList<Card> cards;
	
	public OneCardDeck() {
		
		cards = new ArrayList<>();
		
		// ��Ʈ JOKER�� Į����Ŀ  �����̵� JOKER �����Ŀ ���
		
		for(String rank : Card.RANKS) {
			for( Character suit : Card.SUITS) {
				if( suit.equals('��') && rank.equals("JOKER")) {
					continue;
				}else if( suit.equals('��') && rank.equals("JOKER")) {
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
