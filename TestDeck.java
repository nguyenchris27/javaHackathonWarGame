public class TestDeck {

	public static void main(String[] args) {
		
		Player myDeck = new Player("Player");
		Player cpuDeck = new Player("CPU");
		// for (Card card: myDeck.getCards()) {
		// 	card.showCard();
		// }
        // System.out.println(myDeck.drawCard());
        // System.out.println(cpuDeck.drawCard());

		myDeck.war(myDeck.drawCard(), cpuDeck.drawCard());
	}
}