/**
 * Activity 1
 * This is a class that tests the Card class.
 * 
 * Hannah Pang
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card firstCard = new Card ("Ace", "spades", 1);
		String firstCardSuit = firstCard.suit();
		String firstCardRank = firstCard.rank();
		int firstCardPointValue = firstCard.pointValue();
		System.out.println("First Card: " + firstCard.toString());
		
		Card secondCard = new Card ("Queen", "hearts", 12);
		String secondCardSuit = secondCard.suit();
		String secondCardRank = secondCard.rank();
		int secondCardPointValue = secondCard.pointValue();
		System.out.println("Second Card: " + secondCard.toString());
		
		Card thirdCard = new Card("Queen", "hearts", 12);
		String thirdCardSuit = thirdCard.suit();
		String thirdCardRank = thirdCard.rank();
		int thirdCardPointValue = thirdCard.pointValue();
		System.out.println ("Third Card: " + thirdCard.toString());
		
		System.out.print("Compare first and second card: ");
		System.out.println(firstCard.matches(secondCard));
		System.out.print("Compare second and third card: ");
		System.out.println(secondCard.matches(thirdCard));
		System.out.print("Compare first and third card: ");
		System.out.println(firstCard.matches(thirdCard));
	}
}
