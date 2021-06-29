package obiektowosc.cwiczenia.zoo;

public class Zoo {
	private String nazwa;
	private int biletUlgowy;
	private int biletNormalny;
	private int iloscOdwiedzajacych;
	public Zwierzeta[] zwierzeta = new Zwierzeta[10];
	private int iloscZwierzat = 0;
	
	
	public Zoo(String nazwa, int biletUlgowy, int biletNormalny, int iloscOdwiedzajacych, Zwierzeta[] zwierzeta,
			int iloscZwierzat) {
		super();
		this.nazwa = nazwa;
		this.biletUlgowy = biletUlgowy;
		this.biletNormalny = biletNormalny;
		this.iloscOdwiedzajacych = iloscOdwiedzajacych;
		this.zwierzeta = zwierzeta;
		this.iloscZwierzat = iloscZwierzat;
	}


	public boolean dodajZwierze(Zwierzeta zwierz) {
		if(iloscZwierzat < zwierzeta.length) {
			zwierzeta[iloscZwierzat] = zwierz;
			return true;
		}
		else {
			System.out.println("za duzo zwierzat");
			return false;
		}
	}

	public boolean dodajZwierze(String gatunek, int kosztyUtrzymania) {
		Zwierzeta zwierz = new Zwierzeta (gatunek, kosztyUtrzymania);
		return this.dodajZwierze(zwierz);		
	}
	
	
	
}
