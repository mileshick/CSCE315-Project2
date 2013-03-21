//Not sure if any imports are needed
enum PieceColor {WHITE, BLACK, NULL};
public class GamePiece {
	public GamePiece(){
		x = -1;	//-1 will be used for off the board
		y = -1;
	}
	
	public void drawPiece(){
		//GUI stuff here
	}
	
	public GamePiece(int xPosition, int yPosition,
			PieceColor pieceColor){
		x = xPosition;
		y = yPosition;
		color = pieceColor;
	}
	
	public int getXPosition(){
		//might need to come up with position type
		return x;
	}
	
	public int getYPosition(){
		//might need to come up with position type
		return y;
	}
	
	public PieceColor getColor(){
		return color;
	}
	
	public void setPosition(int xPosition, int yPosition){
		x = xPosition;
		y = yPosition;
	}
	
	public void setColor(PieceColor newColor){
		newColor = color;
	}
	
	private int x;
	private int y;
	PieceColor color;	
}

class GamePieceDrawable {
	public GamePieceDrawable(){
		//GUI stuff here
	}
}
