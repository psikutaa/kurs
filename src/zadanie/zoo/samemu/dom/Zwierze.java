package zadanie.zoo.samemu.dom;

public class Zwierze {
	
	private String nazwa;
	private int kosztyUtrzymania;
	
	public int getKosztyUtrzymania() {
		return kosztyUtrzymania;
	}

	public Zwierze(String nazwa, int kosztyUtrzymania) {
		super();
		this.nazwa = nazwa;
		this.kosztyUtrzymania = kosztyUtrzymania;
	}

	public String getNazwa() {
		return nazwa;
	}
	
	
}