package zadanie.domowe.zoo;

public class Zoo {
	private String nazwa;
	private int iloscZwierzat = 0;
	private int powierzchnia;
	private int iloscBudynkow;
	private double cenaBiletu;
	public Zwierze[] zwierzeta = new Zwierze[10];
	private double ulgowy = 5;
	private double normalny = 9;
	private int iloscUlgowych;
	private int iloscNormalnych;
	
	public Zoo(String nazwa, int powierzchnia, int iloscBudynkow, double cenaBiletu) {
		super();
		this.nazwa = nazwa;
		this.powierzchnia = powierzchnia;
		this.iloscBudynkow = iloscBudynkow;
		this.cenaBiletu = cenaBiletu;
	}
	
	public boolean dodajZwierze(Zwierze zwierz) {
		if(iloscZwierzat < zwierzeta.length) {
			zwierzeta[iloscZwierzat++] = zwierz;
			return true;
		}else {
			System.out.println("Za duzo zwierzat w ZOO"); 
			return false;
		}
	}
	
	public boolean dodajZwierze(String gatunek, double koszty) {
		Zwierze zwierz = new Zwierze(gatunek, koszty);
		return this.dodajZwierze(zwierz);
	}
	
	public Zwierze usunZwierze() {	
		Zwierze wyjmowane = zwierzeta[iloscZwierzat - 1];		
		zwierzeta[iloscZwierzat -1] = null;
		iloscZwierzat--;
		return wyjmowane;		
	}
	
	private int losuj() {
		int a =(int) (Math.random()*1000);
		return a;
	}
	
	public double getUlgowy() {
		return ulgowy;
	}

	public double getNormalny() {
		return normalny;
	}

	public void wylosujOdwiedzajaych() {
		iloscUlgowych = this.losuj();
		iloscNormalnych = this.losuj();
	}

	public int getIloscUlgowych() {
		return iloscUlgowych;
	}

	public int getIloscNormalnych() {
		return iloscNormalnych;
	}
	
	public double przychod() {
		return normalny * iloscNormalnych + ulgowy * iloscUlgowych;
	}
	
	public double koszty() {
		double koszty = 0;
		
		for(Zwierze zw: this.zwierzeta ) {
			if (zw != null)
				koszty += zw.getKosztUtrzymania();
		}
		return koszty;
	}
	public double bilans() {
		return przychod() - koszty(); 
	}
	
	public void wyliczCeny() {
		double wspolczynnik = 0.6;
		normalny = koszty() / (iloscNormalnych + wspolczynnik * iloscUlgowych);
		ulgowy = wspolczynnik * normalny;
	}
}
