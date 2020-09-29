//Chapter 3; 3.24
package Week1;

public class PickCard {
    public static void main(String[] args) {
        getCard();
    }

    static void getCard() {
        int rank = (int) (Math.random() * 13 + 1);
        int suit = (int) (Math.random() * 4 + 1);
        String rankString;
        String suitString;

        switch (rank) {
            case 1: rankString = "Ace";
                break;
            case 2: rankString = "2";
                break;
            case 3: rankString = "3";
                break;
            case 4: rankString = "4";
                break;
            case 5: rankString = "5";
                break;
            case 6: rankString = "6";
                break;
            case 7: rankString = "7";
                break;
            case 8: rankString = "8";
                break;
            case 9: rankString = "9";
                break;
            case 10: rankString = "10";
                break;
            case 11: rankString = "Jack";
                break;
            case 12: rankString = "Queen";
                break;
            case 13: rankString = "King";
                break;
            default: rankString = "Invalid Rank";
                break;
        }

        switch (suit) {
            case 1: suitString = "Clubs";
                break;
            case 2: suitString = "Diamonds";
                break;
            case 3: suitString = "Hearts";
                break;
            case 4: suitString = "Spades";
                break;
            default: suitString = "Invalid Suit";
                break;
        }

        System.out.println("The card you picked is " + rankString + " of " + suitString);
    }
}
