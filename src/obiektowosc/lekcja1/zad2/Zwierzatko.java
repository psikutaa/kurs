package obiektowosc.lekcja1.zad2;


class Zwierzatko {
	String gatunek;
	int waga;
	int wzrost;
	String nazwa;

	public Zwierzatko(String nazwa, int waga, int wzrost, String gatunek) {
		this.gatunek = gatunek;
		this.nazwa = nazwa;
		this.waga = waga;
		this.wzrost = wzrost;
	}

	public Zwierzatko() {
	}

	public Zwierzatko(int waga, int wzrost) {
		this("Nie podano", waga, wzrost, "Nie podano");
	}

	public Zwierzatko(String nazwa) {
		this(nazwa, 0, 0, "Nie podano");
	}

	public void wypiszInformacje() {
		System.out.printf("Nazwa: %s\nGatunek: %s\nWaga: %d\nWzrost: %d\n", nazwa, gatunek, waga, wzrost);

	}

	public double obliczZapotrzebowanieNaJedzenie() {

		return (double) wzrost / (double) waga;

	}
	public Boolean weryfikujPoprawnosc() {

		Boolean czyPoprawny = true;
	
		if (this.waga < 0) {
			czyPoprawny = false;
			this.waga = 0;
		}
		if (this.wzrost < 0) {
			czyPoprawny = false;
			this.wzrost = 0;
		}
	
		return czyPoprawny;
	}
}