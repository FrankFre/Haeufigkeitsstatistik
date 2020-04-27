import java.util.ArrayList;
import java.util.Arrays;

import mehr.Häufigkeitsstatistik;

public class Häufigkeit {

//Instanzvariable	
	private String text;
	private String temp;
	private int index, j;

	ArrayList<String> symbol = new ArrayList<String>();
	String[][] ausw = new String[2][100];

//Konstruktor mit einem Parameter
	public Häufigkeit(String text) {
		this.text = text;
	}

//Instanzmethoden
	public void ermittleSym(String text) {
		temp = "";
		index = 0;

		// Einlesen in ArrayList
		while (index < text.length()) {

			while (index < text.length() && text.charAt(index) != ' ') {
				temp = temp + text.charAt(index);
				index++;
			}

			symbol.add(temp);
			temp = "";
			index++;
		}

		// Einlesen in 2-dimensionales Array
		for (int i = 0; i < symbol.size(); i++) {

			for (j = 0; j < symbol.size(); j++) {

				// gleiches Symbol
				if (symbol.get(i).equals(ausw[0][j])) {

//					ausw[1][j] = String.valueOf(Integer.valueOf(ausw[1][j]) + 1);
					anzerh(j);
					break;

					// leerer Eintrag
				} else if (ausw[0][j] == null) {
					ausw[0][j] = symbol.get(i);
					ausw[1][j] = "1";
					break;
				}
			}
		}
	}

	public void anzerh(int j) {

		ausw[1][j] = String.valueOf(Integer.valueOf(ausw[1][j]) + 1);
	}

	public void ausgabeHäufig() {

		int x = 0;

		while (ausw[0][x] != null) {
			System.out.print(ausw[0][x]);
			
			for (int i = 0; i < (12 - ausw[0][x].length()); i++) {
				System.out.print(" ");
				}
			
			System.out.println(ausw[1][x]);
			x++;
		}
	}

	public String getText() {
		return text;
	}

}
