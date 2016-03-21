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
		String[] firstDeckRanks = {"Ace"};
		String[] firstDeckSuits = {"spades", "clubs", "diamonds", "hearts"};
		int[] firstDeckPointValues = {1, 1, 1, 1};
	    Deck firstDeck = new Deck(firstDeckRanks, firstDeckSuits, firstDeckPointValues);
	    System.out.println("Empty? " + firstDeck.isEmpty());
	    firstDeck.size();
	    firstDeck.shuffle();
	    firstDeck.deal();
	    System.out.println(firstDeck.toString()); // Print cards after dealing one card
	    
	    String[] secondDeckRanks = {"Two", "Four", "Six", "Eight", "Ten"};
	    String[] secondDeckSuits = {"diamonds"};
	    int[] secondDeckPointValues = {2, 4, 6, 8, 10};
		Deck secondDeck = new Deck(secondDeckRanks, secondDeckSuits, secondDeckPointValues);
		System.out.println("Empty? " + secondDeck.isEmpty());
	    secondDeck.size();
	    secondDeck.shuffle();
	    System.out.println(secondDeck.toString()); // Print cards before dealing any
	    secondDeck.deal();
		
		String[] thirdDeckRanks = {"Ten", "Queen", "King", "Five"};
		String[] thirdDeckSuits = {"spades", "hearts", "diamonds", "clubs"};
		int[] thirdDeckPointValues = {10, 12, 13, 5};
		Deck thirdDeck = new Deck(thirdDeckRanks, thirdDeckSuits, thirdDeckPointValues);
		System.out.println("Empty? " + thirdDeck.isEmpty());
	    thirdDeck.size();
	    thirdDeck.shuffle();
	    thirdDeck.deal();
	    thirdDeck.deal();
	    System.out.println(thirdDeck.toString()); // Print cards after dealing two cards
	}
}
