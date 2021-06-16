
public class PrikladZlomek {

	final int prvniCitatel;
	final int prvniJmenovatel;
	final int druhyCitatel;
	final int druhyJmenovatel;
	final int operator;
	private String vysledek;
	final String stringOperator;
	
	public PrikladZlomek(int prvniJmenovatel, int prvniCitatel, int operator, int druhyJmenovatel, int druhyCitatel) {
		this.prvniCitatel = prvniCitatel;
		this.prvniJmenovatel = prvniJmenovatel;
		this.druhyCitatel = druhyCitatel;
		this.druhyJmenovatel = druhyJmenovatel;
		this.operator = operator;
		this.stringOperator = generujStringOperator(operator);
		
		vypoctiZlomek(prvniCitatel,prvniJmenovatel,operator,druhyJmenovatel,druhyCitatel);
		
	}

	public static double roundAvoid(double okrajovaHodnota, int pozice) {
	    double scale = Math.pow(10, pozice);
	    return Math.round(okrajovaHodnota * scale) / scale;
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
	
	public void vypoctiZlomek(int prvniJmenovatel, int prvniCitatel, int operator, int druhyJmenovatel, int druhyCitatel)  {
		switch (operator) {
		case 1:
			setVysledek(prvniCitatel/prvniJmenovatel + druhyCitatel/druhyJmenovatel);
			break;
		case 2:
			setVysledek(prvniCitatel/prvniJmenovatel - druhyCitatel/druhyJmenovatel);
			break;
		case 3:
			setVysledek(prvniCitatel/prvniJmenovatel * druhyCitatel/druhyJmenovatel);
			break;
		case 4:
			setVysledek(prvniCitatel/prvniJmenovatel / druhyCitatel/druhyJmenovatel);
			break;
		}
		
	}
	
	public void setVysledek(int vysledek) {
		this.vysledek = Integer.toString(vysledek);
	}
	
	public String getVysledek() {
	    return this.vysledek;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d  %s  %d/%d = ???", this.prvniCitatel, this.prvniJmenovatel,this.stringOperator,  this.druhyCitatel, this.druhyJmenovatel);
	}


}	
	

