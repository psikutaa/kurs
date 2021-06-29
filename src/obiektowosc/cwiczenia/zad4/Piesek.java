package obiektowosc.cwiczenia.zad4;

public class Piesek {
	private static int ilePieskow = 0;
	private String imie;
	private int wiek;
	private int numer = 0;
	
	public Piesek() {
		
		this.numer = ++ilePieskow;
	}

	public synchronized int getNumer() {
		return numer;
	}

	public static synchronized int getIlePieskow() {
		return ilePieskow;
	}
	
	
	
}
