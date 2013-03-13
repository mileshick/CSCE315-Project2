//Not sure if any imports are needed
enum Color {WHITE, BLACK};
public class GamePiece {
	public GamePiece(){
		x = -1;	//-1 will be used for off the board
		y = -1;
	}
	
	public void drawPiece(){
		//GUI stuff here
	}
	
	public GamePiece(int xPosition, int yPosition,
			Color pieceColor){
		x = xPosition;
		y = yPosition;
		color = pieceColor;
	}
	
	public int getPosition(){
		//might need to come up with position type
		return 0;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setPosition(int xPosition, int yPosition){
		x = xPosition;
		y = yPosition;
	}
	
	public void setColor(Color newColor){
		newColor = color;
	}
	
	private int x;
	private int y;
	Color color;	
}

class GamePieceDrawable {
	public GamePieceDrawable(){
		//GUI stuff here
	}
}
