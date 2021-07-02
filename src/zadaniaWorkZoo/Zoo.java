package zadaniaWorkZoo;

import cwiczenia.Praca1.Zwierze;

public class Zoo {
	private String nazwa;
	private int iloscZwierzat = 0;
	private int biletUlgowy;
	private int biletNormalny;
	private int iloscOdwiedzajaych;
	public Zwierze[] zwierzetaWZoo = new Zwierze [10];
	
	
	
	public Zoo(String nazwa, int iloscZwierzat, int biletUlgowy, int biletNormalny, int iloscOdwiedzajaych) {
		super();
		this.nazwa = nazwa;
		this.iloscZwierzat = iloscZwierzat;
		this.biletUlgowy = biletUlgowy;
		this.biletNormalny = biletNormalny;
		this.iloscOdwiedzajaych = iloscOdwiedzajaych;
	}

	public boolean dodajZwierze (Zwierze zwierzak) {		
		if(iloscZwierzat < zwierzetaWZoo.length) {
			System.out.println("uda³o sie dodac zwierze");
			zwierzetaWZoo[iloscZwierzat++] = zwierzak;
			return true;}
		else { System.out.printf("Za du¿o zwierzat w Zoo %s\n", nazwa);
			return false;}
	}
	
	public boolean usunZwierze (Zwierze zwierzak) {
		if (iloscZwierzat > 0) {
			System.out.println("uda³o siê usunac zwierze");
			zwierzetaWZoo[iloscZwierzat--] = null;
			return true;
		} else {
			System.out.println("nie ma zwierz¹t do usuniêcia");
			return false;
		}	
	}
	


}