package zadaniaWorkZoo;



//zad 1. Stworz Klase Zoo z min 5 parametrami
//zad 2. W klasie zoo stworz tablice 10 miejsc na zwierzeta
//zad 3 Stworz stosowne metody zeby moc umieszczac oraz wyjmowac zwierzeta w klatkach
//zad 4 Kazde zwierze generuje koszt miesieczny i roczny 
//zad 5 Zoo sprzedaje bilety w cenach 5 z³ ulgowy 9 z³ normalny 
//zad 6 na podstawie zmieniajacych sie kosztow generujacych przez zwierzeta i popularnosci zoo 
	//         stworz metode ktora bedzie generowala i proponowala zmiany cen biletów.

public class Main {
	public static void main (String[] args ) {
		
		Zwierze animal1 = new Zwierze("ko", 1500);
		Zwierze animal2 = new Zwierze("sowa", 2200);
		Zwierze animal3 = new Zwierze("orangutan", 3300);
		
		Zoo wroclawskieZoo = new Zoo("wroclawskie", 0, 6, 10, 0);
		
		wroclawskieZoo.dodajZwierze(animal1);
		wroclawskieZoo.dodajZwierze(animal1);
		
		wroclawskieZoo.usunZwierze(animal2);
		
	}
}