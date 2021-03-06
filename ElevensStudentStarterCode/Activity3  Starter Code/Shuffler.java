/**
 * This class provides a convenient way to test shuffling methods.
 * 
 * Hannah Pang
 */

import java.util.*;

public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 5;


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        // int[] values1 = {11, 50, 2, 8, 16, 12, 88, 101, 24, 34};
        // int[] values1 = {5, 4, 3, 2, 1};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        // int[] values2 = {11, 50, 2, 8, 16, 12, 88, 101, 24, 34};
        // int[] values2 = {5, 4, 3, 2, 1};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        int[] shuffled = new int[values.length];
        int middle;
        if ((values.length % 2) == 0) {
            middle = (values.length / 2);
        } else {
            middle = (values.length / 2) + 1;
        }
        int k = 0;
        for (int j = 0; j < middle; j++) {
            shuffled[k] = values[j];
            k+=2;
        }
        k = 1;
        for (int j = middle; j < values.length; j++) {
            shuffled[k] = values[j];
            k+=2;
        }
        
        for (int i = 0; i < values.length; i++) {
            values[i] = shuffled[i];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        Random r = new Random();
        int randomIndex;
        for (int k = (values.length - 1); k > 0; k--) {
            randomIndex = r.nextInt(values.length);
            int temp = values[k];
            values[k] = values[randomIndex];
            values[randomIndex] = temp;
        }
    }
}
