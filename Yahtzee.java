import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welkom bij Yathzee, wat is uw naam?");
		String naamIn = scanner.nextLine();
		System.out.println("Hey " + naamIn + (", laten we beginnen met spelen!"));
		YahtzeeSpel yathzee = new YahtzeeSpel();
		yathzee.Spelen();
		yathzee.werpen();
		
		
	}
}

class YahtzeeSpel{
	void Spelen() {
		Scanner scanner = new Scanner(System.in);
		String ingegevene = scanner.nextLine();
		while (ingegevene.equals("")) {
			System.out.println("Het spel is gestart");
			break;
		}
		while (ingegevene.equals("q")) {
			System.out.println("Het spel is gestopt");
			break;
		}
	}
		int werpen(){
			int dobbel;
			Random random = new Random(); 
			dobbel = random.nextInt(6)+1;
			System.out.println(dobbel);
			return dobbel; 
		}
	}
	