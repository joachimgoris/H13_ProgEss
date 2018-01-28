package be.pxl.H13.oef1;

public class Konijn extends Acteur{

	public Konijn(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Interageer(WereldObject wo) {
		return "";
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een konijn op positie x = "+this.getX()+", y = "+this.getY());
		
	}

}
