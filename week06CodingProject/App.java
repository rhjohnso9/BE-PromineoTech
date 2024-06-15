package week06CodingProject;

public interface App {
	public static void main(String[] args) {
		//Instantiating new Deck
		Deck playDeck = new Deck();
		//Instantiating two new players
		Player p1 = new Player("Bob");
		Player p2 = new Player("Dave");
		
		//Shuffle the deck
		//System.out.println(playDeck.toString());
		playDeck.shuffle();
		//System.out.println(playDeck.toString());
		
		//Each player drawing their cards and adding to their hand
		for (int i = 0; i < 26; i++) {
		p1.draw(playDeck);
		p2.draw(playDeck);
		}
		//To test the describe method for Player class
		p1.describe();
		p2.describe();
		
		//Compare values and changing scores
		int p1Value, p2Value;
		
		for (int i = 0; i < 26; i++) {
			
			p1Value = p1.flip().getValue();
			
			p2Value = p2.flip().getValue();
			
			if (p1Value > p2Value) {
				p1.incrementScore();
				System.out.println(p1.getName() + " wins this round!"); 
		}
			else if (p2Value > p2Value) {
				p2.incrementScore();
				System.out.println(p2.getName() + " wins this round!"); 
		}
			else {
				System.out.println("Draw"); 
		}
		System.out.println("Score - " + p1.getName() + ": " + p1.getScore()
							+ " " + p2.getName() + ": " + p2.getScore() + "\n");
	}
	
	//Displaying final score and winner of the game.	
	System.out.println("final Score - " + p1.getName() + ": " + p1.getScore()
	+ " " + p2.getName() + ": " + p2.getScore() + "\n");
	if (p1.getScore() > p2.getScore()) {
		System.out.println(p1.getName() + " wins the game!");
	}	
	else {
		System.out.println("The game is a draw!");
		}
	}	
}
