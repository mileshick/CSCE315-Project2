import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel {
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
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// draw horizontal lines
		for(int y=50;y<=375; y+=75) {
			g.drawLine(50,y,650,y);
		}
		
		// draw vertical lines
		for(int x=50; x<=650; x+=75) {
			g.drawLine(x,50,x,350);
		}
		
		// draw top pieces
		/*g.setColor(Color.white);
		for(int x=50; x<=1350; x+=150){
			g.drawOval(x/2,25,50,50);
			g.fillOval(x/2,25,50,50);
		}
		
		// draw bottom pieces
		g.setColor(Color.black);
		for(int x=50; x<=1350; x+=150){
			g.drawOval(x/2,325,50,50);
			g.fillOval(x/2,325,50,50);
		}*/

	}
	
	private GamePiece[] pieces;
	private Player player1;
	private Player player2;

}
