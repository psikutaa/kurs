package zadanie.domowe.zoo;
//10 pkt. 
		// zad 1. Stworz Klase Zoo z min 5 parametrami
		// zad 2. W klasie zoo stworz tablice 10 miejsc na zwierzeta
		// zad 3 Stworz stosowne metody zeby moc umieszczac oraz wyjmowac zwierzeta w klatkach
		// zad 4 Kazde zwierze generuje koszt miesieczny i roczny 
		// zad 5 Zoo sprzedaje bilety w cenach 5 zł ulgowy 9 zł normalny 
		// zad 6 na podstawie zmieniajacych sie kosztow generujacych przez zwierzeta i popularnosci zoo 
	 	//         stworz metode ktora bedzie generowala i proponowala zmiany cen biletów.
public class Main {
	public static void main (String[] args)  {
		
		Zoo zoo = new Zoo("Wroclawskie Zoo", 0, 0, 0);
		
		Zwierze radek = new Zwierze("osiol",(int) (Math.random()*10000));
		
		if(zoo.dodajZwierze(radek) == false) {
			System.out.println("nie udało się dodać");
		}
		else
			zoo.dodajZwierze("nosorozec",(int) (Math.random()*10000));
		
//		Zwierze marcin = zoo.usunZwierze();
		double koszty = 0;
		

		
		double kosztyRoczne = zoo.koszty() * 12;

		
		
		
		zoo.wylosujOdwiedzajaych();
		

		

		System.out.printf("Przychód z biletów:%s, koszty utrzymania zwierzat: %s, bilans całkowity: %s\n ", zoo.przychod(), 
				zoo.koszty(), zoo.bilans());
		zoo.wyliczCeny();
		
		System.out.printf("Proponowana cena za bilet ulgowy to: %s, a za bilet normalny to: %s\n wtedy bilans wynosi %s",
				zoo.getUlgowy(), zoo.getNormalny(),zoo.bilans());
		
	}
	   
}
