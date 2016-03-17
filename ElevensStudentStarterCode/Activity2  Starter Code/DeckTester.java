/**
 * This is a class that tests the Deck class.
 * 
 * Hannah Pang
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] firstDeckRanks = {"Ace", "Ace", "Ace", "Ace"};
		String[] firstDeckSuits = {"spades", "clubs", "diamonds", "hearts"};
		int[] firstDeckPointValues = {1, 1, 1, 1};
	    Deck firstDeck = new Deck(firstDeckRanks, firstDeckSuits, firstDeckPointValues);
	    
	    String[] secondDeckRanks = {"Two", "Three", "Four", "Five"};
	    String[] secondDeckSuits = {"diamonds", "diamonds", "diamonds", "diamonds"};
		Deck secondDeck = new Deck(secondDeckRanks, secondDeckSuits, secondDeckPointValues);
		Deck thirdDeck = new Deck(thirdDeckRanks, thirdDeckSuits, thirdDeckPointValues);
	}
}
