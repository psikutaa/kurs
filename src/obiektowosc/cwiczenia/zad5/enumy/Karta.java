package obiektowosc.cwiczenia.zad5.enumy;

public class Karta {
	private KoloryKart kolory;
	private FiguryKart figury;
	
	public Karta (KoloryKart kolory, FiguryKart figury) {
		this.kolory = kolory;
		this.figury = figury;
		
	}

	public void setKolory(KoloryKart kolory) {
		this.kolory = kolory;
	}

	public void setFigury(FiguryKart figury) {
		this.figury = figury;
	}

	@Override
	public String toString() {
		return "Karta [kolory=" + kolory + ", figury=" + figury + "]";
	}
	
	
	
}
