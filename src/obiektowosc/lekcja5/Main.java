package obiektowosc.lekcja5;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

//		Object o = new Object();
//		
//		System.out.println(o.hashCode());
//		System.out.println(o.getClass());

//		ArrayList<String> listaSlow = new ArrayList<String>();
//		
//		listaSlow.add("Jabłko");
//		listaSlow.add("Banan");
//		listaSlow.add("Czereśnia");
//		
//		System.out.println(listaSlow.size());
//		listaSlow.add("Arbuz");
//		listaSlow.remove(2);
//		System.out.println(listaSlow);
//		System.out.println(listaSlow.indexOf("Jabłko"));
//		System.out.println(listaSlow.get(2));

		// Interakcja z plikami i lista -> Stworz magazyn przechowywania zywnosci
		// Zapisuj wszytsko do pliku, po uruchomieniu wyswietl wszytskie dostepne
		// produkty wraz z iloscia na stanie
		// pozwol uzytkwonikowi dokonac modyfikacji -> dodania usuniecia rpoduktow
		// ponownie zapisuj zmieniony stan do pliku

		HashSet<String> zbior = new HashSet<String>();

//		ArrayList<String> zbior = new ArrayList<String>();
		zbior.add("Jabłko");
		zbior.add("Jabłko");
		zbior.add("Jabłko");
		zbior.add("Czereśnia");

		for (String ele : zbior)
			System.out.println(ele);

//		zbior = new ArrayList<String>(new HashSet<String>(zbior));

		System.out.println(zbior.size());
		System.out.println(zbior);

//		HashSet<String> nowy = new HashSet<String>(zbior);

//		TreeMap<String, Integer> menu = new TreeMap<String, Integer>();
//		
//		menu.put("Jabłko", 4);
//		menu.put("Jabłko", menu.get("Jabłko") + 5);
//		menu.put("Pomarańcz", 7);
//		menu.put("Czereśnia", 20);

//		System.out.println(menu.containsKey("Jabłko"));
//		System.out.println(menu);
//		System.out.println(menu.get("Jabłko"));
//		System.out.println(menu.keySet());
//		System.out.println(menu.values());

//		ArrayList<String> produkty = new ArrayList<String>();
//		ArrayList<Integer> produktyCeny = new ArrayList<Integer>();
//
//		produkty.add("Jabłko");
//
//		produktyCeny.add(4);

		zad 1. Napisz z wykorzystaniem list menu produktow w sklepie 
		oraz przypadek uzycia uzytkwonik przychodzi wybiera produkty i ilosci jest podsumownay i wyswieltana cena 
		
		zad 2 . To samo co pierwsze ale tylko Set
		zad 3. To samo co pierwsze tylko Map
	}
}
