package obiektowosc.cwicznia.zad3;



public class Odziez {
	private double cena;
	private String marka;
	private Rozmiar rozmiar;
	
	public Odziez(double cena, String marka, Rozmiar rozmiar) {
		super();
		this.cena = cena;
		this.marka = marka;
		this.rozmiar = rozmiar;
	}

	public double getCena() {
		return cena;
	}

	public String getMarka() {
		return marka;
	}

	public Rozmiar getRozmiar() {
		return rozmiar;
	}

	@Override
	public String toString() {
		return "Odziez [cena=" + cena + ", marka=" + marka + ", rozmiar=" + rozmiar.etykietaSlowna + "]";
	}
	
	
	
	
}
