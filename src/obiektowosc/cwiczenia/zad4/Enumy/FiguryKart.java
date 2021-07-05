package obiektowosc.cwiczenia.zad4.Enumy;

public enum FiguryKart {
	_2 (2),
	_3 (3),
	_4 (4),
	_5 (5),
	_6 (6),
	_7 (7),
	_8 (8),
	_9 (9),
	_10 (10),
	WALET (11),
	DAMA (12),
	KROL (13),
	AS (14);
	
	private int wyzszosc;

	private FiguryKart(int wyzszosc) {
		this.wyzszosc = wyzszosc;
	}

	public int getWyzszosc() {
		return wyzszosc;
	}
	
	
	
	
}
