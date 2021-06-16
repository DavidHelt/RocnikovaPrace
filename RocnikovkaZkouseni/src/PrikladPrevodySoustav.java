
public class PrikladPrevodySoustav {

	final int hodnota;
	final String hodnotaDesitkova;
	final String hodnotaDvojkova;
	final String hodnotaSestnactkova;
	int indexPrvniSoustava;
	int indexDruhaSoustava;
	final String prvniSoustavaString;
	final String druhaSoustavaString;
	String prvniSoustava;
	public String vysledek;

	public PrikladPrevodySoustav(int okrajovaHodnota) {

		this.hodnota = Math.abs(Nastroje.generujCislo(okrajovaHodnota));
		this.hodnotaDesitkova = String.valueOf(this.hodnota);
		this.hodnotaDvojkova = Integer.toBinaryString(this.hodnota);
		this.hodnotaSestnactkova = Integer.toHexString(this.hodnota);
		nastavIndexSoustav();
		this.prvniSoustavaString = generujStringSoustavy(indexPrvniSoustava);
		this.druhaSoustavaString = generujStringSoustavy(indexDruhaSoustava);
		nastavPrvniSoustavu(indexPrvniSoustava);
		vypoctiPriklad(indexDruhaSoustava);

	}

	public void nastavIndexSoustav() {

		int cislo = Nastroje.generujCislo(1, 3);
		int cislo2 = cislo;
		while (cislo == cislo2) {
			cislo2 = Nastroje.generujCislo(1, 3);
		}
		this.indexPrvniSoustava = cislo;
		this.indexDruhaSoustava = cislo2;
	}

	public String generujStringSoustavy(int cislo) {
		switch (cislo) {
		case 1:
			return "dvojkove";
		case 2:
			return "desitkove";
		case 3:
			return "sestnactkove";
		default:
			System.out.println("Neplatny nazev soustavy");
			return "";
		}
	}

	public void vypoctiPriklad(int cislo) {
		switch (cislo) {
		case 1:
			setVysledek(this.hodnotaDvojkova);
			break;
		case 2:
			setVysledek(this.hodnotaDesitkova);
			break;
		case 3:
			setVysledek(this.hodnotaSestnactkova);
			break;
		default:
			System.out.println("Neplatna hodnota soustavy pro vysledek");

		}

	}

	public void setVysledek(String vysledek) {
		this.vysledek = vysledek;
	}

	public String getVysledek() {
		return vysledek;
	}

	public void nastavPrvniSoustavu(int cislo) {
		switch (cislo) {
		case 1:
			this.prvniSoustava = this.hodnotaDvojkova;
			break;
		case 2:
			this.prvniSoustava = this.hodnotaDesitkova;
			break;
		case 3:
			this.prvniSoustava = this.hodnotaSestnactkova;
			break;
		default:
			System.out.println("Neplatna hodnota soustavy pro vysledek");
		}
	}

	@Override
	public String toString() {
		return String.format("Preved hodnotu %s z %s soustavy do %s soustavy", this.prvniSoustava,
				this.prvniSoustavaString, this.druhaSoustavaString);
	}
}
