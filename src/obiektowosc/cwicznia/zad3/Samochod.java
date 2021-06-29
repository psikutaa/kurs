package obiektowosc.cwicznia.zad3;

class Samochod {
	private String nazwa;
	private TypySamochodow typySamochodow;
	private int dlugosc;
	private int waga;
	
	public Samochod(String nazwa, TypySamochodow typySamochodow, int dlugosc, int waga) {
		super();
		this.nazwa = nazwa;
		this.typySamochodow = typySamochodow;
		this.dlugosc = dlugosc;
		this.waga = waga;
	}

	@Override
	public String toString() {
		return "Modele [nazwa=" + nazwa + ", typySamochodow=" + typySamochodow.iloscDrzwi + ", dlugosc=" + dlugosc + ", waga="
				+ waga + "]";
	}
}