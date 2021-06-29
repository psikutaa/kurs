package obiektowosc.cwiczenia.nr1;

public class Zwierzatko {
	private String gatunek;
	private int waga;
	private int wzrost;
	private int wiek;

	
	public Zwierzatko (String gatunek, int waga, int wzrost, int wiek ) {
		this.gatunek = gatunek;
		this.waga = waga;
		this.wzrost = wzrost;
		this.wiek = wiek;
	}
	
	public void wypiszInformacje () {
		System.out.printf("Gatunek: %s\nWaga: %d\nWzrost: %d\nWiek: %d\n\n", gatunek, waga, wzrost, wiek);
	}
	
	public double wyliczMaseDoWzrost( ) {
		return (double) waga / (double) wzrost;
	}
	
	public String getGatunek() {
		return gatunek;
	}
	
	
	public int getWaga() {
		return waga;
	}


	boolean czyPoprawny = true;
	public Boolean czyPoprawny() {
		
		if (this.waga < 0) {
			czyPoprawny = false;
			waga = 999999;
		}
		if (this.wzrost < 0)
			czyPoprawny = false;
			wzrost = 12345;
		return czyPoprawny;
	}

	
	
}
