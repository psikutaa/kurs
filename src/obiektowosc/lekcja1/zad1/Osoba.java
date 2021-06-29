package obiektowosc.lekcja1.zad1;


class Osoba {
	String kolorSkory;
	int wiek;
	double wzrost;
	boolean czyPobity;
	int masa;
	
	public Osoba() {
		this(23, 145);
		this.wiek =23;
	}

	public Osoba(int wiek, double wzrost) {
		
		this.wiek = wiek;
		this.wzrost = wzrost;
		// this
	}

	public Osoba(int wiek, double wzrost, String kolorSkory, boolean czyPobity) {
		this(wiek, wzrost);
		this.kolorSkory = kolorSkory;
		this.czyPobity = czyPobity;
		
	}
	
	public Osoba(int wiek, double wzrost, String kolorSkory, boolean czyPobity, int masa) {
		this(wiek, wzrost, kolorSkory, czyPobity);
		this.masa = masa;
	}

	public void wypiszInformacje() {
		System.out.printf("Kolor skory: %s\nWiek: %d\nWzrost: %.1f\nCzy pobity: %b\nMasa: %d\n", kolorSkory, wiek, wzrost,
				czyPobity, masa);
	}
	
	
}
