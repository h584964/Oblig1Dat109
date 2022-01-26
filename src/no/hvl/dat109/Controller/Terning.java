package no.hvl.dat109.Controller;

import java.util.Random;

/**
 * @author Johan og Jørgen
 * 
 */ 
public class Terning {
  private Random rand;

	    public Terning() {
	        rand = new Random();
	    }

	    public int trill() {
	        return rand.nextInt(6) + 1;
	    }
}
