package be.pxl.H13.oef1;

public class Egel extends Acteur {

	public Egel(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Interageer(WereldObject wo) {
		String retValue = "";
		if (wo.equals(this)) {
			if (this.berekenAfstand(wo) < 20) {
				retValue = "Dag egel";
			}
		}
		else {
			if(this.berekenAfstand(wo)<10) {
				retValue = "Dag konijn";
			}
		}
		return retValue;
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een egel op positie x = " + this.getX() + ", y = " + this.getY());

	}

}
