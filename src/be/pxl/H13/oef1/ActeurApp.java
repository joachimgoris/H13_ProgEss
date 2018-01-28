package be.pxl.H13.oef1;

import java.util.Random;

public class ActeurApp {

	public static void main(String[] args) {
		Punt[] puntenTab = new Punt[100];
		Random rdm = new Random();
		for (int i = 0; i < puntenTab.length; i++) {
			Punt p = new Punt(rdm.nextInt(99), rdm.nextInt(99));
			puntenTab[i] = p;
		}
		
		for (Punt punt : puntenTab) {
			punt.drukAf();
		}
		
		System.out.println(puntenTab[0].berekenAfstand(puntenTab[99]));
		
		Egel egel = new Egel(0,0);
		Konijn konijn = new Konijn(0,0);
		
		egel.Interageer(konijn);
		konijn.beschrijf();
		
		konijn.stapLinks();
		egel.stapRechts();
		
		Acteur[] act = new Acteur[2];
		
		act[0] = egel;
		act[1] = konijn;
		for (Acteur acteur : act) {
			acteur.drukAf();
		}
	}

}
