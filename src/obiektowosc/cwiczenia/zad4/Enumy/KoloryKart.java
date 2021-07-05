package obiektowosc.cwiczenia.zad4.Enumy;

public enum KoloryKart {
	PIK (1, 40, "WINO"),
	KIER (2, 100, "SERCE"),
	KARO (3, 80, "DZWONEK"),
	TREFL(4, 60, "ŻOŁĄDZ");
	
	private int kolejnoscPoker;
	private int kolejnoscTysiac;
	private String nazwaPotoczna;
	
	private KoloryKart(int kolejnoscPoker, int kolejnoscTysiac, String nazwaPotoczna) {
		this.kolejnoscPoker = kolejnoscPoker;
		this.kolejnoscTysiac = kolejnoscTysiac;
		this.nazwaPotoczna = nazwaPotoczna;
	}
	

	
	
}
