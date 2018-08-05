package guess;

import java.util.Scanner;
import java.util.Random;

public class guess {
	public static int howMany = 0;

	public static void main(String[] args) {

		guess gue = new guess();
		gue.choice();

	}

	public void choice() {
		final int newGame = 1;
		final int exit = 0;

		int e = 0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("GRAMY ??? 1) NOWA GRA 0) EXIT? ");

			int choice = 2;
			choice = input.nextInt();

			switch (choice) {
			case newGame: {
				guess gue = new guess();

				gue.game();
				int howMany = getHowMany();
				System.out.println("póki co wygrane " + howMany);

				continue;

			}
			case exit: {
				e = e + 1;

			}
			}
		} while (e != 1);
		System.out.println("¿egnajjjjjjjjjjjj");
		System.out.println("Wygra³es ³¹cznie  : " + getHowMany() + "razy");
	}

	public void game() {
		Scanner input = new Scanner(System.in);
		int shot;
		Random rand = new Random();
		int draw = rand.nextInt(1);
		Boolean result = false;

		while (result != true) {
			System.out.println("Zgadnij liczbê od 0-1");
			shot = input.nextInt();

			if (shot == draw) {
				setHowMany(getHowMany() + 1);
				int won = getHowMany();
				System.out.println("Trafionnyyyyy");

				System.out.println("Liczba trafieñ to:  " + won);
				result = true;

			} else if (shot > draw) {
				System.out.println("za du¿oooo");
			} else if (shot < draw) {
				System.out.println("za ma³ooo");
			}
		}

	}

	public static int getHowMany() {
		return howMany;
	}

	public void setHowMany(int how) {
		this.howMany = how;
	}

}
