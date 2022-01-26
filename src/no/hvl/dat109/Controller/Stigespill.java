package no.hvl.dat109.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Johan og Jørgen
 * 
 */ 

public class Stigespill {
  private Terning terning;
	private List<Brikke> brikker;
	private Brett brett;

	public Stigespill() {
		brikker = new ArrayList<Brikke>(2);
		Brikke nyBrikke = new Brikke("Blå");
		Brikke nyBrikke1 = new Brikke("Grønn");

		brikker.add(nyBrikke);
		brikker.add(nyBrikke1);

		brett = new Brett(100);

		terning = new Terning();
	}

	/**
	 * Spiller en runde i stigspillet
	 */

	public void spill() {
		boolean vunnet = false;
		while (!vunnet) {

			for (Brikke brikke : brikker) {
				trekk(brikke);

				if (brikke.getRutenr() >= 100) {
					vunnet = true;

					System.out.println(brikke.getFarge() + " brikke vant!");
				}

			}
		}

		// for alle spillerne, gjÃ¸r trekk
	}

	private void trekk(Brikke brikke) {
    int verdi = 0;
    int antallseksere = 0;
		do {
      //trille terning og flytte
      verdi = terning.trill();
      if (verdi == 6)
        antallseksere++;
      System.out.println(brikke.getFarge() + " brikke trillet: " + verdi);
       
      //Hvis antallseksere == 3, flytt til 1
       if (antallseksere == 3) {
         System.out.println("Ånei, 3 seksere betyr tilbake til start");
         brikke.setRutenr(1);
       }
       else {

       
          brikke.flytt(verdi);
          System.out.println(brikke.getFarge() + " brikke landet på rute: " + brikke.getRutenr());

          //Sjekke om stige/slange
          brikke.setRutenr(brett.spesRuteverdi(brikke.getRutenr()));
       }
    }
    while (verdi == 6 && antallseksere < 3);
    //Så lenge terning == 6, og mindre enn 3 seksere
	}
}
