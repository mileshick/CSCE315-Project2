//Not sure if any imports are needed
enum PieceColor {WHITE, BLACK, NULL};
public class GamePiece {
	public GamePiece(){
		position = new Position(-1,-1);	//-1 will be used for off the board
		color = PieceColor.NULL;
	}
	
	public void drawPiece(){
		//GUI stuff here
	}
	
	public GamePiece(Position piecePos, PieceColor pieceColor){
		position = piecePos;
		color = pieceColor;
	}
	
	public Position getPosition(){
		//might need to come up with position type
		return position;
	}
	
	public PieceColor getColor(){
		return color;
	}
	
	public void setPosition(Position piecePos){
		position = piecePos;
	}
	
	public void setColor(PieceColor newColor){
		newColor = color;
	}
	
	private Position position;
	PieceColor color;	
}

class GamePieceDrawable {
	public GamePieceDrawable(){
		//GUI stuff here
	}
}
