package dustinkieler.flauxbam.gameobject;

import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck() {
		cards = new Stack<>();
	}
	
	public int cardsLeftInDeck() {
		return cards.size();
	}
	
}
