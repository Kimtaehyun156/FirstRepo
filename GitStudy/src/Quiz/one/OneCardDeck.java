package Quiz.one;

import java.util.ArrayList;
import java.util.Collections;

public class OneCardDeck {
	
	ArrayList<Card> cards;
	ArrayList<Card> table;
	
	public OneCardDeck() {
		
		cards = new ArrayList<>();
		table = new ArrayList<>();
		
		// 하트 JOKER를 칼라조커  스페이드 JOKER 흑백조커 사용
		for(String rank : Card.RANKS) {
			for( Character suit : Card.SUITS) {
				if( suit.equals('◆') && rank.equals("JOKER")) {
					continue;
				}else if( suit.equals('♣') && rank.equals("JOKER")) {
					continue;
				}else if(rank.equals("A")) {
					Card card = new Card(suit,rank);
					card.setAttack(true);
					card.setAttackValue(3);
					cards.add(card);
				}else if(rank.equals("2")) {
					Card card = new Card(suit,rank);
					card.setAttack(true);
					card.setAttackValue(2);
					cards.add(card);
				}else if(suit.equals("♥") && rank.equals("JOKER")) {
					Card card = new Card(suit,rank);
					card.setAttack(true);
					card.setAttackValue(9);
					cards.add(card);
				}else if(suit.equals("♠") && rank.equals("JOKER")) {
					Card card = new Card(suit,rank);
					card.setAttack(true);
					card.setAttackValue(7);
					cards.add(card);
				}else {
					cards.add(new Card(suit,rank));					
				}
			}
		}
		
		shuffle();
	}
	
	public Card tableCard() {
		return table.get(table.size() -1 );
	}
	
	public boolean submitCard(Card card) {
		
		table.add(card);
		
		return false;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		
		if(cards.size() == 0) {
			
			for(int i =0 , len= table.size();  i< len; ++i) {
				cards.add(table.remove(0));
			}
			
			shuffle();
			System.out.println("카드가 부족해서 테이블에 카드를 가져옴 ");
		}
		
		return cards.remove(0);
	}
}
