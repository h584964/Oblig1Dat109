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

  /**
   *  Dekalerer objektvariabler til stigespillet
   */

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

  /**
   * 
   * @param brikke 
   * Gjør et trekk med brikke som paramenter (et trekk kan involvere flere trill av terning)
   * 
   */

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
         System.out.println("Ånei, " + brikke.getFarge() + " trillet 3 seksere på rad og må flytte til 1");
         brikke.setRutenr(1);
       }
       else {

       
          brikke.flytt(verdi);
          int rute = brikke.getRutenr();
          System.out.println(brikke.getFarge() + " brikke landet på rute: " + rute);

          //Sjekke om stige/slange
          int stigeslange = brett.spesRuteverdi(rute);
          if (stigeslange > rute) {
            System.out.println(brikke.getFarge() + " brikke landet på en stige og går til rute" + stigeslange);
            brikke.setRutenr(stigeslange);
          }
          else if (stigeslange < rute) {
            System.out.println("Der var det en slange, " + brikke.getFarge() + " flytter til rute " + stigeslange);
            brikke.setRutenr(stigeslange);
          }
          }
    }
    while (verdi == 6 && antallseksere < 3);
    //Så lenge terning == 6, og mindre enn 3 seksere
	}
}
