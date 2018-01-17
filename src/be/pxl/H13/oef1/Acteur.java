package be.pxl.H13.oef1;

public class Acteur extends WereldObject implements Beweegbaar {
	
	public Acteur(int x, int y) {
		super(x, y);
	}

	@Override
	public void stapLinks() {
		super.setX(getX()-1);
		
	}

	@Override
	public void stapRechts() {
		super.setX(super.getX()+1);		
	}

	@Override
	public void stapBoven() {
		super.setY(super.getY()+1);
		
	}

	@Override
	public void stapOnder() {
		super.setY(super.getY()-1);
		
	}

}
