package be.pxl.H13.oef1;

public class Punt {
	private int x;
	private int y;
	public final int MAXIMUMGROOTTE = 99;
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double berekenAfstand(Punt p) {
		double retvalue;
		retvalue = Math.sqrt(Math.pow((getX() - p.getX()),2)+Math.pow((getY()-p.getY()), 2));
		
		return retvalue;
	}
	
	public void controleer() {
		if(getX()<0) {
			x = 0;
		}
		else {
			if(getX()>MAXIMUMGROOTTE) {
				x = MAXIMUMGROOTTE;
			}
		}
		if(getY()<0) {
			y=0;
		}
		else {
			if(getY()>MAXIMUMGROOTTE) {
				y = MAXIMUMGROOTTE;
			}
		}
	}
	
	public void drukAf() {
		System.out.println("x = "+getX());
		System.out.println("y = "+getY());
	}
}