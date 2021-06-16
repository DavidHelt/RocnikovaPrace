
public class Priklad {
	final int prvniHodnota;
	final int druhaHodnota;
	final int operator;
	private String vysledek;
	final String stringOperator;
	
	public Priklad (int num_1, int num_2, int operator) {
		this.prvniHodnota = num_1;
		this.druhaHodnota = num_2;
		this.operator = operator;
		this.stringOperator = generujStringOperator(operator);
		vypoctiPriklad(num_1, num_2, operator);
	}
	
	public String generujStringOperator(int operator) {
		switch (operator) {
		case 1:
			return "+";
		case 2:
			return "-";
		case 3:
			return "*";
		case 4:
			return "/";
		}
		return stringOperator;
		
	}
	
	private void vypoctiPriklad(int num_1, int num_2, int operator)  {
		switch (operator) {
		case 1:
			setVysledek(num_1 + num_2);
			break;
		case 2:
			setVysledek(num_1 - num_2);
			break;
		case 3:
			setVysledek(num_1 * num_2);
			break;
		case 4:
			setVysledek(num_1 / num_2);
			break;
		}
		
	}
	
	public void setVysledek(int vysledek) {
		
		this.vysledek = Integer.toString(vysledek);
	}
	
	public String getVysledek() {
		return vysledek;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %d = ???", this.prvniHodnota, this.stringOperator, this.druhaHodnota);
	}
}