/* may or may not need this class, not sure
 */

public class Player {
	public Player(boolean isUser, Color whichColor){
		playerColor = whichColor;
		user = isUser;
	}

	public boolean isUser(){
		return user;
	}
	
	public Color whichColor(){
		return playerColor;
	}
	
	private boolean user;//true if a person, false if AI
	Color playerColor;			
}
