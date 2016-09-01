package dustinkieler.flauxbam.gameobject;

/**
 * Represents a playing card.
 * A playing card has a suit - Diamonds, Hearts, Clubs, or Spades,
 * and a rank from Ace (1) to King (13).
 * @author DustinKieler
 * 
 */
public class Card {
	
	/**
	 * Suit of a playing card.
	 * @author DustinKieler
	 */
	public enum Suit {
		DIAMONDS, HEARTS, CLUBS, SPADES;
	}
	
	/**
	 * Rank of a playing card.
	 * @author DustinKieler
	 */
	public enum Rank {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, TEN, JACK, QUEEN, KING;
		
		/**
		 * Returns the value (rank) of the playing card.
		 * Since our order is sequential, we can just use ordinal() + 1.
		 * @return the value (rank) of the playing card.
		 */
		public int value() {
			return ordinal() + 1;
		}
		
	}
	
	private Suit suit;
	private Rank rank;
	
	/**
	 * Creates a new playing card.
	 * @param suit the suit of the playing card.
	 * @param rank the rank of the playing card.
	 */
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	/**
	 * Returns the suit of the playing card.
	 * @return the suit of the playing card.
	 */
	public Suit cardSuit() {
		return suit;
	}
	
	/**
	 * Returns the rank of the playing card.
	 * @return the rank of the playing card.
	 */
	public Rank cardRank() {
		return rank;
	}
	
	/**
	 * Auto-generated in Eclipse using Source -- Generate hashCode() and equals().
	 * @return the hashcode for this playing card for use in equals().
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rank.value();
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	/**
	 * Determines if two playing cards are equal.
	 * Auto-generated in Eclipse using Source -- Generate hashCode() and equals().
	 * @param obj the object to compare.
	 * @return true if the rank and suit are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
	
}
