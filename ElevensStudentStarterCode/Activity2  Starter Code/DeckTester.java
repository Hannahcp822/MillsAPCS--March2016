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
	    System.out.println("Empty? " + firstDeck.isEmpty());
	    System.out.println(firstDeck.toString());
	    firstDeck.size();
	    firstDeck.shuffle();
	    firstDeck.deal();
	    
	    String[] secondDeckRanks = {"Two", "Four", "Six", "Eight", "Ten"};
	    String[] secondDeckSuits = {"diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
	    int[] secondDeckPointValues = {2, 4, 6, 8, 10};
		Deck secondDeck = new Deck(secondDeckRanks, secondDeckSuits, secondDeckPointValues);
		System.out.println("Empty? " + secondDeck.isEmpty());
		System.out.println(secondDeck.toString());
	    secondDeck.size();
	    secondDeck.shuffle();
	    secondDeck.deal();
		
		String[] thirdDeckRanks = {"Ten", "Queen", "King", "Five"};
		String[] thirdDeckSuits = {"spades", "hearts", "diamonds", "clubs"};
		int[] thirdDeckPointValues = {10, 12, 13, 5};
		Deck thirdDeck = new Deck(thirdDeckRanks, thirdDeckSuits, thirdDeckPointValues);
		System.out.println("Empty? " + thirdDeck.isEmpty());
		System.out.println(thirdDeck.toString());
	    thirdDeck.size();
	    thirdDeck.shuffle();
	    thirdDeck.deal();
	}
}
