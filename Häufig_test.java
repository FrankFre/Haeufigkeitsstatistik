
import java.util.Scanner;

public class Häufig_test {

	public static void main(String[] args) {

		// Instanzvariable
	String text = "";

	Scanner sc = new Scanner(System.in);
	
	Häufigkeit hf = new Häufigkeit(text);

	System.out.println("java Wortstatistik:");
	text = sc.nextLine();

	hf.ermittleSym(text);

	hf.ausgabeHäufig();

	sc.close();

	}

}
