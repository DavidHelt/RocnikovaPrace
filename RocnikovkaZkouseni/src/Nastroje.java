
import java.util.Scanner;

public class Nastroje {
	private static Scanner scanner = new Scanner(System.in);

	public static int ctiZKonzole() {
		int s = Nastroje.scanner.nextInt();
		return s;
	}

	public static String ctiString() {
		String s = Nastroje.scanner.next();
		return s;
	}

	public static void zavriScanner() {
		Nastroje.scanner.close();
	}

	public static int generujCislo(int minimum, int maximum) {
		return (int) Math.floor(Math.random() * (maximum - minimum + 1) + minimum);
	}

	public static int generujCislo(int okrajovaHodnota) {
		return generujCislo(-okrajovaHodnota, okrajovaHodnota);
	}

	public static int generujNenuloveCislo(int okrajovaHodnota) {
		int cislo = generujCislo(-okrajovaHodnota, okrajovaHodnota);
		if (cislo == 0) {
			throw new ArithmeticException("Dìlení nulou");

		}
		return cislo;
	}

	public static String generujPriklad(int druhPrikladu, int obtiznostPrikladu) {
		int okrajovaHodnota = (int) (Math.pow(10, obtiznostPrikladu));
		int operator = Nastroje.generujCislo(1, 4);
		int prvniCitatel = Nastroje.generujCislo(okrajovaHodnota);

		int prvniJmenovatel = Nastroje.generujNenuloveCislo(okrajovaHodnota);
		int druhyCitatel = Nastroje.generujNenuloveCislo(okrajovaHodnota);
		int druhyJmenovatel = Nastroje.generujNenuloveCislo(okrajovaHodnota);

		switch (druhPrikladu) {
		case 1:
			Priklad priklad = new Priklad(prvniCitatel, prvniJmenovatel, operator);
			System.out.println(priklad);
			return priklad.getVysledek();
		case 2:
			PrikladZlomek zlomek = new PrikladZlomek(prvniCitatel, prvniJmenovatel, operator, druhyCitatel,
					druhyJmenovatel);
			System.out.println(zlomek);
			return zlomek.getVysledek();
		case 3:
			PrikladPrevodySoustav prevody = new PrikladPrevodySoustav(okrajovaHodnota);
			System.out.println(prevody);
			return prevody.getVysledek();

		}
		return ".";

	}
}
