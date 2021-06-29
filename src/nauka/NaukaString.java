package nauka;

public class NaukaString {

	public static void main (String[] args) {
		
		String str1 = "a to jest pierwsze zdanie o javie ";
		String str2 = "tutaj wpisuje drugie zdanie a a a a";
		String str3 = "3 ";

		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println("to".concat(" aaa"));
		
		
		int n = 4;
		for (int i = 0; i <= n; i++)		
		System.out.println(str1.charAt(i));
		
		System.out.println(str1.contains("niet"));
		if (str1.contains("ie"))
				System.out.println("małpa");
		
		System.out.println(str1.endsWith("zdanie "));
		
		System.out.println(str1.startsWith("To"));
		
		
		System.out.println("1.  ______________ ");
		
		String s1 = "";
		String s2 = "kUrS";
		String s3 = new String("Kurs");
		String s4 = String.valueOf(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("2. ------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println("3. ------------");

		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		
		System.out.println("4. ------------");
		
		System.out.println(s1.isEmpty());
		System.out.println(str1.length());
		
		System.out.println("5. ------------");

//		System.out.println(str1 = str1.replace('t', 'U'));
		System.out.println(str1);
		
		
		System.out.println("6. ------------");
		
		int a = str1.length();
//		for (int i = 0; i <= a - 1; i++)
//			System.out.println(str1.charAt(i));	
		
		String nic = "";
		
		System.out.println(nic.isEmpty());
		
		System.out.println("7. ------------");
		
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(10, 15));

		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
	}
}
