package dustinkieler.flauxbam.gameobject;

import java.util.Collections;
import java.util.Stack;

/**
 * Represents a standard deck of 52 playing cards.
 * @author DustinKieler
 *
 */
public class Deck {

	private Stack<Card> cards;
	
	/**
	 * Constructs a new stack of cards and calls to populate the deck.
	 */
	public Deck() {
		cards = new Stack<>();
		formDeck();
	}
	
	/**
	 * Populates the deck with 52 cards.
	 */
	public void formDeck() {
		
		shuffle();
	}
	
	/**
	 * Shuffles the cards using a Fisher-Yates shuffle.
	 */
	private void shuffle() {
		Collections.shuffle(cards);
	}
	
	/**
	 * Removes and returns the top card of the deck.
	 * @return the top card of the deck.
	 */
	public Card drawCard() {
		return cards.pop();
	}
	
	/**
	 * Returns the number of cards left in the deck.
	 * @return the number of cards left in the deck.
	 */
	public int cardsLeftInDeck() {
		return cards.size();
	}
	
}
