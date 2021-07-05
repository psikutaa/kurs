package zadaniaWork1;
//Napisz klasê Pracownik, która przechowuje trzy pola:
//
//-Imiê
//
//-Nazwisko
//
//-Wiek
//
//Nastêpnie utwórz klasê Firma, w której wykorzystasz klasê pracownik do utworzenia dwóch obiektów przechowuj¹cych dane pracowników (wymyœl sobie jakieœ) i póŸniej wyœwietlasz je na ekran.
public class Pracownik {
	String imie;
	String nazwisko;
	int wiek;
	
	public Pracownik(String imie, String nazwisko, int wiek) {
		
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
	
	
}
