package dmacc.beans;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	public void setComputerPlayerToRandom() {
		int rand = (int) (Math.random()*(5-1+1)+1);
		String item = "";
		
		if(rand == 1) {
			item = "rock";
		}
		else if(rand == 2) {
			item = "paper";
		}
		else if(rand == 3) {
			item = "scissors";
		}
		else if(rand == 4) {
			item = "spock";
		}
		else if(rand == 5) {
			item = "lizard";
		}
		else {
			item = "error";
		}
		
		System.out.println(rand);
		this.computerPlayer = item;
	}
	
	public void determineWinner() {
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String spock = "spock";
        String lizard = "lizard";
        String playerOneWon = "Player 1 won!";
        String computerWon = "Computer won!";
        String tie = "It's a tie!";
        String error = "Error";
        
        if(player1.equals(rock)) {
            if(computerPlayer.equals(rock)) {
            	winner = tie;
            }
            else if(computerPlayer.equals(paper)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(scissors)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(spock)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(lizard)) {
            	winner = playerOneWon;
            }
            else {
            	winner = error;
            }
        }
        else if(player1.equals(paper)) {
            if(computerPlayer.equals(rock)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(paper)) {
            	winner = tie;
            }
            else if(computerPlayer.equals(scissors)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(spock)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(lizard)) {
            	winner = computerWon;
            }
            else {
            	winner = error;
            }
        }
        else if(player1.equals(scissors)) {
            if(computerPlayer.equals(rock)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(paper)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(scissors)) {
            	winner = tie;
            }
            else if(computerPlayer.equals(spock)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(lizard)) {
            	winner = playerOneWon;
            }
            else {
            	winner = error;
            }
        }
        else if(player1.equals(spock)) {
            if(computerPlayer.equals(rock)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(paper)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(scissors)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(spock)) {
            	winner = tie;
            }
            else if(computerPlayer.equals(lizard)) {
            	winner = computerWon;
            }
            else {
            	winner = error;
            }
        }
        else {
            if(computerPlayer.equals(rock)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(paper)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(scissors)) {
            	winner = computerWon;
            }
            else if(computerPlayer.equals(spock)) {
            	winner = playerOneWon;
            }
            else if(computerPlayer.equals(lizard)) {
            	winner = tie;
            }
            else {
            	winner = error;
            }
        }
	}
}