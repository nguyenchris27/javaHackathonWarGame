import java.util.ArrayList;
import java.util.Random;


public class Player {
Random random = new Random();
	
    private String playerName;
    private ArrayList<Card> draw;
	private ArrayList<Card> cards;
	
    public Player(String playerName) {
        this.playerName = playerName;
        this.draw = new ArrayList<Card>();
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 1; rank <= 13; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

    public Card drawCard() {
        Card draw = cards.get(random.nextInt(51));
        this.draw.add(draw);
        // System.out.println(this.draw.showCard());
        // System.out.printf("%s has drawn %s of %s", this.playerName, draw.getName(), draw.getSuit());
        return draw;
    }

    public void war(Card player1card, Card player2card) {
        System.out.printf("\n\n\n\n--- Player drew ---\n%s", player1card.returnCard());
        System.out.printf("\n--- CPU drew ---\n%s", player2card.returnCard());

        if (player1card.getRank() > player2card.getRank()) {
            System.out.println("\n--- Player wins! ---\n\n\n\n");
        }

        else if (player1card.getRank() < player2card.getRank()) {
            System.out.println("\n--- CPU wins! ---\n\n\n\n");
        }

        else if (player1card.getRank() == player2card.getRank()) {
            System.out.println("\n--- TIE!!! ---\n\n\n\n");
        }

        else {
            System.out.println("\n error: idk what happened try again \n\n\n\n");
        }
    }
}