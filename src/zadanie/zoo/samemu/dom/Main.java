package zadanie.zoo.samemu.dom;

//zad 1. Stworz Klase Zoo z min 5 parametrami
//zad 2. W klasie zoo stworz tablice 10 miejsc na zwierzeta
//zad 3 Stworz stosowne metody zeby moc umieszczac oraz wyjmowac zwierzeta w klatkach
//zad 4 Kazde zwierze generuje koszt miesieczny i roczny 
//zad 5 Zoo sprzedaje bilety w cenach 5 z� ulgowy 9 z� normalny 
//zad 6 na podstawie zmieniajacych sie kosztow generujacych przez zwierzeta i popularnosci zoo 
	//         stworz metode ktora bedzie generowala i proponowala zmiany cen bilet�w.

public class Main {
	public static void main (String[] args ) {
		Zwierze animal1 = new Zwierze("lampart", 1100);
		Zwierze animal2 = new Zwierze("tygrys", 1200);
		Zwierze animal3 = new Zwierze("lama", 2500);
		Zwierze animal4 = new Zwierze("słoń", 8500);
		
	Zoo zoo1 = new Zoo("wrocławskie", 0, 6, 10, 0);
	
	zoo1.dodajZwierze(animal1);
	zoo1.dodajZwierze(animal2);
	zoo1.dodajZwierze(animal3);
	zoo1.dodajZwierze(animal4);
	

	
	System.out.println(zoo1.koszty());
	System.out.println(zoo1.bilans());
	}
}
