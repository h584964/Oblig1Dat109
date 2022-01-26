package no.hvl.dat109.Controller;

import java.util.Random;

/**
 * @author Johan og Jørgen
 * 
 */ 
public class Terning {
  private Random rand;
      /**
       * Terning er random
       */
	    public Terning() {
	        rand = new Random();
	    }
      /**
       * 
       * @return random verdi 1-6
       */
	    public int trill() {
	        return rand.nextInt(6) + 1;
	    }
}
