package mehr;
public class Häufigkeitsstatistik {

	// Attribute
	private static Häufigkeit[] häufig;

	public static String wort;
	public static String temp = "";
	private int anz;
	private static int wortnr = 0;
	static int index = 0;

	// Konstruktor
	public Häufigkeitsstatistik(String wort, int anz) {
		Häufigkeitsstatistik.wort = wort;
		this.anz = anz;
	}

	public Häufigkeitsstatistik(String[] args) {
		// TODO Auto-generated constructor stub
	}

	static String ermitAnzSymb(String text) {

		while (text.length() > index && text.charAt(index) != ' ') {

			temp = temp + text.charAt(index);
			index += 1;

			Häufigkeitsstatistik[] häufig = new Häufigkeitsstatistik[wortnr];

		}

//		häufig[wortnr].addWort(temp, 1);
		index += 1;

		System.out.println(temp);
		return temp;
	}

	private void addWort(String temp2, int i) {

		this.wort = temp2;
		this.anz = i;
		wortnr++;
	}

	public int getAnz() {
		return anz;
	}

	public void setAnz(int anz) {
		this.anz = anz;
	}

	public String getWort() {
		return wort;
	}

}
