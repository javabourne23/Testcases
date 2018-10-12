
// Klasse zum Testen mit Junit

public class Hilfsklasse {
	int i = 4;
	String j = "Name";
	
	public static boolean istPrimzahl(int a){
		boolean b = true;
		for (int i=2; i<=a/2; i++){
			if (a%i==0) {
				System.out.println(a + " ist teilbar durch " + i);
				b=false;
				break;
			}
		}
		return b;
			
		
	}
	
	public static boolean istPrimzahl(long a){
		boolean b = true;
		for (long i=2L; i<=a/2; i++){
			if (a%i==0) {
				System.out.println(a + " ist teilbar durch " + i);
				b=false;
//				break;
			}
		}
		return b;
			
		
	}
	
	
	
	public static void main(String[] args){
		// Primzahl: 	999979		keine Primzahlen: 2047
		int i = 999979;
		
		System.out.println(istPrimzahl(i));
		
	}
}
