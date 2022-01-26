package no.hvl.dat109.Controller;

/**
 * @author Johan og Jørgen
 * 
 */ 

public class Brikke {

	private String farge;
	private int rutenr;

  /**
   * 
   * @param farge til brikken
   */

	public Brikke(String farge) {
		this.farge = farge;
		rutenr = 1;
	
	}
  /**
   * 
   * @param verdi brikken får etter å ha trillet.
   * Brettet er 100 ruter så verdien kan ikke gå over. 
   */
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

 
  
}
