
public class Zkouseni {

	public static void main(String[] args) {
		
		int pocetSpravnychOdpovedi = 0;

		System.out.println("Zkouseni z matematiky...");
		System.out.println("Zvolte zpusob zkouseni.");
		System.out.println("1 - Scitani, odcitani, nasobeni a deleni celych cisel");
		System.out.println("2 - Scitani, odcitani, nasobeni a deleni zlomku");
		System.out.println("3 - Prevody mezi ciselnymi soustavami (2, 10, 16)");

		int druhPrikladu = Nastroje.ctiZKonzole();

		System.out.println("Zvolte obtiznost. U pøevodù je interval vždy kladný");
		System.out.println("1 - Cisla <-10, 10>");
		System.out.println("2 - Cisla <-100,100>");

		int obtiznostPrikladu = Nastroje.ctiZKonzole();

		System.out.println("Zvolte pocet prikladu.");
		int pocetPrikladu = Nastroje.ctiZKonzole();

		for (int i = 0; i < pocetPrikladu; i++) {
			String vysledek;
			try {
				vysledek = Nastroje.generujPriklad(druhPrikladu, obtiznostPrikladu);
			} catch (Exception e) {
				vysledek = Nastroje.generujPriklad(druhPrikladu, obtiznostPrikladu);
			}

			System.out.println("Zadej vysledek");
			String odpoved = Nastroje.ctiString();
			if (vysledek.equalsIgnoreCase(odpoved)) {
				System.out.println("Spravna odpoved");
				pocetSpravnychOdpovedi++;
			} else if (odpoved == ".") {
				break;
			} else {
				System.out.println("Spatna odpoved. Spravna odpoved byla: " + vysledek + "\n");

			}
		}
		System.out.println("Pocet spravnych odpovedi: " + pocetSpravnychOdpovedi);
		Nastroje.zavriScanner();
	}
}