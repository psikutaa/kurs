package zadaniaWork1;
//Napisz klas� Pracownik, kt�ra przechowuje trzy pola:
//
//-Imi�
//
//-Nazwisko
//
//-Wiek
//
//Nast�pnie utw�rz klas� Firma, w kt�rej wykorzystasz klas� pracownik do utworzenia dw�ch obiekt�w przechowuj�cych dane pracownik�w (wymy�l sobie jakie�) i p�niej wy�wietlasz je na ekran.
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
