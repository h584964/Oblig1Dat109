package no.hvl.dat109.Controller;

/**
 * @author Johan og Jørgen
 * 
 */ 

public class Brikke {

	private String farge;
	private int rutenr;


	public Brikke(String farge) {
		this.farge = farge;
		rutenr = 1;
	
	}
  public void flytt(int verdi){
    if((rutenr + verdi) <= 100)
    rutenr += verdi;
  }

	public String getFarge() {
		return farge;
	}

	public int getRutenr() {
		return rutenr;
	}

	public void setRutenr(int rutenr) {
		this.rutenr = rutenr;
	}

  /* public void flytt(int terningVerdi) {
		if ((rutenr + terningVerdi) <= 100) {
			rutenr += terningVerdi;

			// Sjekke om brikke landet pÃ¥ stige/slange
			int nyverdi = brett.spesRuteverdi(rutenr);
			if (nyverdi > 0) {
				rutenr = nyverdi;
			}
		}
	} */

}
