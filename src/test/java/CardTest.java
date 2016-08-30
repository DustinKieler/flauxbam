package test.java;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.java.Card;

public class CardTest {

	@Test
	public void testCard() {
		Card aCard = new Card(Card.Suit.CLUBS, Card.Rank.TWO);
		assertEquals(aCard.cardSuit(), Card.Suit.CLUBS);
		assertEquals(aCard.cardRank(), Card.Rank.TWO);
		// Experimenting with the 'new' style asserts
		assertThat(aCard.cardSuit(), not(Card.Suit.SPADES));
		assertThat(aCard.cardRank(), not(Card.Rank.KING));
	}

	@Test
	public void testCardSuit() {
		Card testSuitCard = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
		assertEquals(Card.Suit.HEARTS, testSuitCard.cardSuit());
		assertThat(Card.Suit.SPADES, not(testSuitCard.cardSuit()));
	}

	@Test
	public void testCardRank() {
		Card testRankCard = new Card(Card.Suit.SPADES, Card.Rank.KING);
		assertEquals(Card.Rank.KING, testRankCard.cardRank());
		assertThat(Card.Rank.FIVE, not(testRankCard.cardRank()));
	}

	@Test
	public void testEqualsObject() {
		// Compare two cards with the same suit but different ranks
		Card card1 = new Card(Card.Suit.SPADES, Card.Rank.SEVEN);
		Card card2 = new Card(Card.Suit.SPADES, Card.Rank.EIGHT);
		assertFalse(card1.equals(card2));
		
		// Compare two cards with different suits but the same rank
		card2 = new Card(Card.Suit.HEARTS, Card.Rank.SEVEN);
		assertFalse(card1.equals(card2));
		
		// Compare two cards with the same suit and rank
		card2 = new Card(Card.Suit.SPADES, Card.Rank.SEVEN);
		assert(card1.equals(card2));
		
		// Compare a null suit with a non-null suit
		card2 = new Card(null, Card.Rank.EIGHT);
		assertFalse(card1.equals(card2));
		
		// Compare a null rank with a non-null rank
		card2 = new Card(Card.Suit.SPADES, null);
		assertFalse(card1.equals(card2));
		
		// Compare a card to a card with null values
		card2 = new Card(null, null);
		assertFalse(card2.equals(card1));
		
		// Compare a null card with a non-null card
		card1 = null;
		assertFalse(card2.equals(card1));
	}

}
