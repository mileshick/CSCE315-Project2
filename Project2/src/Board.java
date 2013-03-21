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
		int w = getWidth();
        int h = getHeight();
		
        // center pt: (325, 175)
        
		// draw horizontal lines
		for(int y=50; y<=375; y+=75) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(3));
			g.drawLine(50,y,650,y);
		}
		
		// draw vertical lines
		for(int x=50; x<=650; x+=75) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(3));
			g.drawLine(x,50,x,350);
		}
		
		// draw diagonal lines
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		
		// left half of board
		for(int x=0; x<=275; x+=75) {
			g.drawLine(50,125+x,125+x,50);
		}
		for(int x=0; x<=200; x+=75) {
			g.drawLine(350,275-x,275-x,350);
		}
		for(int x=0; x<=275; x+=75) {
			g.drawLine(275-x,50,350,125+x);
		}
		for(int x=0; x<=200; x+=75) {
			g.drawLine(50,275-x,125+x,350);
		}
		
		// right half of board
		for(int x=0; x<=275; x+=75){
			g.drawLine(575-x,50,650,125+x);
		}
		for(int x=0; x<=200; x+=75){
			g.drawLine(350,275-x,425+x,350);
		}
		for(int x=0; x<=275; x+=75){
			g.drawLine(425+x,50,350,125+x);
		}
		for(int x=0; x<=200; x+=75){
			g.drawLine(650,275-x,575-x,350);
		}
		
		/*
		// draw top pieces
		g.setColor(Color.white);
		for(int x=50; x<=1350; x+=150){
			g.drawOval(x/2,25,50,50);
			g.fillOval(x/2,25,50,50);
		}
		
		// draw bottom pieces
		g.setColor(Color.black);
		for(int x=50; x<=1350; x+=150){
			g.drawOval(x/2,325,50,50);
			g.fillOval(x/2,325,50,50);
		}
		*/
	}
	
	private GamePiece[] pieces;
	private Player player1;
	private Player player2;

}
