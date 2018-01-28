package be.pxl.H13.oef1;

public abstract class WereldObject extends Punt{
	private Punt Positie;
	
	public WereldObject(int x, int y) {
		super(x, y);
		Positie = new Punt(x,y);
	}

	public void setX(int x){
		super.setX(x);
	}
	
	public int getX() {
		return(super.getX());
	}
	
	public void setY(int y) {
		super.setY(y);
	}
	
	public int getY() {
		return(super.getY());
	}
	
	public double berekenAfstand(WereldObject wo) {
		double retvalue;
		retvalue = this.Positie.berekenAfstand(wo.Positie);
		return retvalue;
	}
	
	public abstract void beschrijf();
}
