
	public class Position {
		public Position(){
			x = -1;
			y = -1;
			
			N = false;
			NE = false;
			E = false;
			SE = false;
			W = false;
			SW = false;
			W = false;
			NW = false;
		};
		
		public Position(int xPos, int yPos){
			x = xPos;
			y = yPos;
			
			N = false;
			NE = false;
			E = false;
			SE = false;
			W = false;
			SW = false;
			W = false;
			NW = false;
		};
		
		public int x;
		public int y;
		
		public boolean N;
		public boolean NE;
		public boolean E;
		public boolean SE;
		public boolean S;
		public boolean SW;
		public boolean W;
		public boolean NW;
	}