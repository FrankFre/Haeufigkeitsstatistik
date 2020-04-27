package mehr;

import java.util.ArrayList;
import java.util.Scanner;

public class Häufigkeit {

	String temp;
		


	public static void main(String[] args) {
		
		
		System.out.println(java.util.Arrays.toString(args));

		Scanner text = new Scanner(System.in);
		
		ArrayList<String> textarr = new ArrayList<String>();
				
				
		
		Häufigkeitsstatistik häufig = new Häufigkeitsstatistik(args);
//			
//		System.out.println("Java Wortstatistik");
//		
		
//		while(text.hasNext())  {
//			textarr.add(text.next());
//			
//		}
//		
//		System.out.println(textarr.toString());
		
//		String text1 = text.next();
//			
//		Häufigkeitsstatistik.ermitAnzSymb(text1);
//		

	}




}


//  1. Eingabe des Strings
//	2. Bestätigung mit Enter / Ctrl-D
//  3. Ermittlung des ersten Worts durch Leerzeichenerkennung
//  4. Eintrag 1. Wort mit Anz 1
//  5. Ermittlung des nächsten Worts
//  6. Vergleich mit gespeicherten Worten: wenn ja, Anz++
//  7. wenn nein, neuer Eintrag
//  8. Abbruch am String-Ende
//	9. Ausgabe Wort-Statistik durch Iteration durch Array-List 
