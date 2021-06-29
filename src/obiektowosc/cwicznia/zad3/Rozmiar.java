package obiektowosc.cwicznia.zad3;

enum Rozmiar{
	XXS(22, "super maly"),
	XS(24, "bardzo maly"),
	S(26, "maly"),
	M(28, "sredni"),
	L(30, "duzy"),
	XL(32, "bardzo duzy"),
	XXL(34, "ogromny");
	
	int rozmiar;
	String etykietaSlowna;
	
	private Rozmiar(int rozmiar, String etykietaSlowna) {
		this.rozmiar = rozmiar;
		this.etykietaSlowna = etykietaSlowna;
	}

	public int getRozmiar() {
		return rozmiar;
	}
	

	public String getEtykietaSlowna() {
		return etykietaSlowna;
	}
	
	
}
