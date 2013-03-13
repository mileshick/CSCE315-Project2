
public class Board {
	public Board(){
		/* initialize game state here; create pieces,
		 * populate board, make players, get everything setup
		 */
	}
	
	private boolean isMoveValid(/*move stuff*/){
		//the valid move checker
		return true;
	}
	
	public void movePiece(/*need to figure out what goes here*/){
		if(isMoveValid(/*move stuff*/)){
			//do move
		}
	}
	
	public void drawBoard(){
		//GUI stuff
	}
	
	private GamePiece[] pieces;
	private Player player1;
	private Player player2;
}

class BoardDrawable{
	BoardDrawable(){
		//GUI stuff
	}
}
